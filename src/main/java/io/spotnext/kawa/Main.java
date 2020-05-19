package io.spotnext.kawa;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.spotnext.kawa.lang.listeneres.KWErrorListener;
import io.spotnext.kawa.lang.listeneres.KWParseListener;
import io.spotnext.kawa.lang.parser.KawaLexer;
import io.spotnext.kawa.lang.parser.KawaParser;

public class Main {
	public static void main(final String[] args) throws Exception {
		try {
			final var lexer = new KawaLexer(CharStreams.fromFileName("src/test/kawa/BasicTest.kawa"));
			final var tokenStream = new CommonTokenStream(lexer);
			final var parser = new KawaParser(tokenStream);
			parser.setBuildParseTree(true);

			final var listener = new KWParseListener();
			final var errorListener = new KWErrorListener();

			parser.addErrorListener(errorListener);
			parser.addParseListener(listener);
			parser.compilationUnit();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}