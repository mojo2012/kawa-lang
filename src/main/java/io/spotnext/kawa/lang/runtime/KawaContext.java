package io.spotnext.kawa.lang.runtime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.Env;
import com.oracle.truffle.api.dsl.NodeFactory;
import com.oracle.truffle.api.instrumentation.AllocationReporter;
import com.oracle.truffle.api.object.Layout;
import com.oracle.truffle.api.object.Shape;

import io.spotnext.kawa.KawaLanguage;
import io.spotnext.kawa.lang.nodes.builtins.BuiltinNode;

public class KawaContext {
	static final Layout LAYOUT = Layout.createLayout();

	private final Env env;
	private final BufferedReader input;
	private final PrintWriter output;
	// private final SLFunctionRegistry functionRegistry;
	private final Shape emptyShape;
	private final KawaLanguage language;
	private final AllocationReporter allocationReporter;
	// private final Iterable<Scope> topScopes; // Cache the top scopes

	public KawaContext(KawaLanguage language, TruffleLanguage.Env env,
			List<NodeFactory<? extends BuiltinNode>> externalBuiltins) {
		this.env = env;
		this.input = new BufferedReader(new InputStreamReader(env.in()));
		this.output = new PrintWriter(env.out(), true);
		this.language = language;
		this.allocationReporter = env.lookup(AllocationReporter.class);
		// this.functionRegistry = new SLFunctionRegistry(language);
		// this.topScopes = Collections
		// 		.singleton(Scope.newBuilder("global", functionRegistry.getFunctionsObject()).build());
		// installBuiltins();
		// for (NodeFactory<? extends SLBuiltinNode> builtin : externalBuiltins) {
		// 	installBuiltin(builtin);
		// }
		this.emptyShape = LAYOUT.createShape(KawaObjectType.SINGLETON);
	}

	public static boolean isKawaObject(Object value) {
		/*
		 * LAYOUT.getType() returns a concrete implementation class, i.e., a class that
		 * is more precise than the base class DynamicObject. This makes the type check
		 * faster.
		 */
		return LAYOUT.getType().isInstance(value)
				&& LAYOUT.getType().cast(value).getShape().getObjectType() == KawaObjectType.SINGLETON;
	}
}