// Generated from /Users/matthias.fuchs.lokal/Projekte/privat/kawa-lang/src/main/java/io/spotnext/kawa/lang/Kawa.g4 by ANTLR 4.7.1
package io.spotnext.kawa.lang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KawaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NULL_LITERAL=5, STRING_LITERAL=6, NUMERIC_LITERAL=7, 
		HEX_NUMERIC_LITERAL=8, BOOLEAN_LITERAL=9, PACKAGE=10, CLASS=11, INTERFACE=12, 
		ENUM=13, STRUCT=14, VARIABLE=15, FINAL_VARIABLE=16, TYPE_DECLARATION=17, 
		CAST=18, THROW=19, THROWS=20, RETURN=21, IF=22, ELSE=23, WHILE=24, FOR=25, 
		FOREACH=26, CONTINUE=27, BREAK=28, YIELD=29, TRY=30, CATCH=31, SWITCH=32, 
		CASE=33, IMPLEMENTS=34, EXTENDS=35, PRIVATE=36, PROTECTED=37, ABSTRACT=38, 
		DEFAULT=39, ASYNC=40, STATIC=41, SYNCHRONIZED=42, IS=43, NOT=44, NEGATE=45, 
		ASSIGN=46, EQUALS=47, NOT_EQUALS=48, NOT_EQUALS_LT_GT=49, LIKE=50, NOT_LIKE=51, 
		GREATER_THAN=52, GREATER_THAN_OR_EQUAL=53, LESS_THAN=54, LESS_THAN_OR_EQUAL=55, 
		OR=56, OR_BINARY=57, AND=58, AND_BINARY=59, ADD=60, SUBTRACT=61, DIVIDE=62, 
		MULTIPLY=63, MODULUS=64, INCREMET=65, DECREMENT=66, INCREMENT_AND_ASSIGN=67, 
		DECREMENT_AND_ASSIGN=68, MULTIPLY_AND_ASSIGN=69, DIVIDE_AND_ASSIGN=70, 
		MODULUS_AND_ASSIGN=71, IDENTIFIER=72, BLOCK_COMMENT=73, LINE_COMMENT=74, 
		WHITESPACE=75;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "AS", "LETTER", "STRING_CHAR", "NON_ZERO_DIGIT", 
		"DIGIT", "HEX_DIGIT", "OCT_DIGIT", "BINARY_DIGIT", "BOOLEAN", "TAB", "NEWLINE", 
		"PLUS", "MINUS", "EQUAL", "NULL_LITERAL", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"HEX_NUMERIC_LITERAL", "BOOLEAN_LITERAL", "PACKAGE", "CLASS", "INTERFACE", 
		"ENUM", "STRUCT", "VARIABLE", "FINAL_VARIABLE", "TYPE_DECLARATION", "CAST", 
		"THROW", "THROWS", "RETURN", "IF", "ELSE", "WHILE", "FOR", "FOREACH", 
		"CONTINUE", "BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", 
		"EXTENDS", "PRIVATE", "PROTECTED", "ABSTRACT", "DEFAULT", "ASYNC", "STATIC", 
		"SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", "EQUALS", "NOT_EQUALS", 
		"NOT_EQUALS_LT_GT", "LIKE", "NOT_LIKE", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", 
		"LESS_THAN", "LESS_THAN_OR_EQUAL", "OR", "OR_BINARY", "AND", "AND_BINARY", 
		"ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", "MODULUS", "INCREMET", "DECREMENT", 
		"INCREMENT_AND_ASSIGN", "DECREMENT_AND_ASSIGN", "MULTIPLY_AND_ASSIGN", 
		"DIVIDE_AND_ASSIGN", "MODULUS_AND_ASSIGN", "IDENTIFIER", "BLOCK_COMMENT", 
		"LINE_COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'null'", null, null, null, null, "'package'", 
		"'class'", "'interface'", "'enum'", "'struct'", "'var'", "'let'", null, 
		null, "'throw'", "'throws'", "'return'", "'if'", "'else'", "'while'", 
		"'for'", "'foreach'", "'continue'", "'break'", "'yield'", "'try'", "'catch'", 
		"'switch'", "'case'", "'implements'", "'extends'", "'private'", "'protected'", 
		"'abstract'", "'default'", "'async'", "'static'", "'synchronized'", "'is'", 
		"'not'", "'!'", null, null, null, "'<>'", "'~'", "'!~'", "'>'", "'>='", 
		"'<'", "'<='", "'|'", "'||'", "'&'", "'&&'", null, null, "'/'", "'*'", 
		"'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NULL_LITERAL", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"HEX_NUMERIC_LITERAL", "BOOLEAN_LITERAL", "PACKAGE", "CLASS", "INTERFACE", 
		"ENUM", "STRUCT", "VARIABLE", "FINAL_VARIABLE", "TYPE_DECLARATION", "CAST", 
		"THROW", "THROWS", "RETURN", "IF", "ELSE", "WHILE", "FOR", "FOREACH", 
		"CONTINUE", "BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", 
		"EXTENDS", "PRIVATE", "PROTECTED", "ABSTRACT", "DEFAULT", "ASYNC", "STATIC", 
		"SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", "EQUALS", "NOT_EQUALS", 
		"NOT_EQUALS_LT_GT", "LIKE", "NOT_LIKE", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", 
		"LESS_THAN", "LESS_THAN_OR_EQUAL", "OR", "OR_BINARY", "AND", "AND_BINARY", 
		"ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", "MODULUS", "INCREMET", "DECREMENT", 
		"INCREMENT_AND_ASSIGN", "DECREMENT_AND_ASSIGN", "MULTIPLY_AND_ASSIGN", 
		"DIVIDE_AND_ASSIGN", "MODULUS_AND_ASSIGN", "IDENTIFIER", "BLOCK_COMMENT", 
		"LINE_COMMENT", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public KawaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kawa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u0255\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\5\7\u00c2\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\5\13\u00cb\n"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00da\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\7\25\u00ed\n\25\f\25\16\25\u00f0\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\7\26\u00f7\n\26\f\26\16\26\u00fa\13\26\5\26\u00fc"+
		"\n\26\3\27\3\27\3\27\3\27\7\27\u0102\n\27\f\27\16\27\u0105\13\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3B\3B\3B\3C\3C\3D\3D\3"+
		"D\3E\3E\3F\3F\3F\3G\3G\3H\3H\3H\3I\3I\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3"+
		"N\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3"+
		"V\3W\3W\3W\7W\u0231\nW\fW\16W\u0234\13W\3X\3X\3X\3X\7X\u023a\nX\fX\16"+
		"X\u023d\13X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\7Y\u0248\nY\fY\16Y\u024b\13Y\3"+
		"Y\3Y\3Z\6Z\u0250\nZ\rZ\16Z\u0251\3Z\3Z\3\u023b\2[\3\3\5\4\7\5\t\6\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\7)\b+\t-"+
		"\n/\13\61\f\63\r\65\16\67\179\20;\21=\22?\23A\24C\25E\26G\27I\30K\31M"+
		"\32O\33Q\34S\35U\36W\37Y [!]\"_#a$c%e&g\'i(k)m*o+q,s-u.w/y\60{\61}\62"+
		"\177\63\u0081\64\u0083\65\u0085\66\u0087\67\u00898\u008b9\u008d:\u008f"+
		";\u0091<\u0093=\u0095>\u0097?\u0099@\u009bA\u009dB\u009fC\u00a1D\u00a3"+
		"E\u00a5F\u00a7G\u00a9H\u00abI\u00adJ\u00afK\u00b1L\u00b3M\3\2\n\6\2&&"+
		"C\\aac|\6\2\f\f\17\17$$^^\3\2\63;\3\2\62;\5\2\62;CHch\3\2\629\4\2\f\f"+
		"\17\17\5\2\13\f\16\17\"\"\2\u0250\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\3\u00b5\3\2\2\2\5\u00b7\3\2\2\2\7\u00b9\3\2\2\2\t\u00bb"+
		"\3\2\2\2\13\u00bd\3\2\2\2\r\u00c1\3\2\2\2\17\u00c3\3\2\2\2\21\u00c5\3"+
		"\2\2\2\23\u00c7\3\2\2\2\25\u00ca\3\2\2\2\27\u00cc\3\2\2\2\31\u00ce\3\2"+
		"\2\2\33\u00d9\3\2\2\2\35\u00db\3\2\2\2\37\u00dd\3\2\2\2!\u00df\3\2\2\2"+
		"#\u00e1\3\2\2\2%\u00e3\3\2\2\2\'\u00e5\3\2\2\2)\u00ea\3\2\2\2+\u00fb\3"+
		"\2\2\2-\u00fd\3\2\2\2/\u0106\3\2\2\2\61\u0108\3\2\2\2\63\u0110\3\2\2\2"+
		"\65\u0116\3\2\2\2\67\u0120\3\2\2\29\u0125\3\2\2\2;\u012c\3\2\2\2=\u0130"+
		"\3\2\2\2?\u0134\3\2\2\2A\u0136\3\2\2\2C\u0138\3\2\2\2E\u013e\3\2\2\2G"+
		"\u0145\3\2\2\2I\u014c\3\2\2\2K\u014f\3\2\2\2M\u0154\3\2\2\2O\u015a\3\2"+
		"\2\2Q\u015e\3\2\2\2S\u0166\3\2\2\2U\u016f\3\2\2\2W\u0175\3\2\2\2Y\u017b"+
		"\3\2\2\2[\u017f\3\2\2\2]\u0185\3\2\2\2_\u018c\3\2\2\2a\u0191\3\2\2\2c"+
		"\u019c\3\2\2\2e\u01a4\3\2\2\2g\u01ac\3\2\2\2i\u01b6\3\2\2\2k\u01bf\3\2"+
		"\2\2m\u01c7\3\2\2\2o\u01cd\3\2\2\2q\u01d4\3\2\2\2s\u01e1\3\2\2\2u\u01e4"+
		"\3\2\2\2w\u01e8\3\2\2\2y\u01ea\3\2\2\2{\u01ec\3\2\2\2}\u01ef\3\2\2\2\177"+
		"\u01f2\3\2\2\2\u0081\u01f5\3\2\2\2\u0083\u01f7\3\2\2\2\u0085\u01fa\3\2"+
		"\2\2\u0087\u01fc\3\2\2\2\u0089\u01ff\3\2\2\2\u008b\u0201\3\2\2\2\u008d"+
		"\u0204\3\2\2\2\u008f\u0206\3\2\2\2\u0091\u0209\3\2\2\2\u0093\u020b\3\2"+
		"\2\2\u0095\u020e\3\2\2\2\u0097\u0210\3\2\2\2\u0099\u0212\3\2\2\2\u009b"+
		"\u0214\3\2\2\2\u009d\u0216\3\2\2\2\u009f\u0218\3\2\2\2\u00a1\u021b\3\2"+
		"\2\2\u00a3\u021e\3\2\2\2\u00a5\u0221\3\2\2\2\u00a7\u0224\3\2\2\2\u00a9"+
		"\u0227\3\2\2\2\u00ab\u022a\3\2\2\2\u00ad\u022d\3\2\2\2\u00af\u0235\3\2"+
		"\2\2\u00b1\u0243\3\2\2\2\u00b3\u024f\3\2\2\2\u00b5\u00b6\7}\2\2\u00b6"+
		"\4\3\2\2\2\u00b7\u00b8\7\177\2\2\u00b8\6\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba"+
		"\b\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc\n\3\2\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\f\3\2\2\2\u00c0\u00c2\t\2\2\2\u00c1\u00c0\3\2\2\2"+
		"\u00c2\16\3\2\2\2\u00c3\u00c4\n\3\2\2\u00c4\20\3\2\2\2\u00c5\u00c6\t\4"+
		"\2\2\u00c6\22\3\2\2\2\u00c7\u00c8\t\5\2\2\u00c8\24\3\2\2\2\u00c9\u00cb"+
		"\t\6\2\2\u00ca\u00c9\3\2\2\2\u00cb\26\3\2\2\2\u00cc\u00cd\t\7\2\2\u00cd"+
		"\30\3\2\2\2\u00ce\u00cf\4\62\63\2\u00cf\32\3\2\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3\u00da\7g\2\2\u00d4\u00d5"+
		"\7h\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00da\7g\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\34\3\2\2\2"+
		"\u00db\u00dc\7\13\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7\f\2\2\u00de \3\2"+
		"\2\2\u00df\u00e0\7-\2\2\u00e0\"\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2$\3\2"+
		"\2\2\u00e3\u00e4\7?\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7"+
		"\7w\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7n\2\2\u00e9(\3\2\2\2\u00ea\u00ee"+
		"\7$\2\2\u00eb\u00ed\5\17\b\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\7$\2\2\u00f2*\3\2\2\2\u00f3\u00fc\7\62\2\2\u00f4\u00f8"+
		"\5\21\t\2\u00f5\u00f7\5\23\n\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fc,\3\2\2\2\u00fd"+
		"\u00fe\7\62\2\2\u00fe\u00ff\7z\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\5\25"+
		"\13\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104.\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5\33\16"+
		"\2\u0107\60\3\2\2\2\u0108\u0109\7r\2\2\u0109\u010a\7c\2\2\u010a\u010b"+
		"\7e\2\2\u010b\u010c\7m\2\2\u010c\u010d\7c\2\2\u010d\u010e\7i\2\2\u010e"+
		"\u010f\7g\2\2\u010f\62\3\2\2\2\u0110\u0111\7e\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7u\2\2\u0114\u0115\7u\2\2\u0115\64\3\2\2\2\u0116"+
		"\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118\u0119\7v\2\2\u0119\u011a\7g\2\2"+
		"\u011a\u011b\7t\2\2\u011b\u011c\7h\2\2\u011c\u011d\7c\2\2\u011d\u011e"+
		"\7e\2\2\u011e\u011f\7g\2\2\u011f\66\3\2\2\2\u0120\u0121\7g\2\2\u0121\u0122"+
		"\7p\2\2\u0122\u0123\7w\2\2\u0123\u0124\7o\2\2\u01248\3\2\2\2\u0125\u0126"+
		"\7u\2\2\u0126\u0127\7v\2\2\u0127\u0128\7t\2\2\u0128\u0129\7w\2\2\u0129"+
		"\u012a\7e\2\2\u012a\u012b\7v\2\2\u012b:\3\2\2\2\u012c\u012d\7x\2\2\u012d"+
		"\u012e\7c\2\2\u012e\u012f\7t\2\2\u012f<\3\2\2\2\u0130\u0131\7n\2\2\u0131"+
		"\u0132\7g\2\2\u0132\u0133\7v\2\2\u0133>\3\2\2\2\u0134\u0135\5\13\6\2\u0135"+
		"@\3\2\2\2\u0136\u0137\5\13\6\2\u0137B\3\2\2\2\u0138\u0139\7v\2\2\u0139"+
		"\u013a\7j\2\2\u013a\u013b\7t\2\2\u013b\u013c\7q\2\2\u013c\u013d\7y\2\2"+
		"\u013dD\3\2\2\2\u013e\u013f\7v\2\2\u013f\u0140\7j\2\2\u0140\u0141\7t\2"+
		"\2\u0141\u0142\7q\2\2\u0142\u0143\7y\2\2\u0143\u0144\7u\2\2\u0144F\3\2"+
		"\2\2\u0145\u0146\7t\2\2\u0146\u0147\7g\2\2\u0147\u0148\7v\2\2\u0148\u0149"+
		"\7w\2\2\u0149\u014a\7t\2\2\u014a\u014b\7p\2\2\u014bH\3\2\2\2\u014c\u014d"+
		"\7k\2\2\u014d\u014e\7h\2\2\u014eJ\3\2\2\2\u014f\u0150\7g\2\2\u0150\u0151"+
		"\7n\2\2\u0151\u0152\7u\2\2\u0152\u0153\7g\2\2\u0153L\3\2\2\2\u0154\u0155"+
		"\7y\2\2\u0155\u0156\7j\2\2\u0156\u0157\7k\2\2\u0157\u0158\7n\2\2\u0158"+
		"\u0159\7g\2\2\u0159N\3\2\2\2\u015a\u015b\7h\2\2\u015b\u015c\7q\2\2\u015c"+
		"\u015d\7t\2\2\u015dP\3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160\7q\2\2\u0160"+
		"\u0161\7t\2\2\u0161\u0162\7g\2\2\u0162\u0163\7c\2\2\u0163\u0164\7e\2\2"+
		"\u0164\u0165\7j\2\2\u0165R\3\2\2\2\u0166\u0167\7e\2\2\u0167\u0168\7q\2"+
		"\2\u0168\u0169\7p\2\2\u0169\u016a\7v\2\2\u016a\u016b\7k\2\2\u016b\u016c"+
		"\7p\2\2\u016c\u016d\7w\2\2\u016d\u016e\7g\2\2\u016eT\3\2\2\2\u016f\u0170"+
		"\7d\2\2\u0170\u0171\7t\2\2\u0171\u0172\7g\2\2\u0172\u0173\7c\2\2\u0173"+
		"\u0174\7m\2\2\u0174V\3\2\2\2\u0175\u0176\7{\2\2\u0176\u0177\7k\2\2\u0177"+
		"\u0178\7g\2\2\u0178\u0179\7n\2\2\u0179\u017a\7f\2\2\u017aX\3\2\2\2\u017b"+
		"\u017c\7v\2\2\u017c\u017d\7t\2\2\u017d\u017e\7{\2\2\u017eZ\3\2\2\2\u017f"+
		"\u0180\7e\2\2\u0180\u0181\7c\2\2\u0181\u0182\7v\2\2\u0182\u0183\7e\2\2"+
		"\u0183\u0184\7j\2\2\u0184\\\3\2\2\2\u0185\u0186\7u\2\2\u0186\u0187\7y"+
		"\2\2\u0187\u0188\7k\2\2\u0188\u0189\7v\2\2\u0189\u018a\7e\2\2\u018a\u018b"+
		"\7j\2\2\u018b^\3\2\2\2\u018c\u018d\7e\2\2\u018d\u018e\7c\2\2\u018e\u018f"+
		"\7u\2\2\u018f\u0190\7g\2\2\u0190`\3\2\2\2\u0191\u0192\7k\2\2\u0192\u0193"+
		"\7o\2\2\u0193\u0194\7r\2\2\u0194\u0195\7n\2\2\u0195\u0196\7g\2\2\u0196"+
		"\u0197\7o\2\2\u0197\u0198\7g\2\2\u0198\u0199\7p\2\2\u0199\u019a\7v\2\2"+
		"\u019a\u019b\7u\2\2\u019bb\3\2\2\2\u019c\u019d\7g\2\2\u019d\u019e\7z\2"+
		"\2\u019e\u019f\7v\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2"+
		"\7f\2\2\u01a2\u01a3\7u\2\2\u01a3d\3\2\2\2\u01a4\u01a5\7r\2\2\u01a5\u01a6"+
		"\7t\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7x\2\2\u01a8\u01a9\7c\2\2\u01a9"+
		"\u01aa\7v\2\2\u01aa\u01ab\7g\2\2\u01abf\3\2\2\2\u01ac\u01ad\7r\2\2\u01ad"+
		"\u01ae\7t\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7g\2\2"+
		"\u01b1\u01b2\7e\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5"+
		"\7f\2\2\u01b5h\3\2\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7d\2\2\u01b8\u01b9"+
		"\7u\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7c\2\2\u01bc"+
		"\u01bd\7e\2\2\u01bd\u01be\7v\2\2\u01bej\3\2\2\2\u01bf\u01c0\7f\2\2\u01c0"+
		"\u01c1\7g\2\2\u01c1\u01c2\7h\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7w\2\2"+
		"\u01c4\u01c5\7n\2\2\u01c5\u01c6\7v\2\2\u01c6l\3\2\2\2\u01c7\u01c8\7c\2"+
		"\2\u01c8\u01c9\7u\2\2\u01c9\u01ca\7{\2\2\u01ca\u01cb\7p\2\2\u01cb\u01cc"+
		"\7e\2\2\u01ccn\3\2\2\2\u01cd\u01ce\7u\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0"+
		"\7c\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7e\2\2\u01d3"+
		"p\3\2\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7{\2\2\u01d6\u01d7\7p\2\2\u01d7"+
		"\u01d8\7e\2\2\u01d8\u01d9\7j\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7q\2\2"+
		"\u01db\u01dc\7p\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7|\2\2\u01de\u01df"+
		"\7g\2\2\u01df\u01e0\7f\2\2\u01e0r\3\2\2\2\u01e1\u01e2\7k\2\2\u01e2\u01e3"+
		"\7u\2\2\u01e3t\3\2\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7q\2\2\u01e6\u01e7"+
		"\7v\2\2\u01e7v\3\2\2\2\u01e8\u01e9\7#\2\2\u01e9x\3\2\2\2\u01ea\u01eb\5"+
		"%\23\2\u01ebz\3\2\2\2\u01ec\u01ed\5%\23\2\u01ed\u01ee\5%\23\2\u01ee|\3"+
		"\2\2\2\u01ef\u01f0\5w<\2\u01f0\u01f1\5%\23\2\u01f1~\3\2\2\2\u01f2\u01f3"+
		"\7>\2\2\u01f3\u01f4\7@\2\2\u01f4\u0080\3\2\2\2\u01f5\u01f6\7\u0080\2\2"+
		"\u01f6\u0082\3\2\2\2\u01f7\u01f8\7#\2\2\u01f8\u01f9\7\u0080\2\2\u01f9"+
		"\u0084\3\2\2\2\u01fa\u01fb\7@\2\2\u01fb\u0086\3\2\2\2\u01fc\u01fd\7@\2"+
		"\2\u01fd\u01fe\7?\2\2\u01fe\u0088\3\2\2\2\u01ff\u0200\7>\2\2\u0200\u008a"+
		"\3\2\2\2\u0201\u0202\7>\2\2\u0202\u0203\7?\2\2\u0203\u008c\3\2\2\2\u0204"+
		"\u0205\7~\2\2\u0205\u008e\3\2\2\2\u0206\u0207\7~\2\2\u0207\u0208\7~\2"+
		"\2\u0208\u0090\3\2\2\2\u0209\u020a\7(\2\2\u020a\u0092\3\2\2\2\u020b\u020c"+
		"\7(\2\2\u020c\u020d\7(\2\2\u020d\u0094\3\2\2\2\u020e\u020f\5!\21\2\u020f"+
		"\u0096\3\2\2\2\u0210\u0211\5#\22\2\u0211\u0098\3\2\2\2\u0212\u0213\7\61"+
		"\2\2\u0213\u009a\3\2\2\2\u0214\u0215\7,\2\2\u0215\u009c\3\2\2\2\u0216"+
		"\u0217\7\'\2\2\u0217\u009e\3\2\2\2\u0218\u0219\5!\21\2\u0219\u021a\5!"+
		"\21\2\u021a\u00a0\3\2\2\2\u021b\u021c\5#\22\2\u021c\u021d\5#\22\2\u021d"+
		"\u00a2\3\2\2\2\u021e\u021f\5%\23\2\u021f\u0220\5!\21\2\u0220\u00a4\3\2"+
		"\2\2\u0221\u0222\5%\23\2\u0222\u0223\5#\22\2\u0223\u00a6\3\2\2\2\u0224"+
		"\u0225\5%\23\2\u0225\u0226\5\u009bN\2\u0226\u00a8\3\2\2\2\u0227\u0228"+
		"\5%\23\2\u0228\u0229\5\u0099M\2\u0229\u00aa\3\2\2\2\u022a\u022b\5%\23"+
		"\2\u022b\u022c\5\u009dO\2\u022c\u00ac\3\2\2\2\u022d\u0232\5\r\7\2\u022e"+
		"\u0231\5\r\7\2\u022f\u0231\5\23\n\2\u0230\u022e\3\2\2\2\u0230\u022f\3"+
		"\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u00ae\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7\61\2\2\u0236\u0237\7"+
		",\2\2\u0237\u023b\3\2\2\2\u0238\u023a\13\2\2\2\u0239\u0238\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7,\2\2\u023f\u0240\7\61\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0242\bX\2\2\u0242\u00b0\3\2\2\2\u0243\u0244\7\61"+
		"\2\2\u0244\u0245\7\61\2\2\u0245\u0249\3\2\2\2\u0246\u0248\n\b\2\2\u0247"+
		"\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\bY\2\2\u024d"+
		"\u00b2\3\2\2\2\u024e\u0250\t\t\2\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\bZ\2\2\u0254\u00b4\3\2\2\2\17\2\u00c1\u00ca\u00d9\u00ee\u00f8\u00fb"+
		"\u0103\u0230\u0232\u023b\u0249\u0251\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}