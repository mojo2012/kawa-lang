// Generated from /Users/matthias/Projekte/kawa-lang/src/main/java/io/spotnext/kawa/lang/Kawa.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OPTIONAL=9, 
		OF_OERATOR=10, ARRAY_EMPTY=11, DOT_OPERATOR=12, DOT_DOT_OPERATOR=13, OPTIONAL_DOT_OPERATOR=14, 
		BOOLEAN_LITERAL=15, NULL_LITERAL=16, STRING_LITERAL=17, INTEGER_LITERAL=18, 
		LONG_LITERAL=19, FLOAT_LITERAL=20, DOUBLE_LITERAL=21, HEX_NUMERIC_LITERAL=22, 
		PACKAGE=23, CLASS=24, INTERFACE=25, ENUM=26, STRUCT=27, ANNOTATION=28, 
		VARIABLE=29, FINAL_VARIABLE=30, METHOD=31, AS=32, THROW=33, THROWS=34, 
		RETURN=35, IMPORT=36, THIS=37, SUPER=38, IF=39, ELSE=40, WHILE=41, FOR=42, 
		FOREACH=43, CONTINUE=44, BREAK=45, YIELD=46, TRY=47, CATCH=48, SWITCH=49, 
		CASE=50, IMPLEMENTS=51, EXTENDS=52, PRIVATE=53, PROTECTED=54, PUBLIC=55, 
		NATIVE=56, VOLATILE=57, ABSTRACT=58, DEFAULT=59, ASYNC=60, STATIC=61, 
		SYNCHRONIZED=62, IS=63, NOT=64, NEGATE=65, ASSIGN=66, EQUALS=67, NOT_EQUALS=68, 
		NOT_EQUALS_LT_GT=69, LIKE=70, NOT_LIKE=71, GREATER_THAN=72, GREATER_THAN_OR_EQUAL=73, 
		LESS_THAN=74, LESS_THAN_OR_EQUAL=75, OR=76, OR_BINARY=77, AND=78, AND_BINARY=79, 
		ADD=80, SUBTRACT=81, DIVIDE=82, MULTIPLY=83, MODULUS=84, INCREMET=85, 
		DECREMENT=86, INCREMENT_AND_ASSIGN=87, DECREMENT_AND_ASSIGN=88, MULTIPLY_AND_ASSIGN=89, 
		DIVIDE_AND_ASSIGN=90, MODULUS_AND_ASSIGN=91, IDENTIFIER=92, BLOCK_COMMENT=93, 
		LINE_COMMENT=94, WHITESPACE=95;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "BINARY_DIGIT", 
		"BOOLEAN", "TAB", "NEWLINE", "PLUS", "MINUS", "EQUAL", "NON_ZERO_DIGIT", 
		"DIGIT", "HEX_DIGIT", "OCT_DIGIT", "LETTER", "STRING_CHAR", "QUESTION_MARK", 
		"SEMI_COLON", "COLON", "DOT", "COMMA", "UNDERSCORE", "OPTIONAL", "OF_OERATOR", 
		"ARRAY_EMPTY", "DOT_OPERATOR", "DOT_DOT_OPERATOR", "OPTIONAL_DOT_OPERATOR", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "INTEGER_LITERAL", 
		"LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", "HEX_NUMERIC_LITERAL", 
		"PACKAGE", "CLASS", "INTERFACE", "ENUM", "STRUCT", "ANNOTATION", "VARIABLE", 
		"FINAL_VARIABLE", "METHOD", "AS", "THROW", "THROWS", "RETURN", "IMPORT", 
		"THIS", "SUPER", "IF", "ELSE", "WHILE", "FOR", "FOREACH", "CONTINUE", 
		"BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", "EXTENDS", 
		"PRIVATE", "PROTECTED", "PUBLIC", "NATIVE", "VOLATILE", "ABSTRACT", "DEFAULT", 
		"ASYNC", "STATIC", "SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", "EQUALS", 
		"NOT_EQUALS", "NOT_EQUALS_LT_GT", "LIKE", "NOT_LIKE", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUAL", "LESS_THAN", "LESS_THAN_OR_EQUAL", "OR", "OR_BINARY", 
		"AND", "AND_BINARY", "ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", "MODULUS", 
		"INCREMET", "DECREMENT", "INCREMENT_AND_ASSIGN", "DECREMENT_AND_ASSIGN", 
		"MULTIPLY_AND_ASSIGN", "DIVIDE_AND_ASSIGN", "MODULUS_AND_ASSIGN", "IDENTIFIER", 
		"BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "'('", "')'", "';'", "'['", "']'", null, null, 
		"'[]'", null, null, null, null, "'null'", null, null, null, null, null, 
		null, "'package'", "'class'", "'interface'", "'enum'", "'struct'", "'annotation'", 
		"'var'", null, "'def'", "'as'", "'throw'", "'throws'", "'return'", "'import'", 
		"'this'", "'super'", "'if'", "'else'", "'while'", "'for'", "'foreach'", 
		"'continue'", "'break'", "'yield'", "'try'", "'catch'", "'switch'", "'case'", 
		"'implements'", "'extends'", "'@private'", "'@protected'", "'@public'", 
		"'@native'", "'@volatile'", "'@abstract'", "'@default'", "'@async'", "'@static'", 
		"'@synchronized'", "'is'", "'not'", "'!'", null, null, null, "'<>'", "'~'", 
		"'!~'", "'>'", "'>='", "'<'", "'<='", "'|'", "'||'", "'&'", "'&&'", null, 
		null, "'/'", "'*'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "OPTIONAL", "OF_OERATOR", 
		"ARRAY_EMPTY", "DOT_OPERATOR", "DOT_DOT_OPERATOR", "OPTIONAL_DOT_OPERATOR", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "INTEGER_LITERAL", 
		"LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", "HEX_NUMERIC_LITERAL", 
		"PACKAGE", "CLASS", "INTERFACE", "ENUM", "STRUCT", "ANNOTATION", "VARIABLE", 
		"FINAL_VARIABLE", "METHOD", "AS", "THROW", "THROWS", "RETURN", "IMPORT", 
		"THIS", "SUPER", "IF", "ELSE", "WHILE", "FOR", "FOREACH", "CONTINUE", 
		"BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", "EXTENDS", 
		"PRIVATE", "PROTECTED", "PUBLIC", "NATIVE", "VOLATILE", "ABSTRACT", "DEFAULT", 
		"ASYNC", "STATIC", "SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", "EQUALS", 
		"NOT_EQUALS", "NOT_EQUALS_LT_GT", "LIKE", "NOT_LIKE", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUAL", "LESS_THAN", "LESS_THAN_OR_EQUAL", "OR", "OR_BINARY", 
		"AND", "AND_BINARY", "ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", "MODULUS", 
		"INCREMET", "DECREMENT", "INCREMENT_AND_ASSIGN", "DECREMENT_AND_ASSIGN", 
		"MULTIPLY_AND_ASSIGN", "DIVIDE_AND_ASSIGN", "MODULUS_AND_ASSIGN", "IDENTIFIER", 
		"BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2a\u0303\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0103\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23\u0114\n\23\3\24\3\24"+
		"\3\25\5\25\u0119\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\7%\u0141\n%\f%\16%\u0144\13%"+
		"\3%\3%\3&\3&\3&\7&\u014b\n&\f&\16&\u014e\13&\5&\u0150\n&\3\'\3\'\3\'\3"+
		"(\3(\3(\7(\u0158\n(\f(\16(\u015b\13(\5(\u015d\n(\3(\3(\7(\u0161\n(\f("+
		"\16(\u0164\13(\3)\3)\3)\3*\3*\3*\3*\7*\u016d\n*\f*\16*\u0170\13*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u01ab\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3"+
		"T\3T\3T\3T\3U\3U\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3\\\3"+
		"\\\3]\3]\3]\3^\3^\3_\3_\3_\3`\3`\3a\3a\3a\3b\3b\3c\3c\3c\3d\3d\3e\3e\3"+
		"f\3f\3g\3g\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\3k\3l\3l\3l\3m\3m\3m\3n\3n\3"+
		"n\3o\3o\3o\3p\3p\3p\7p\u02df\np\fp\16p\u02e2\13p\3q\3q\3q\3q\7q\u02e8"+
		"\nq\fq\16q\u02eb\13q\3q\3q\3q\3q\3q\3r\3r\3r\3r\7r\u02f6\nr\fr\16r\u02f9"+
		"\13r\3r\3r\3s\6s\u02fe\ns\rs\16s\u02ff\3s\3s\3\u02e9\2t\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2"+
		")\2+\2-\2/\2\61\2\63\2\65\2\67\29\13;\f=\r?\16A\17C\20E\21G\22I\23K\24"+
		"M\25O\26Q\27S\30U\31W\32Y\33[\34]\35_\36a\37c e!g\"i#k$m%o&q\'s(u)w*y"+
		"+{,}-\177.\u0081/\u0083\60\u0085\61\u0087\62\u0089\63\u008b\64\u008d\65"+
		"\u008f\66\u0091\67\u00938\u00959\u0097:\u0099;\u009b<\u009d=\u009f>\u00a1"+
		"?\u00a3@\u00a5A\u00a7B\u00a9C\u00abD\u00adE\u00afF\u00b1G\u00b3H\u00b5"+
		"I\u00b7J\u00b9K\u00bbL\u00bdM\u00bfN\u00c1O\u00c3P\u00c5Q\u00c7R\u00c9"+
		"S\u00cbT\u00cdU\u00cfV\u00d1W\u00d3X\u00d5Y\u00d7Z\u00d9[\u00db\\\u00dd"+
		"]\u00df^\u00e1_\u00e3`\u00e5a\3\2\n\3\2\63;\3\2\62;\5\2\62;CHch\3\2\62"+
		"9\6\2&&C\\aac|\6\2\f\f\17\17$$^^\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2\u02fd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\3\u00e7\3\2\2\2\5\u00e9\3\2\2\2\7\u00eb"+
		"\3\2\2\2\t\u00ed\3\2\2\2\13\u00ef\3\2\2\2\r\u00f1\3\2\2\2\17\u00f3\3\2"+
		"\2\2\21\u00f5\3\2\2\2\23\u00f7\3\2\2\2\25\u0102\3\2\2\2\27\u0104\3\2\2"+
		"\2\31\u0106\3\2\2\2\33\u0108\3\2\2\2\35\u010a\3\2\2\2\37\u010c\3\2\2\2"+
		"!\u010e\3\2\2\2#\u0110\3\2\2\2%\u0113\3\2\2\2\'\u0115\3\2\2\2)\u0118\3"+
		"\2\2\2+\u011a\3\2\2\2-\u011c\3\2\2\2/\u011e\3\2\2\2\61\u0120\3\2\2\2\63"+
		"\u0122\3\2\2\2\65\u0124\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2\2\2;\u012a"+
		"\3\2\2\2=\u012c\3\2\2\2?\u012f\3\2\2\2A\u0131\3\2\2\2C\u0134\3\2\2\2E"+
		"\u0137\3\2\2\2G\u0139\3\2\2\2I\u013e\3\2\2\2K\u014f\3\2\2\2M\u0151\3\2"+
		"\2\2O\u015c\3\2\2\2Q\u0165\3\2\2\2S\u0168\3\2\2\2U\u0171\3\2\2\2W\u0179"+
		"\3\2\2\2Y\u017f\3\2\2\2[\u0189\3\2\2\2]\u018e\3\2\2\2_\u0195\3\2\2\2a"+
		"\u01a0\3\2\2\2c\u01aa\3\2\2\2e\u01ac\3\2\2\2g\u01b0\3\2\2\2i\u01b3\3\2"+
		"\2\2k\u01b9\3\2\2\2m\u01c0\3\2\2\2o\u01c7\3\2\2\2q\u01ce\3\2\2\2s\u01d3"+
		"\3\2\2\2u\u01d9\3\2\2\2w\u01dc\3\2\2\2y\u01e1\3\2\2\2{\u01e7\3\2\2\2}"+
		"\u01eb\3\2\2\2\177\u01f3\3\2\2\2\u0081\u01fc\3\2\2\2\u0083\u0202\3\2\2"+
		"\2\u0085\u0208\3\2\2\2\u0087\u020c\3\2\2\2\u0089\u0212\3\2\2\2\u008b\u0219"+
		"\3\2\2\2\u008d\u021e\3\2\2\2\u008f\u0229\3\2\2\2\u0091\u0231\3\2\2\2\u0093"+
		"\u023a\3\2\2\2\u0095\u0245\3\2\2\2\u0097\u024d\3\2\2\2\u0099\u0255\3\2"+
		"\2\2\u009b\u025f\3\2\2\2\u009d\u0269\3\2\2\2\u009f\u0272\3\2\2\2\u00a1"+
		"\u0279\3\2\2\2\u00a3\u0281\3\2\2\2\u00a5\u028f\3\2\2\2\u00a7\u0292\3\2"+
		"\2\2\u00a9\u0296\3\2\2\2\u00ab\u0298\3\2\2\2\u00ad\u029a\3\2\2\2\u00af"+
		"\u029d\3\2\2\2\u00b1\u02a0\3\2\2\2\u00b3\u02a3\3\2\2\2\u00b5\u02a5\3\2"+
		"\2\2\u00b7\u02a8\3\2\2\2\u00b9\u02aa\3\2\2\2\u00bb\u02ad\3\2\2\2\u00bd"+
		"\u02af\3\2\2\2\u00bf\u02b2\3\2\2\2\u00c1\u02b4\3\2\2\2\u00c3\u02b7\3\2"+
		"\2\2\u00c5\u02b9\3\2\2\2\u00c7\u02bc\3\2\2\2\u00c9\u02be\3\2\2\2\u00cb"+
		"\u02c0\3\2\2\2\u00cd\u02c2\3\2\2\2\u00cf\u02c4\3\2\2\2\u00d1\u02c6\3\2"+
		"\2\2\u00d3\u02c9\3\2\2\2\u00d5\u02cc\3\2\2\2\u00d7\u02cf\3\2\2\2\u00d9"+
		"\u02d2\3\2\2\2\u00db\u02d5\3\2\2\2\u00dd\u02d8\3\2\2\2\u00df\u02db\3\2"+
		"\2\2\u00e1\u02e3\3\2\2\2\u00e3\u02f1\3\2\2\2\u00e5\u02fd\3\2\2\2\u00e7"+
		"\u00e8\7}\2\2\u00e8\4\3\2\2\2\u00e9\u00ea\7\177\2\2\u00ea\6\3\2\2\2\u00eb"+
		"\u00ec\7.\2\2\u00ec\b\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee\n\3\2\2\2\u00ef"+
		"\u00f0\7+\2\2\u00f0\f\3\2\2\2\u00f1\u00f2\7=\2\2\u00f2\16\3\2\2\2\u00f3"+
		"\u00f4\7]\2\2\u00f4\20\3\2\2\2\u00f5\u00f6\7_\2\2\u00f6\22\3\2\2\2\u00f7"+
		"\u00f8\4\62\63\2\u00f8\24\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7t\2"+
		"\2\u00fb\u00fc\7w\2\2\u00fc\u0103\7g\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff"+
		"\7c\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7u\2\2\u0101\u0103\7g\2\2\u0102"+
		"\u00f9\3\2\2\2\u0102\u00fd\3\2\2\2\u0103\26\3\2\2\2\u0104\u0105\7\13\2"+
		"\2\u0105\30\3\2\2\2\u0106\u0107\7\f\2\2\u0107\32\3\2\2\2\u0108\u0109\7"+
		"-\2\2\u0109\34\3\2\2\2\u010a\u010b\7/\2\2\u010b\36\3\2\2\2\u010c\u010d"+
		"\7?\2\2\u010d \3\2\2\2\u010e\u010f\t\2\2\2\u010f\"\3\2\2\2\u0110\u0111"+
		"\t\3\2\2\u0111$\3\2\2\2\u0112\u0114\t\4\2\2\u0113\u0112\3\2\2\2\u0114"+
		"&\3\2\2\2\u0115\u0116\t\5\2\2\u0116(\3\2\2\2\u0117\u0119\t\6\2\2\u0118"+
		"\u0117\3\2\2\2\u0119*\3\2\2\2\u011a\u011b\n\7\2\2\u011b,\3\2\2\2\u011c"+
		"\u011d\7A\2\2\u011d.\3\2\2\2\u011e\u011f\7=\2\2\u011f\60\3\2\2\2\u0120"+
		"\u0121\7<\2\2\u0121\62\3\2\2\2\u0122\u0123\7\60\2\2\u0123\64\3\2\2\2\u0124"+
		"\u0125\7.\2\2\u0125\66\3\2\2\2\u0126\u0127\7a\2\2\u01278\3\2\2\2\u0128"+
		"\u0129\5-\27\2\u0129:\3\2\2\2\u012a\u012b\5\61\31\2\u012b<\3\2\2\2\u012c"+
		"\u012d\7]\2\2\u012d\u012e\7_\2\2\u012e>\3\2\2\2\u012f\u0130\5\63\32\2"+
		"\u0130@\3\2\2\2\u0131\u0132\5\63\32\2\u0132\u0133\5\63\32\2\u0133B\3\2"+
		"\2\2\u0134\u0135\59\35\2\u0135\u0136\5\63\32\2\u0136D\3\2\2\2\u0137\u0138"+
		"\5\25\13\2\u0138F\3\2\2\2\u0139\u013a\7p\2\2\u013a\u013b\7w\2\2\u013b"+
		"\u013c\7n\2\2\u013c\u013d\7n\2\2\u013dH\3\2\2\2\u013e\u0142\7$\2\2\u013f"+
		"\u0141\5+\26\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\7$\2\2\u0146J\3\2\2\2\u0147\u0150\7\62\2\2\u0148\u014c\5!\21\2"+
		"\u0149\u014b\5#\22\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0147\3\2\2\2\u014f\u0148\3\2\2\2\u0150L\3\2\2\2\u0151\u0152\5K&\2\u0152"+
		"\u0153\7n\2\2\u0153N\3\2\2\2\u0154\u015d\7\62\2\2\u0155\u0159\5!\21\2"+
		"\u0156\u0158\5#\22\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0154\3\2\2\2\u015c\u0155\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0162\5\63"+
		"\32\2\u015f\u0161\5#\22\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163P\3\2\2\2\u0164\u0162\3\2\2\2"+
		"\u0165\u0166\5O(\2\u0166\u0167\7f\2\2\u0167R\3\2\2\2\u0168\u0169\7\62"+
		"\2\2\u0169\u016a\7z\2\2\u016a\u016e\3\2\2\2\u016b\u016d\5%\23\2\u016c"+
		"\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016fT\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7r\2\2\u0172\u0173"+
		"\7c\2\2\u0173\u0174\7e\2\2\u0174\u0175\7m\2\2\u0175\u0176\7c\2\2\u0176"+
		"\u0177\7i\2\2\u0177\u0178\7g\2\2\u0178V\3\2\2\2\u0179\u017a\7e\2\2\u017a"+
		"\u017b\7n\2\2\u017b\u017c\7c\2\2\u017c\u017d\7u\2\2\u017d\u017e\7u\2\2"+
		"\u017eX\3\2\2\2\u017f\u0180\7k\2\2\u0180\u0181\7p\2\2\u0181\u0182\7v\2"+
		"\2\u0182\u0183\7g\2\2\u0183\u0184\7t\2\2\u0184\u0185\7h\2\2\u0185\u0186"+
		"\7c\2\2\u0186\u0187\7e\2\2\u0187\u0188\7g\2\2\u0188Z\3\2\2\2\u0189\u018a"+
		"\7g\2\2\u018a\u018b\7p\2\2\u018b\u018c\7w\2\2\u018c\u018d\7o\2\2\u018d"+
		"\\\3\2\2\2\u018e\u018f\7u\2\2\u018f\u0190\7v\2\2\u0190\u0191\7t\2\2\u0191"+
		"\u0192\7w\2\2\u0192\u0193\7e\2\2\u0193\u0194\7v\2\2\u0194^\3\2\2\2\u0195"+
		"\u0196\7c\2\2\u0196\u0197\7p\2\2\u0197\u0198\7p\2\2\u0198\u0199\7q\2\2"+
		"\u0199\u019a\7v\2\2\u019a\u019b\7c\2\2\u019b\u019c\7v\2\2\u019c\u019d"+
		"\7k\2\2\u019d\u019e\7q\2\2\u019e\u019f\7p\2\2\u019f`\3\2\2\2\u01a0\u01a1"+
		"\7x\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7t\2\2\u01a3b\3\2\2\2\u01a4\u01a5"+
		"\7n\2\2\u01a5\u01a6\7g\2\2\u01a6\u01ab\7v\2\2\u01a7\u01a8\7x\2\2\u01a8"+
		"\u01a9\7c\2\2\u01a9\u01ab\7n\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01a7\3\2\2"+
		"\2\u01abd\3\2\2\2\u01ac\u01ad\7f\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7"+
		"h\2\2\u01aff\3\2\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7u\2\2\u01b2h\3\2"+
		"\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7j\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7"+
		"\7q\2\2\u01b7\u01b8\7y\2\2\u01b8j\3\2\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb"+
		"\7j\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7y\2\2\u01be"+
		"\u01bf\7u\2\2\u01bfl\3\2\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7g\2\2\u01c2"+
		"\u01c3\7v\2\2\u01c3\u01c4\7w\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6\7p\2\2"+
		"\u01c6n\3\2\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7o\2\2\u01c9\u01ca\7r\2"+
		"\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd\7v\2\2\u01cdp\3\2"+
		"\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7j\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2"+
		"\7u\2\2\u01d2r\3\2\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\7w\2\2\u01d5\u01d6"+
		"\7r\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7t\2\2\u01d8t\3\2\2\2\u01d9\u01da"+
		"\7k\2\2\u01da\u01db\7h\2\2\u01dbv\3\2\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de"+
		"\7n\2\2\u01de\u01df\7u\2\2\u01df\u01e0\7g\2\2\u01e0x\3\2\2\2\u01e1\u01e2"+
		"\7y\2\2\u01e2\u01e3\7j\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7n\2\2\u01e5"+
		"\u01e6\7g\2\2\u01e6z\3\2\2\2\u01e7\u01e8\7h\2\2\u01e8\u01e9\7q\2\2\u01e9"+
		"\u01ea\7t\2\2\u01ea|\3\2\2\2\u01eb\u01ec\7h\2\2\u01ec\u01ed\7q\2\2\u01ed"+
		"\u01ee\7t\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1\7e\2\2"+
		"\u01f1\u01f2\7j\2\2\u01f2~\3\2\2\2\u01f3\u01f4\7e\2\2\u01f4\u01f5\7q\2"+
		"\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7v\2\2\u01f7\u01f8\7k\2\2\u01f8\u01f9"+
		"\7p\2\2\u01f9\u01fa\7w\2\2\u01fa\u01fb\7g\2\2\u01fb\u0080\3\2\2\2\u01fc"+
		"\u01fd\7d\2\2\u01fd\u01fe\7t\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200\7c\2\2"+
		"\u0200\u0201\7m\2\2\u0201\u0082\3\2\2\2\u0202\u0203\7{\2\2\u0203\u0204"+
		"\7k\2\2\u0204\u0205\7g\2\2\u0205\u0206\7n\2\2\u0206\u0207\7f\2\2\u0207"+
		"\u0084\3\2\2\2\u0208\u0209\7v\2\2\u0209\u020a\7t\2\2\u020a\u020b\7{\2"+
		"\2\u020b\u0086\3\2\2\2\u020c\u020d\7e\2\2\u020d\u020e\7c\2\2\u020e\u020f"+
		"\7v\2\2\u020f\u0210\7e\2\2\u0210\u0211\7j\2\2\u0211\u0088\3\2\2\2\u0212"+
		"\u0213\7u\2\2\u0213\u0214\7y\2\2\u0214\u0215\7k\2\2\u0215\u0216\7v\2\2"+
		"\u0216\u0217\7e\2\2\u0217\u0218\7j\2\2\u0218\u008a\3\2\2\2\u0219\u021a"+
		"\7e\2\2\u021a\u021b\7c\2\2\u021b\u021c\7u\2\2\u021c\u021d\7g\2\2\u021d"+
		"\u008c\3\2\2\2\u021e\u021f\7k\2\2\u021f\u0220\7o\2\2\u0220\u0221\7r\2"+
		"\2\u0221\u0222\7n\2\2\u0222\u0223\7g\2\2\u0223\u0224\7o\2\2\u0224\u0225"+
		"\7g\2\2\u0225\u0226\7p\2\2\u0226\u0227\7v\2\2\u0227\u0228\7u\2\2\u0228"+
		"\u008e\3\2\2\2\u0229\u022a\7g\2\2\u022a\u022b\7z\2\2\u022b\u022c\7v\2"+
		"\2\u022c\u022d\7g\2\2\u022d\u022e\7p\2\2\u022e\u022f\7f\2\2\u022f\u0230"+
		"\7u\2\2\u0230\u0090\3\2\2\2\u0231\u0232\7B\2\2\u0232\u0233\7r\2\2\u0233"+
		"\u0234\7t\2\2\u0234\u0235\7k\2\2\u0235\u0236\7x\2\2\u0236\u0237\7c\2\2"+
		"\u0237\u0238\7v\2\2\u0238\u0239\7g\2\2\u0239\u0092\3\2\2\2\u023a\u023b"+
		"\7B\2\2\u023b\u023c\7r\2\2\u023c\u023d\7t\2\2\u023d\u023e\7q\2\2\u023e"+
		"\u023f\7v\2\2\u023f\u0240\7g\2\2\u0240\u0241\7e\2\2\u0241\u0242\7v\2\2"+
		"\u0242\u0243\7g\2\2\u0243\u0244\7f\2\2\u0244\u0094\3\2\2\2\u0245\u0246"+
		"\7B\2\2\u0246\u0247\7r\2\2\u0247\u0248\7w\2\2\u0248\u0249\7d\2\2\u0249"+
		"\u024a\7n\2\2\u024a\u024b\7k\2\2\u024b\u024c\7e\2\2\u024c\u0096\3\2\2"+
		"\2\u024d\u024e\7B\2\2\u024e\u024f\7p\2\2\u024f\u0250\7c\2\2\u0250\u0251"+
		"\7v\2\2\u0251\u0252\7k\2\2\u0252\u0253\7x\2\2\u0253\u0254\7g\2\2\u0254"+
		"\u0098\3\2\2\2\u0255\u0256\7B\2\2\u0256\u0257\7x\2\2\u0257\u0258\7q\2"+
		"\2\u0258\u0259\7n\2\2\u0259\u025a\7c\2\2\u025a\u025b\7v\2\2\u025b\u025c"+
		"\7k\2\2\u025c\u025d\7n\2\2\u025d\u025e\7g\2\2\u025e\u009a\3\2\2\2\u025f"+
		"\u0260\7B\2\2\u0260\u0261\7c\2\2\u0261\u0262\7d\2\2\u0262\u0263\7u\2\2"+
		"\u0263\u0264\7v\2\2\u0264\u0265\7t\2\2\u0265\u0266\7c\2\2\u0266\u0267"+
		"\7e\2\2\u0267\u0268\7v\2\2\u0268\u009c\3\2\2\2\u0269\u026a\7B\2\2\u026a"+
		"\u026b\7f\2\2\u026b\u026c\7g\2\2\u026c\u026d\7h\2\2\u026d\u026e\7c\2\2"+
		"\u026e\u026f\7w\2\2\u026f\u0270\7n\2\2\u0270\u0271\7v\2\2\u0271\u009e"+
		"\3\2\2\2\u0272\u0273\7B\2\2\u0273\u0274\7c\2\2\u0274\u0275\7u\2\2\u0275"+
		"\u0276\7{\2\2\u0276\u0277\7p\2\2\u0277\u0278\7e\2\2\u0278\u00a0\3\2\2"+
		"\2\u0279\u027a\7B\2\2\u027a\u027b\7u\2\2\u027b\u027c\7v\2\2\u027c\u027d"+
		"\7c\2\2\u027d\u027e\7v\2\2\u027e\u027f\7k\2\2\u027f\u0280\7e\2\2\u0280"+
		"\u00a2\3\2\2\2\u0281\u0282\7B\2\2\u0282\u0283\7u\2\2\u0283\u0284\7{\2"+
		"\2\u0284\u0285\7p\2\2\u0285\u0286\7e\2\2\u0286\u0287\7j\2\2\u0287\u0288"+
		"\7t\2\2\u0288\u0289\7q\2\2\u0289\u028a\7p\2\2\u028a\u028b\7k\2\2\u028b"+
		"\u028c\7|\2\2\u028c\u028d\7g\2\2\u028d\u028e\7f\2\2\u028e\u00a4\3\2\2"+
		"\2\u028f\u0290\7k\2\2\u0290\u0291\7u\2\2\u0291\u00a6\3\2\2\2\u0292\u0293"+
		"\7p\2\2\u0293\u0294\7q\2\2\u0294\u0295\7v\2\2\u0295\u00a8\3\2\2\2\u0296"+
		"\u0297\7#\2\2\u0297\u00aa\3\2\2\2\u0298\u0299\5\37\20\2\u0299\u00ac\3"+
		"\2\2\2\u029a\u029b\5\37\20\2\u029b\u029c\5\37\20\2\u029c\u00ae\3\2\2\2"+
		"\u029d\u029e\5\u00a9U\2\u029e\u029f\5\37\20\2\u029f\u00b0\3\2\2\2\u02a0"+
		"\u02a1\7>\2\2\u02a1\u02a2\7@\2\2\u02a2\u00b2\3\2\2\2\u02a3\u02a4\7\u0080"+
		"\2\2\u02a4\u00b4\3\2\2\2\u02a5\u02a6\7#\2\2\u02a6\u02a7\7\u0080\2\2\u02a7"+
		"\u00b6\3\2\2\2\u02a8\u02a9\7@\2\2\u02a9\u00b8\3\2\2\2\u02aa\u02ab\7@\2"+
		"\2\u02ab\u02ac\7?\2\2\u02ac\u00ba\3\2\2\2\u02ad\u02ae\7>\2\2\u02ae\u00bc"+
		"\3\2\2\2\u02af\u02b0\7>\2\2\u02b0\u02b1\7?\2\2\u02b1\u00be\3\2\2\2\u02b2"+
		"\u02b3\7~\2\2\u02b3\u00c0\3\2\2\2\u02b4\u02b5\7~\2\2\u02b5\u02b6\7~\2"+
		"\2\u02b6\u00c2\3\2\2\2\u02b7\u02b8\7(\2\2\u02b8\u00c4\3\2\2\2\u02b9\u02ba"+
		"\7(\2\2\u02ba\u02bb\7(\2\2\u02bb\u00c6\3\2\2\2\u02bc\u02bd\5\33\16\2\u02bd"+
		"\u00c8\3\2\2\2\u02be\u02bf\5\35\17\2\u02bf\u00ca\3\2\2\2\u02c0\u02c1\7"+
		"\61\2\2\u02c1\u00cc\3\2\2\2\u02c2\u02c3\7,\2\2\u02c3\u00ce\3\2\2\2\u02c4"+
		"\u02c5\7\'\2\2\u02c5\u00d0\3\2\2\2\u02c6\u02c7\5\33\16\2\u02c7\u02c8\5"+
		"\33\16\2\u02c8\u00d2\3\2\2\2\u02c9\u02ca\5\35\17\2\u02ca\u02cb\5\35\17"+
		"\2\u02cb\u00d4\3\2\2\2\u02cc\u02cd\5\37\20\2\u02cd\u02ce\5\33\16\2\u02ce"+
		"\u00d6\3\2\2\2\u02cf\u02d0\5\37\20\2\u02d0\u02d1\5\35\17\2\u02d1\u00d8"+
		"\3\2\2\2\u02d2\u02d3\5\37\20\2\u02d3\u02d4\5\u00cdg\2\u02d4\u00da\3\2"+
		"\2\2\u02d5\u02d6\5\37\20\2\u02d6\u02d7\5\u00cbf\2\u02d7\u00dc\3\2\2\2"+
		"\u02d8\u02d9\5\37\20\2\u02d9\u02da\5\u00cfh\2\u02da\u00de\3\2\2\2\u02db"+
		"\u02e0\5)\25\2\u02dc\u02df\5)\25\2\u02dd\u02df\5#\22\2\u02de\u02dc\3\2"+
		"\2\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u00e0\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\7\61"+
		"\2\2\u02e4\u02e5\7,\2\2\u02e5\u02e9\3\2\2\2\u02e6\u02e8\13\2\2\2\u02e7"+
		"\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02ea\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7,\2\2\u02ed"+
		"\u02ee\7\61\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\bq\2\2\u02f0\u00e2\3\2"+
		"\2\2\u02f1\u02f2\7\61\2\2\u02f2\u02f3\7\61\2\2\u02f3\u02f7\3\2\2\2\u02f4"+
		"\u02f6\n\b\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fb\br\2\2\u02fb\u00e4\3\2\2\2\u02fc\u02fe\t\t\2\2\u02fd\u02fc\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0302\bs\2\2\u0302\u00e6\3\2\2\2\23\2\u0102\u0113"+
		"\u0118\u0142\u014c\u014f\u0159\u015c\u0162\u016e\u01aa\u02de\u02e0\u02e9"+
		"\u02f7\u02ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}