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
		OF_OERATOR=10, ARRAY_EMPTY=11, DOT_OPERATOR=12, BOOLEAN_LITERAL=13, NULL_LITERAL=14, 
		STRING_LITERAL=15, INTEGER_LITERAL=16, LONG_LITERAL=17, FLOAT_LITERAL=18, 
		DOUBLE_LITERAL=19, HEX_NUMERIC_LITERAL=20, PACKAGE=21, CLASS=22, INTERFACE=23, 
		ENUM=24, STRUCT=25, ANNOTATION=26, VARIABLE=27, FINAL_VARIABLE=28, METHOD=29, 
		AS=30, THROW=31, THROWS=32, RETURN=33, IMPORT=34, THIS=35, SUPER=36, IF=37, 
		ELSE=38, WHILE=39, FOR=40, FOREACH=41, CONTINUE=42, BREAK=43, YIELD=44, 
		TRY=45, CATCH=46, SWITCH=47, CASE=48, IMPLEMENTS=49, EXTENDS=50, PRIVATE=51, 
		PROTECTED=52, PUBLIC=53, NATIVE=54, VOLATILE=55, ABSTRACT=56, DEFAULT=57, 
		ASYNC=58, STATIC=59, SYNCHRONIZED=60, IS=61, NOT=62, NEGATE=63, ASSIGN=64, 
		EQUALS=65, NOT_EQUALS=66, NOT_EQUALS_LT_GT=67, LIKE=68, NOT_LIKE=69, GREATER_THAN=70, 
		GREATER_THAN_OR_EQUAL=71, LESS_THAN=72, LESS_THAN_OR_EQUAL=73, OR=74, 
		OR_BINARY=75, AND=76, AND_BINARY=77, ADD=78, SUBTRACT=79, DIVIDE=80, MULTIPLY=81, 
		MODULUS=82, INCREMET=83, DECREMENT=84, INCREMENT_AND_ASSIGN=85, DECREMENT_AND_ASSIGN=86, 
		MULTIPLY_AND_ASSIGN=87, DIVIDE_AND_ASSIGN=88, MODULUS_AND_ASSIGN=89, IDENTIFIER=90, 
		BLOCK_COMMENT=91, LINE_COMMENT=92, WHITESPACE=93;
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
		"ARRAY_EMPTY", "DOT_OPERATOR", "BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", 
		"INTEGER_LITERAL", "LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"HEX_NUMERIC_LITERAL", "PACKAGE", "CLASS", "INTERFACE", "ENUM", "STRUCT", 
		"ANNOTATION", "VARIABLE", "FINAL_VARIABLE", "METHOD", "AS", "THROW", "THROWS", 
		"RETURN", "IMPORT", "THIS", "SUPER", "IF", "ELSE", "WHILE", "FOR", "FOREACH", 
		"CONTINUE", "BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", 
		"EXTENDS", "PRIVATE", "PROTECTED", "PUBLIC", "NATIVE", "VOLATILE", "ABSTRACT", 
		"DEFAULT", "ASYNC", "STATIC", "SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", 
		"EQUALS", "NOT_EQUALS", "NOT_EQUALS_LT_GT", "LIKE", "NOT_LIKE", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUAL", "LESS_THAN", "LESS_THAN_OR_EQUAL", "OR", "OR_BINARY", 
		"AND", "AND_BINARY", "ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", "MODULUS", 
		"INCREMET", "DECREMENT", "INCREMENT_AND_ASSIGN", "DECREMENT_AND_ASSIGN", 
		"MULTIPLY_AND_ASSIGN", "DIVIDE_AND_ASSIGN", "MODULUS_AND_ASSIGN", "IDENTIFIER", 
		"BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "'('", "')'", "';'", "'['", "']'", null, null, 
		"'[]'", null, null, "'null'", null, null, null, null, null, null, "'package'", 
		"'class'", "'interface'", "'enum'", "'struct'", "'annotation'", "'var'", 
		null, "'def'", "'as'", "'throw'", "'throws'", "'return'", "'import'", 
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
		"ARRAY_EMPTY", "DOT_OPERATOR", "BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", 
		"INTEGER_LITERAL", "LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"HEX_NUMERIC_LITERAL", "PACKAGE", "CLASS", "INTERFACE", "ENUM", "STRUCT", 
		"ANNOTATION", "VARIABLE", "FINAL_VARIABLE", "METHOD", "AS", "THROW", "THROWS", 
		"RETURN", "IMPORT", "THIS", "SUPER", "IF", "ELSE", "WHILE", "FOR", "FOREACH", 
		"CONTINUE", "BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", 
		"EXTENDS", "PRIVATE", "PROTECTED", "PUBLIC", "NATIVE", "VOLATILE", "ABSTRACT", 
		"DEFAULT", "ASYNC", "STATIC", "SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", 
		"EQUALS", "NOT_EQUALS", "NOT_EQUALS_LT_GT", "LIKE", "NOT_LIKE", "GREATER_THAN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2_\u02f9\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00ff\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23\u0110\n\23\3\24\3\24\3\25\5\25"+
		"\u0115\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\7#\u0137\n#\f#\16#\u013a\13#\3#\3#\3$\3$\3$\7$\u0141\n"+
		"$\f$\16$\u0144\13$\5$\u0146\n$\3%\3%\3%\3&\3&\3&\7&\u014e\n&\f&\16&\u0151"+
		"\13&\5&\u0153\n&\3&\3&\7&\u0157\n&\f&\16&\u015a\13&\3\'\3\'\3\'\3(\3("+
		"\3(\3(\7(\u0163\n(\f(\16(\u0166\13(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u01a1\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3"+
		";\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3"+
		"?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3T\3T\3U\3U\3U\3V\3"+
		"V\3V\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3\\\3\\\3]\3]\3]\3^\3^\3_"+
		"\3_\3_\3`\3`\3a\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3g\3h\3h\3h"+
		"\3i\3i\3i\3j\3j\3j\3k\3k\3k\3l\3l\3l\3m\3m\3m\3n\3n\3n\7n\u02d5\nn\fn"+
		"\16n\u02d8\13n\3o\3o\3o\3o\7o\u02de\no\fo\16o\u02e1\13o\3o\3o\3o\3o\3"+
		"o\3p\3p\3p\3p\7p\u02ec\np\fp\16p\u02ef\13p\3p\3p\3q\6q\u02f4\nq\rq\16"+
		"q\u02f5\3q\3q\3\u02df\2r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2"+
		"\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\2"+
		"9\13;\f=\r?\16A\17C\20E\21G\22I\23K\24M\25O\26Q\27S\30U\31W\32Y\33[\34"+
		"]\35_\36a\37c e!g\"i#k$m%o&q\'s(u)w*y+{,}-\177.\u0081/\u0083\60\u0085"+
		"\61\u0087\62\u0089\63\u008b\64\u008d\65\u008f\66\u0091\67\u00938\u0095"+
		"9\u0097:\u0099;\u009b<\u009d=\u009f>\u00a1?\u00a3@\u00a5A\u00a7B\u00a9"+
		"C\u00abD\u00adE\u00afF\u00b1G\u00b3H\u00b5I\u00b7J\u00b9K\u00bbL\u00bd"+
		"M\u00bfN\u00c1O\u00c3P\u00c5Q\u00c7R\u00c9S\u00cbT\u00cdU\u00cfV\u00d1"+
		"W\u00d3X\u00d5Y\u00d7Z\u00d9[\u00db\\\u00dd]\u00df^\u00e1_\3\2\n\3\2\63"+
		";\3\2\62;\5\2\62;CHch\3\2\629\6\2&&C\\aac|\6\2\f\f\17\17$$^^\4\2\f\f\17"+
		"\17\5\2\13\f\16\17\"\"\2\u02f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2"+
		"\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1"+
		"\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2"+
		"\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5"+
		"\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2"+
		"\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\3\u00e3\3\2\2\2\5\u00e5\3\2\2\2\7\u00e7"+
		"\3\2\2\2\t\u00e9\3\2\2\2\13\u00eb\3\2\2\2\r\u00ed\3\2\2\2\17\u00ef\3\2"+
		"\2\2\21\u00f1\3\2\2\2\23\u00f3\3\2\2\2\25\u00fe\3\2\2\2\27\u0100\3\2\2"+
		"\2\31\u0102\3\2\2\2\33\u0104\3\2\2\2\35\u0106\3\2\2\2\37\u0108\3\2\2\2"+
		"!\u010a\3\2\2\2#\u010c\3\2\2\2%\u010f\3\2\2\2\'\u0111\3\2\2\2)\u0114\3"+
		"\2\2\2+\u0116\3\2\2\2-\u0118\3\2\2\2/\u011a\3\2\2\2\61\u011c\3\2\2\2\63"+
		"\u011e\3\2\2\2\65\u0120\3\2\2\2\67\u0122\3\2\2\29\u0124\3\2\2\2;\u0126"+
		"\3\2\2\2=\u0128\3\2\2\2?\u012b\3\2\2\2A\u012d\3\2\2\2C\u012f\3\2\2\2E"+
		"\u0134\3\2\2\2G\u0145\3\2\2\2I\u0147\3\2\2\2K\u0152\3\2\2\2M\u015b\3\2"+
		"\2\2O\u015e\3\2\2\2Q\u0167\3\2\2\2S\u016f\3\2\2\2U\u0175\3\2\2\2W\u017f"+
		"\3\2\2\2Y\u0184\3\2\2\2[\u018b\3\2\2\2]\u0196\3\2\2\2_\u01a0\3\2\2\2a"+
		"\u01a2\3\2\2\2c\u01a6\3\2\2\2e\u01a9\3\2\2\2g\u01af\3\2\2\2i\u01b6\3\2"+
		"\2\2k\u01bd\3\2\2\2m\u01c4\3\2\2\2o\u01c9\3\2\2\2q\u01cf\3\2\2\2s\u01d2"+
		"\3\2\2\2u\u01d7\3\2\2\2w\u01dd\3\2\2\2y\u01e1\3\2\2\2{\u01e9\3\2\2\2}"+
		"\u01f2\3\2\2\2\177\u01f8\3\2\2\2\u0081\u01fe\3\2\2\2\u0083\u0202\3\2\2"+
		"\2\u0085\u0208\3\2\2\2\u0087\u020f\3\2\2\2\u0089\u0214\3\2\2\2\u008b\u021f"+
		"\3\2\2\2\u008d\u0227\3\2\2\2\u008f\u0230\3\2\2\2\u0091\u023b\3\2\2\2\u0093"+
		"\u0243\3\2\2\2\u0095\u024b\3\2\2\2\u0097\u0255\3\2\2\2\u0099\u025f\3\2"+
		"\2\2\u009b\u0268\3\2\2\2\u009d\u026f\3\2\2\2\u009f\u0277\3\2\2\2\u00a1"+
		"\u0285\3\2\2\2\u00a3\u0288\3\2\2\2\u00a5\u028c\3\2\2\2\u00a7\u028e\3\2"+
		"\2\2\u00a9\u0290\3\2\2\2\u00ab\u0293\3\2\2\2\u00ad\u0296\3\2\2\2\u00af"+
		"\u0299\3\2\2\2\u00b1\u029b\3\2\2\2\u00b3\u029e\3\2\2\2\u00b5\u02a0\3\2"+
		"\2\2\u00b7\u02a3\3\2\2\2\u00b9\u02a5\3\2\2\2\u00bb\u02a8\3\2\2\2\u00bd"+
		"\u02aa\3\2\2\2\u00bf\u02ad\3\2\2\2\u00c1\u02af\3\2\2\2\u00c3\u02b2\3\2"+
		"\2\2\u00c5\u02b4\3\2\2\2\u00c7\u02b6\3\2\2\2\u00c9\u02b8\3\2\2\2\u00cb"+
		"\u02ba\3\2\2\2\u00cd\u02bc\3\2\2\2\u00cf\u02bf\3\2\2\2\u00d1\u02c2\3\2"+
		"\2\2\u00d3\u02c5\3\2\2\2\u00d5\u02c8\3\2\2\2\u00d7\u02cb\3\2\2\2\u00d9"+
		"\u02ce\3\2\2\2\u00db\u02d1\3\2\2\2\u00dd\u02d9\3\2\2\2\u00df\u02e7\3\2"+
		"\2\2\u00e1\u02f3\3\2\2\2\u00e3\u00e4\7}\2\2\u00e4\4\3\2\2\2\u00e5\u00e6"+
		"\7\177\2\2\u00e6\6\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8\b\3\2\2\2\u00e9\u00ea"+
		"\7*\2\2\u00ea\n\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec\f\3\2\2\2\u00ed\u00ee"+
		"\7=\2\2\u00ee\16\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0\20\3\2\2\2\u00f1\u00f2"+
		"\7_\2\2\u00f2\22\3\2\2\2\u00f3\u00f4\4\62\63\2\u00f4\24\3\2\2\2\u00f5"+
		"\u00f6\7v\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7w\2\2\u00f8\u00ff\7g\2\2"+
		"\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd"+
		"\7u\2\2\u00fd\u00ff\7g\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff"+
		"\26\3\2\2\2\u0100\u0101\7\13\2\2\u0101\30\3\2\2\2\u0102\u0103\7\f\2\2"+
		"\u0103\32\3\2\2\2\u0104\u0105\7-\2\2\u0105\34\3\2\2\2\u0106\u0107\7/\2"+
		"\2\u0107\36\3\2\2\2\u0108\u0109\7?\2\2\u0109 \3\2\2\2\u010a\u010b\t\2"+
		"\2\2\u010b\"\3\2\2\2\u010c\u010d\t\3\2\2\u010d$\3\2\2\2\u010e\u0110\t"+
		"\4\2\2\u010f\u010e\3\2\2\2\u0110&\3\2\2\2\u0111\u0112\t\5\2\2\u0112(\3"+
		"\2\2\2\u0113\u0115\t\6\2\2\u0114\u0113\3\2\2\2\u0115*\3\2\2\2\u0116\u0117"+
		"\n\7\2\2\u0117,\3\2\2\2\u0118\u0119\7A\2\2\u0119.\3\2\2\2\u011a\u011b"+
		"\7=\2\2\u011b\60\3\2\2\2\u011c\u011d\7<\2\2\u011d\62\3\2\2\2\u011e\u011f"+
		"\7\60\2\2\u011f\64\3\2\2\2\u0120\u0121\7.\2\2\u0121\66\3\2\2\2\u0122\u0123"+
		"\7a\2\2\u01238\3\2\2\2\u0124\u0125\5-\27\2\u0125:\3\2\2\2\u0126\u0127"+
		"\5\61\31\2\u0127<\3\2\2\2\u0128\u0129\7]\2\2\u0129\u012a\7_\2\2\u012a"+
		">\3\2\2\2\u012b\u012c\5\63\32\2\u012c@\3\2\2\2\u012d\u012e\5\25\13\2\u012e"+
		"B\3\2\2\2\u012f\u0130\7p\2\2\u0130\u0131\7w\2\2\u0131\u0132\7n\2\2\u0132"+
		"\u0133\7n\2\2\u0133D\3\2\2\2\u0134\u0138\7$\2\2\u0135\u0137\5+\26\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$\2\2\u013c"+
		"F\3\2\2\2\u013d\u0146\7\62\2\2\u013e\u0142\5!\21\2\u013f\u0141\5#\22\2"+
		"\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u013d\3\2\2\2\u0145"+
		"\u013e\3\2\2\2\u0146H\3\2\2\2\u0147\u0148\5G$\2\u0148\u0149\7n\2\2\u0149"+
		"J\3\2\2\2\u014a\u0153\7\62\2\2\u014b\u014f\5!\21\2\u014c\u014e\5#\22\2"+
		"\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u014a\3\2\2\2\u0152"+
		"\u014b\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0158\5\63\32\2\u0155\u0157\5"+
		"#\22\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159L\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\5K&\2\u015c"+
		"\u015d\7f\2\2\u015dN\3\2\2\2\u015e\u015f\7\62\2\2\u015f\u0160\7z\2\2\u0160"+
		"\u0164\3\2\2\2\u0161\u0163\5%\23\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165P\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0167\u0168\7r\2\2\u0168\u0169\7c\2\2\u0169\u016a\7e\2\2\u016a"+
		"\u016b\7m\2\2\u016b\u016c\7c\2\2\u016c\u016d\7i\2\2\u016d\u016e\7g\2\2"+
		"\u016eR\3\2\2\2\u016f\u0170\7e\2\2\u0170\u0171\7n\2\2\u0171\u0172\7c\2"+
		"\2\u0172\u0173\7u\2\2\u0173\u0174\7u\2\2\u0174T\3\2\2\2\u0175\u0176\7"+
		"k\2\2\u0176\u0177\7p\2\2\u0177\u0178\7v\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7t\2\2\u017a\u017b\7h\2\2\u017b\u017c\7c\2\2\u017c\u017d\7e\2\2\u017d"+
		"\u017e\7g\2\2\u017eV\3\2\2\2\u017f\u0180\7g\2\2\u0180\u0181\7p\2\2\u0181"+
		"\u0182\7w\2\2\u0182\u0183\7o\2\2\u0183X\3\2\2\2\u0184\u0185\7u\2\2\u0185"+
		"\u0186\7v\2\2\u0186\u0187\7t\2\2\u0187\u0188\7w\2\2\u0188\u0189\7e\2\2"+
		"\u0189\u018a\7v\2\2\u018aZ\3\2\2\2\u018b\u018c\7c\2\2\u018c\u018d\7p\2"+
		"\2\u018d\u018e\7p\2\2\u018e\u018f\7q\2\2\u018f\u0190\7v\2\2\u0190\u0191"+
		"\7c\2\2\u0191\u0192\7v\2\2\u0192\u0193\7k\2\2\u0193\u0194\7q\2\2\u0194"+
		"\u0195\7p\2\2\u0195\\\3\2\2\2\u0196\u0197\7x\2\2\u0197\u0198\7c\2\2\u0198"+
		"\u0199\7t\2\2\u0199^\3\2\2\2\u019a\u019b\7n\2\2\u019b\u019c\7g\2\2\u019c"+
		"\u01a1\7v\2\2\u019d\u019e\7x\2\2\u019e\u019f\7c\2\2\u019f\u01a1\7n\2\2"+
		"\u01a0\u019a\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1`\3\2\2\2\u01a2\u01a3\7"+
		"f\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7h\2\2\u01a5b\3\2\2\2\u01a6\u01a7"+
		"\7c\2\2\u01a7\u01a8\7u\2\2\u01a8d\3\2\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab"+
		"\7j\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7y\2\2\u01ae"+
		"f\3\2\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7j\2\2\u01b1\u01b2\7t\2\2\u01b2"+
		"\u01b3\7q\2\2\u01b3\u01b4\7y\2\2\u01b4\u01b5\7u\2\2\u01b5h\3\2\2\2\u01b6"+
		"\u01b7\7t\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7w\2\2"+
		"\u01ba\u01bb\7t\2\2\u01bb\u01bc\7p\2\2\u01bcj\3\2\2\2\u01bd\u01be\7k\2"+
		"\2\u01be\u01bf\7o\2\2\u01bf\u01c0\7r\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2"+
		"\7t\2\2\u01c2\u01c3\7v\2\2\u01c3l\3\2\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6"+
		"\7j\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7u\2\2\u01c8n\3\2\2\2\u01c9\u01ca"+
		"\7u\2\2\u01ca\u01cb\7w\2\2\u01cb\u01cc\7r\2\2\u01cc\u01cd\7g\2\2\u01cd"+
		"\u01ce\7t\2\2\u01cep\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7h\2\2\u01d1"+
		"r\3\2\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7n\2\2\u01d4\u01d5\7u\2\2\u01d5"+
		"\u01d6\7g\2\2\u01d6t\3\2\2\2\u01d7\u01d8\7y\2\2\u01d8\u01d9\7j\2\2\u01d9"+
		"\u01da\7k\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7g\2\2\u01dcv\3\2\2\2\u01dd"+
		"\u01de\7h\2\2\u01de\u01df\7q\2\2\u01df\u01e0\7t\2\2\u01e0x\3\2\2\2\u01e1"+
		"\u01e2\7h\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7g\2\2"+
		"\u01e5\u01e6\7c\2\2\u01e6\u01e7\7e\2\2\u01e7\u01e8\7j\2\2\u01e8z\3\2\2"+
		"\2\u01e9\u01ea\7e\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7p\2\2\u01ec\u01ed"+
		"\7v\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7p\2\2\u01ef\u01f0\7w\2\2\u01f0"+
		"\u01f1\7g\2\2\u01f1|\3\2\2\2\u01f2\u01f3\7d\2\2\u01f3\u01f4\7t\2\2\u01f4"+
		"\u01f5\7g\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7m\2\2\u01f7~\3\2\2\2\u01f8"+
		"\u01f9\7{\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7n\2\2"+
		"\u01fc\u01fd\7f\2\2\u01fd\u0080\3\2\2\2\u01fe\u01ff\7v\2\2\u01ff\u0200"+
		"\7t\2\2\u0200\u0201\7{\2\2\u0201\u0082\3\2\2\2\u0202\u0203\7e\2\2\u0203"+
		"\u0204\7c\2\2\u0204\u0205\7v\2\2\u0205\u0206\7e\2\2\u0206\u0207\7j\2\2"+
		"\u0207\u0084\3\2\2\2\u0208\u0209\7u\2\2\u0209\u020a\7y\2\2\u020a\u020b"+
		"\7k\2\2\u020b\u020c\7v\2\2\u020c\u020d\7e\2\2\u020d\u020e\7j\2\2\u020e"+
		"\u0086\3\2\2\2\u020f\u0210\7e\2\2\u0210\u0211\7c\2\2\u0211\u0212\7u\2"+
		"\2\u0212\u0213\7g\2\2\u0213\u0088\3\2\2\2\u0214\u0215\7k\2\2\u0215\u0216"+
		"\7o\2\2\u0216\u0217\7r\2\2\u0217\u0218\7n\2\2\u0218\u0219\7g\2\2\u0219"+
		"\u021a\7o\2\2\u021a\u021b\7g\2\2\u021b\u021c\7p\2\2\u021c\u021d\7v\2\2"+
		"\u021d\u021e\7u\2\2\u021e\u008a\3\2\2\2\u021f\u0220\7g\2\2\u0220\u0221"+
		"\7z\2\2\u0221\u0222\7v\2\2\u0222\u0223\7g\2\2\u0223\u0224\7p\2\2\u0224"+
		"\u0225\7f\2\2\u0225\u0226\7u\2\2\u0226\u008c\3\2\2\2\u0227\u0228\7B\2"+
		"\2\u0228\u0229\7r\2\2\u0229\u022a\7t\2\2\u022a\u022b\7k\2\2\u022b\u022c"+
		"\7x\2\2\u022c\u022d\7c\2\2\u022d\u022e\7v\2\2\u022e\u022f\7g\2\2\u022f"+
		"\u008e\3\2\2\2\u0230\u0231\7B\2\2\u0231\u0232\7r\2\2\u0232\u0233\7t\2"+
		"\2\u0233\u0234\7q\2\2\u0234\u0235\7v\2\2\u0235\u0236\7g\2\2\u0236\u0237"+
		"\7e\2\2\u0237\u0238\7v\2\2\u0238\u0239\7g\2\2\u0239\u023a\7f\2\2\u023a"+
		"\u0090\3\2\2\2\u023b\u023c\7B\2\2\u023c\u023d\7r\2\2\u023d\u023e\7w\2"+
		"\2\u023e\u023f\7d\2\2\u023f\u0240\7n\2\2\u0240\u0241\7k\2\2\u0241\u0242"+
		"\7e\2\2\u0242\u0092\3\2\2\2\u0243\u0244\7B\2\2\u0244\u0245\7p\2\2\u0245"+
		"\u0246\7c\2\2\u0246\u0247\7v\2\2\u0247\u0248\7k\2\2\u0248\u0249\7x\2\2"+
		"\u0249\u024a\7g\2\2\u024a\u0094\3\2\2\2\u024b\u024c\7B\2\2\u024c\u024d"+
		"\7x\2\2\u024d\u024e\7q\2\2\u024e\u024f\7n\2\2\u024f\u0250\7c\2\2\u0250"+
		"\u0251\7v\2\2\u0251\u0252\7k\2\2\u0252\u0253\7n\2\2\u0253\u0254\7g\2\2"+
		"\u0254\u0096\3\2\2\2\u0255\u0256\7B\2\2\u0256\u0257\7c\2\2\u0257\u0258"+
		"\7d\2\2\u0258\u0259\7u\2\2\u0259\u025a\7v\2\2\u025a\u025b\7t\2\2\u025b"+
		"\u025c\7c\2\2\u025c\u025d\7e\2\2\u025d\u025e\7v\2\2\u025e\u0098\3\2\2"+
		"\2\u025f\u0260\7B\2\2\u0260\u0261\7f\2\2\u0261\u0262\7g\2\2\u0262\u0263"+
		"\7h\2\2\u0263\u0264\7c\2\2\u0264\u0265\7w\2\2\u0265\u0266\7n\2\2\u0266"+
		"\u0267\7v\2\2\u0267\u009a\3\2\2\2\u0268\u0269\7B\2\2\u0269\u026a\7c\2"+
		"\2\u026a\u026b\7u\2\2\u026b\u026c\7{\2\2\u026c\u026d\7p\2\2\u026d\u026e"+
		"\7e\2\2\u026e\u009c\3\2\2\2\u026f\u0270\7B\2\2\u0270\u0271\7u\2\2\u0271"+
		"\u0272\7v\2\2\u0272\u0273\7c\2\2\u0273\u0274\7v\2\2\u0274\u0275\7k\2\2"+
		"\u0275\u0276\7e\2\2\u0276\u009e\3\2\2\2\u0277\u0278\7B\2\2\u0278\u0279"+
		"\7u\2\2\u0279\u027a\7{\2\2\u027a\u027b\7p\2\2\u027b\u027c\7e\2\2\u027c"+
		"\u027d\7j\2\2\u027d\u027e\7t\2\2\u027e\u027f\7q\2\2\u027f\u0280\7p\2\2"+
		"\u0280\u0281\7k\2\2\u0281\u0282\7|\2\2\u0282\u0283\7g\2\2\u0283\u0284"+
		"\7f\2\2\u0284\u00a0\3\2\2\2\u0285\u0286\7k\2\2\u0286\u0287\7u\2\2\u0287"+
		"\u00a2\3\2\2\2\u0288\u0289\7p\2\2\u0289\u028a\7q\2\2\u028a\u028b\7v\2"+
		"\2\u028b\u00a4\3\2\2\2\u028c\u028d\7#\2\2\u028d\u00a6\3\2\2\2\u028e\u028f"+
		"\5\37\20\2\u028f\u00a8\3\2\2\2\u0290\u0291\5\37\20\2\u0291\u0292\5\37"+
		"\20\2\u0292\u00aa\3\2\2\2\u0293\u0294\5\u00a5S\2\u0294\u0295\5\37\20\2"+
		"\u0295\u00ac\3\2\2\2\u0296\u0297\7>\2\2\u0297\u0298\7@\2\2\u0298\u00ae"+
		"\3\2\2\2\u0299\u029a\7\u0080\2\2\u029a\u00b0\3\2\2\2\u029b\u029c\7#\2"+
		"\2\u029c\u029d\7\u0080\2\2\u029d\u00b2\3\2\2\2\u029e\u029f\7@\2\2\u029f"+
		"\u00b4\3\2\2\2\u02a0\u02a1\7@\2\2\u02a1\u02a2\7?\2\2\u02a2\u00b6\3\2\2"+
		"\2\u02a3\u02a4\7>\2\2\u02a4\u00b8\3\2\2\2\u02a5\u02a6\7>\2\2\u02a6\u02a7"+
		"\7?\2\2\u02a7\u00ba\3\2\2\2\u02a8\u02a9\7~\2\2\u02a9\u00bc\3\2\2\2\u02aa"+
		"\u02ab\7~\2\2\u02ab\u02ac\7~\2\2\u02ac\u00be\3\2\2\2\u02ad\u02ae\7(\2"+
		"\2\u02ae\u00c0\3\2\2\2\u02af\u02b0\7(\2\2\u02b0\u02b1\7(\2\2\u02b1\u00c2"+
		"\3\2\2\2\u02b2\u02b3\5\33\16\2\u02b3\u00c4\3\2\2\2\u02b4\u02b5\5\35\17"+
		"\2\u02b5\u00c6\3\2\2\2\u02b6\u02b7\7\61\2\2\u02b7\u00c8\3\2\2\2\u02b8"+
		"\u02b9\7,\2\2\u02b9\u00ca\3\2\2\2\u02ba\u02bb\7\'\2\2\u02bb\u00cc\3\2"+
		"\2\2\u02bc\u02bd\5\33\16\2\u02bd\u02be\5\33\16\2\u02be\u00ce\3\2\2\2\u02bf"+
		"\u02c0\5\35\17\2\u02c0\u02c1\5\35\17\2\u02c1\u00d0\3\2\2\2\u02c2\u02c3"+
		"\5\37\20\2\u02c3\u02c4\5\33\16\2\u02c4\u00d2\3\2\2\2\u02c5\u02c6\5\37"+
		"\20\2\u02c6\u02c7\5\35\17\2\u02c7\u00d4\3\2\2\2\u02c8\u02c9\5\37\20\2"+
		"\u02c9\u02ca\5\u00c9e\2\u02ca\u00d6\3\2\2\2\u02cb\u02cc\5\37\20\2\u02cc"+
		"\u02cd\5\u00c7d\2\u02cd\u00d8\3\2\2\2\u02ce\u02cf\5\37\20\2\u02cf\u02d0"+
		"\5\u00cbf\2\u02d0\u00da\3\2\2\2\u02d1\u02d6\5)\25\2\u02d2\u02d5\5)\25"+
		"\2\u02d3\u02d5\5#\22\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5\u02d8"+
		"\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u00dc\3\2\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d9\u02da\7\61\2\2\u02da\u02db\7,\2\2\u02db\u02df\3\2"+
		"\2\2\u02dc\u02de\13\2\2\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2"+
		"\2\2\u02e2\u02e3\7,\2\2\u02e3\u02e4\7\61\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e6\bo\2\2\u02e6\u00de\3\2\2\2\u02e7\u02e8\7\61\2\2\u02e8\u02e9\7\61"+
		"\2\2\u02e9\u02ed\3\2\2\2\u02ea\u02ec\n\b\2\2\u02eb\u02ea\3\2\2\2\u02ec"+
		"\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2"+
		"\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\bp\2\2\u02f1\u00e0\3\2\2\2\u02f2"+
		"\u02f4\t\t\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f3\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\bq\2\2\u02f8"+
		"\u00e2\3\2\2\2\23\2\u00fe\u010f\u0114\u0138\u0142\u0145\u014f\u0152\u0158"+
		"\u0164\u01a0\u02d4\u02d6\u02df\u02ed\u02f5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}