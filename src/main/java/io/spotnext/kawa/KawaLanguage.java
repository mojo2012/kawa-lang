package io.spotnext.kawa;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextPolicy;
import com.oracle.truffle.api.debug.DebuggerTags;
import com.oracle.truffle.api.dsl.NodeFactory;
import com.oracle.truffle.api.instrumentation.ProvidedTags;
import com.oracle.truffle.api.instrumentation.StandardTags;
import com.oracle.truffle.api.interop.TruffleObject;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.PolyglotException;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import io.spotnext.kawa.lang.listeneres.KWErrorListener;
import io.spotnext.kawa.lang.listeneres.KWParseListener;
import io.spotnext.kawa.lang.nodes.KawaRootNode;
import io.spotnext.kawa.lang.nodes.builtins.BuiltinNode;
import io.spotnext.kawa.lang.parser.KawaLexer;
import io.spotnext.kawa.lang.parser.KawaParser;
import io.spotnext.kawa.lang.runtime.KawaContext;
import io.spotnext.kawa.lang.runtime.KawaObject;
import io.spotnext.kawa.util.Loggable;

@TruffleLanguage.Registration(id = KawaLanguage.ID, name = "Kawa", defaultMimeType = KawaLanguage.MIME_TYPE, characterMimeTypes = KawaLanguage.MIME_TYPE, contextPolicy = ContextPolicy.SHARED, fileTypeDetectors = KawaFileDetector.class)
@ProvidedTags({ StandardTags.CallTag.class, StandardTags.StatementTag.class, StandardTags.RootTag.class,
		StandardTags.RootBodyTag.class, StandardTags.ExpressionTag.class, DebuggerTags.AlwaysHalt.class,
		StandardTags.ReadVariableTag.class, StandardTags.WriteVariableTag.class })
public class KawaLanguage extends TruffleLanguage<KawaContext> implements Loggable {

	private static final String KAWA = "kawa";

	public static final String ID = "kawa";
	public static final String MIME_TYPE = "application/x-kawa";
	private static final List<NodeFactory<? extends BuiltinNode>> EXTERNAL_BUILTINS = Collections
			.synchronizedList(new ArrayList<>());

	private static Context context;

	@Override
	protected KawaContext createContext(Env env) {
		return new KawaContext(this, env, context, new ArrayList<>(EXTERNAL_BUILTINS));
	}

	@Override
	protected boolean isObjectOfLanguage(Object object) {
		if (!(object instanceof TruffleObject)) {
			return false;
		} else if (object instanceof KawaObject) {
			return true;
		} else if (KawaContext.isKawaObject(object)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected CallTarget parse(ParsingRequest request) throws Exception {
		final var lexer = new KawaLexer(CharStreams.fromString(request.getSource().getCharacters().toString()));
		final var tokenStream = new CommonTokenStream(lexer);
		final var parser = new KawaParser(tokenStream);
		parser.setBuildParseTree(true);

		final var listener = new KWParseListener();
		final var errorListener = new KWErrorListener();

		parser.addErrorListener(errorListener);
		parser.addParseListener(listener);

		final var compilationUnitContext = parser.compilationUnit();
		final var mainMethod = listener.getMainMethod();

		if (mainMethod.isPresent()) {
			// context.getBindings(KAWA).putMember("main", true);
			final var entryPoint = new KawaRootNode(this, mainMethod.get());
			return Truffle.getRuntime().createCallTarget(entryPoint);
		}

		throw new RuntimeException("Class contains no main method!");
	}

	/*
	 * Still necessary for the old SL TCK to pass. We should remove with the old
	 * TCK. New language should not override this.
	 */
	@SuppressWarnings("deprecation")
	@Override
	protected Object findExportedSymbol(KawaContext context, String globalName, boolean onlyExplicit) {
		return null;
	}

	public static void main(final String[] args) throws Exception {
		Source source;
		Map<String, String> options = new HashMap<>();
		String file = null;

		for (String arg : args) {
			file = arg;
		}

		if (file == null) {
			source = Source.newBuilder(KAWA, new InputStreamReader(System.in), "<stdin>").build();
		} else {
			source = Source.newBuilder(KAWA, new File(file)).build();
		}

		System.exit(executeSource(source, System.in, System.out, options));
	}

	private static int executeSource(Source source, InputStream in, PrintStream out, Map<String, String> options) {
		PrintStream err = System.err;

		try {
			context = Context.newBuilder(KAWA).in(in).out(out).options(options).build();
		} catch (IllegalArgumentException e) {
			err.println(e.getMessage());
			return 1;
		}

		out.println("== running on " + context.getEngine());

		try {
			Value result = context.eval(source);
			// if (context.getBindings(KAWA).getMember("main") == null) {
			// 	err.println("No main method defined in Kawa source file.");
			// 	return 1;
			// }
			// if (!result.isNull()) {
			// 	out.println(result.toString());
			// }
			return 0;
		} catch (PolyglotException ex) {
			if (ex.isInternalError()) {
				// for internal errors we print the full stack trace
				ex.printStackTrace();
			} else {
				err.println(ex.getMessage());
			}
			return 1;
		} finally {
			context.close();
		}
	}
}