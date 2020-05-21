package io.spotnext.kawa.lang.listeneres;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class KWErrorListener extends BaseErrorListener {
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {

		final String errorFormat = "There is an error in line %d, char %d: %s";
		final String errorMsg = String.format(errorFormat, line, charPositionInLine, msg);

		System.out.println(errorMsg);
	}
}