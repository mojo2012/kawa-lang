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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OPTIONAL=6, DECLARE_TYPE=7, ARRAY_EMPTY=8, 
		PACKAGE_SEPARATOR=9, BOOLEAN_LITERAL=10, NULL_LITERAL=11, STRING_LITERAL=12, 
		INTEGER_LITERAL=13, LONG_LITERAL=14, FLOAT_LITERAL=15, DOUBLE_LITERAL=16, 
		HEX_NUMERIC_LITERAL=17, PACKAGE=18, CLASS=19, INTERFACE=20, ENUM=21, STRUCT=22, 
		VARIABLE=23, FINAL_VARIABLE=24, AS=25, THROW=26, THROWS=27, RETURN=28, 
		IMPORT=29, THIS=30, SUPER=31, IF=32, ELSE=33, WHILE=34, FOR=35, FOREACH=36, 
		CONTINUE=37, BREAK=38, YIELD=39, TRY=40, CATCH=41, SWITCH=42, CASE=43, 
		IMPLEMENTS=44, EXTENDS=45, PRIVATE=46, PROTECTED=47, NATIVE=48, VOLATILE=49, 
		ABSTRACT=50, DEFAULT=51, ASYNC=52, STATIC=53, SYNCHRONIZED=54, IS=55, 
		NOT=56, NEGATE=57, ASSIGN=58, EQUALS=59, NOT_EQUALS=60, NOT_EQUALS_LT_GT=61, 
		LIKE=62, NOT_LIKE=63, GREATER_THAN=64, GREATER_THAN_OR_EQUAL=65, LESS_THAN=66, 
		LESS_THAN_OR_EQUAL=67, OR=68, OR_BINARY=69, AND=70, AND_BINARY=71, ADD=72, 
		SUBTRACT=73, DIVIDE=74, MULTIPLY=75, MODULUS=76, INCREMET=77, DECREMENT=78, 
		INCREMENT_AND_ASSIGN=79, DECREMENT_AND_ASSIGN=80, MULTIPLY_AND_ASSIGN=81, 
		DIVIDE_AND_ASSIGN=82, MODULUS_AND_ASSIGN=83, IDENTIFIER=84, BLOCK_COMMENT=85, 
		LINE_COMMENT=86, WHITESPACE=87;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "BINARY_DIGIT", "BOOLEAN", "TAB", 
		"NEWLINE", "PLUS", "MINUS", "EQUAL", "NON_ZERO_DIGIT", "DIGIT", "HEX_DIGIT", 
		"OCT_DIGIT", "LETTER", "STRING_CHAR", "QUESTION_MARK", "SEMI_COLON", "COLON", 
		"DOT", "COMMA", "UNDERSCORE", "OPTIONAL", "DECLARE_TYPE", "ARRAY_EMPTY", 
		"PACKAGE_SEPARATOR", "BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", 
		"INTEGER_LITERAL", "LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"HEX_NUMERIC_LITERAL", "PACKAGE", "CLASS", "INTERFACE", "ENUM", "STRUCT", 
		"VARIABLE", "FINAL_VARIABLE", "AS", "THROW", "THROWS", "RETURN", "IMPORT", 
		"THIS", "SUPER", "IF", "ELSE", "WHILE", "FOR", "FOREACH", "CONTINUE", 
		"BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", "EXTENDS", 
		"PRIVATE", "PROTECTED", "NATIVE", "VOLATILE", "ABSTRACT", "DEFAULT", "ASYNC", 
		"STATIC", "SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", "EQUALS", "NOT_EQUALS", 
		"NOT_EQUALS_LT_GT", "LIKE", "NOT_LIKE", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", 
		"LESS_THAN", "LESS_THAN_OR_EQUAL", "OR", "OR_BINARY", "AND", "AND_BINARY", 
		"ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", "MODULUS", "INCREMET", "DECREMENT", 
		"INCREMENT_AND_ASSIGN", "DECREMENT_AND_ASSIGN", "MULTIPLY_AND_ASSIGN", 
		"DIVIDE_AND_ASSIGN", "MODULUS_AND_ASSIGN", "IDENTIFIER", "BLOCK_COMMENT", 
		"LINE_COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "'('", "')'", null, null, "'[]'", null, null, 
		"'null'", null, null, null, null, null, null, "'package'", "'class'", 
		"'interface'", "'enum'", "'struct'", "'var'", "'let'", "'as'", "'throw'", 
		"'throws'", "'return'", "'import'", "'this'", "'super'", "'if'", "'else'", 
		"'while'", "'for'", "'foreach'", "'continue'", "'break'", "'yield'", "'try'", 
		"'catch'", "'switch'", "'case'", "'implements'", "'extends'", "'private'", 
		"'protected'", "'native'", "'volatile'", "'abstract'", "'default'", "'async'", 
		"'static'", "'synchronized'", "'is'", "'not'", "'!'", null, null, null, 
		"'<>'", "'~'", "'!~'", "'>'", "'>='", "'<'", "'<='", "'|'", "'||'", "'&'", 
		"'&&'", null, null, "'/'", "'*'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "OPTIONAL", "DECLARE_TYPE", "ARRAY_EMPTY", 
		"PACKAGE_SEPARATOR", "BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", 
		"INTEGER_LITERAL", "LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"HEX_NUMERIC_LITERAL", "PACKAGE", "CLASS", "INTERFACE", "ENUM", "STRUCT", 
		"VARIABLE", "FINAL_VARIABLE", "AS", "THROW", "THROWS", "RETURN", "IMPORT", 
		"THIS", "SUPER", "IF", "ELSE", "WHILE", "FOR", "FOREACH", "CONTINUE", 
		"BREAK", "YIELD", "TRY", "CATCH", "SWITCH", "CASE", "IMPLEMENTS", "EXTENDS", 
		"PRIVATE", "PROTECTED", "NATIVE", "VOLATILE", "ABSTRACT", "DEFAULT", "ASYNC", 
		"STATIC", "SYNCHRONIZED", "IS", "NOT", "NEGATE", "ASSIGN", "EQUALS", "NOT_EQUALS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u02c3\b\1\4\2\t"+
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
		"k\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00ed\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\5\20\u00fe\n\20\3\21\3\21\3\22\5\22\u0103"+
		"\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \7 \u0125\n \f \16 \u0128\13 \3 \3 \3!\3!\3!\7!\u012f"+
		"\n!\f!\16!\u0132\13!\5!\u0134\n!\3\"\3\"\3\"\3#\3#\3#\7#\u013c\n#\f#\16"+
		"#\u013f\13#\5#\u0141\n#\3#\3#\7#\u0145\n#\f#\16#\u0148\13#\3$\3$\3$\3"+
		"%\3%\3%\3%\7%\u0151\n%\f%\16%\u0154\13%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/"+
		"\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3"+
		"I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3L\3L\3L\3"+
		"L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3S\3T\3T\3U\3U\3"+
		"U\3V\3V\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3\\\3\\\3]\3]\3^\3^\3_"+
		"\3_\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g"+
		"\3g\3h\3h\3h\7h\u029f\nh\fh\16h\u02a2\13h\3i\3i\3i\3i\7i\u02a8\ni\fi\16"+
		"i\u02ab\13i\3i\3i\3i\3i\3i\3j\3j\3j\3j\7j\u02b6\nj\fj\16j\u02b9\13j\3"+
		"j\3j\3k\6k\u02be\nk\rk\16k\u02bf\3k\3k\3\u02a9\2l\3\3\5\4\7\5\t\6\13\7"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\b\65\t\67\n9\13;\f=\r?\16A\17C\20E\21G\22I\23K\24M\25O\26"+
		"Q\27S\30U\31W\32Y\33[\34]\35_\36a\37c e!g\"i#k$m%o&q\'s(u)w*y+{,}-\177"+
		".\u0081/\u0083\60\u0085\61\u0087\62\u0089\63\u008b\64\u008d\65\u008f\66"+
		"\u0091\67\u00938\u00959\u0097:\u0099;\u009b<\u009d=\u009f>\u00a1?\u00a3"+
		"@\u00a5A\u00a7B\u00a9C\u00abD\u00adE\u00afF\u00b1G\u00b3H\u00b5I\u00b7"+
		"J\u00b9K\u00bbL\u00bdM\u00bfN\u00c1O\u00c3P\u00c5Q\u00c7R\u00c9S\u00cb"+
		"T\u00cdU\u00cfV\u00d1W\u00d3X\u00d5Y\3\2\n\3\2\63;\3\2\62;\5\2\62;CHc"+
		"h\3\2\629\6\2&&C\\aac|\6\2\f\f\17\17$$^^\4\2\f\f\17\17\5\2\13\f\16\17"+
		"\"\"\2\u02bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\3\u00d7"+
		"\3\2\2\2\5\u00d9\3\2\2\2\7\u00db\3\2\2\2\t\u00dd\3\2\2\2\13\u00df\3\2"+
		"\2\2\r\u00e1\3\2\2\2\17\u00ec\3\2\2\2\21\u00ee\3\2\2\2\23\u00f0\3\2\2"+
		"\2\25\u00f2\3\2\2\2\27\u00f4\3\2\2\2\31\u00f6\3\2\2\2\33\u00f8\3\2\2\2"+
		"\35\u00fa\3\2\2\2\37\u00fd\3\2\2\2!\u00ff\3\2\2\2#\u0102\3\2\2\2%\u0104"+
		"\3\2\2\2\'\u0106\3\2\2\2)\u0108\3\2\2\2+\u010a\3\2\2\2-\u010c\3\2\2\2"+
		"/\u010e\3\2\2\2\61\u0110\3\2\2\2\63\u0112\3\2\2\2\65\u0114\3\2\2\2\67"+
		"\u0116\3\2\2\29\u0119\3\2\2\2;\u011b\3\2\2\2=\u011d\3\2\2\2?\u0122\3\2"+
		"\2\2A\u0133\3\2\2\2C\u0135\3\2\2\2E\u0140\3\2\2\2G\u0149\3\2\2\2I\u014c"+
		"\3\2\2\2K\u0155\3\2\2\2M\u015d\3\2\2\2O\u0163\3\2\2\2Q\u016d\3\2\2\2S"+
		"\u0172\3\2\2\2U\u0179\3\2\2\2W\u017d\3\2\2\2Y\u0181\3\2\2\2[\u0184\3\2"+
		"\2\2]\u018a\3\2\2\2_\u0191\3\2\2\2a\u0198\3\2\2\2c\u019f\3\2\2\2e\u01a4"+
		"\3\2\2\2g\u01aa\3\2\2\2i\u01ad\3\2\2\2k\u01b2\3\2\2\2m\u01b8\3\2\2\2o"+
		"\u01bc\3\2\2\2q\u01c4\3\2\2\2s\u01cd\3\2\2\2u\u01d3\3\2\2\2w\u01d9\3\2"+
		"\2\2y\u01dd\3\2\2\2{\u01e3\3\2\2\2}\u01ea\3\2\2\2\177\u01ef\3\2\2\2\u0081"+
		"\u01fa\3\2\2\2\u0083\u0202\3\2\2\2\u0085\u020a\3\2\2\2\u0087\u0214\3\2"+
		"\2\2\u0089\u021b\3\2\2\2\u008b\u0224\3\2\2\2\u008d\u022d\3\2\2\2\u008f"+
		"\u0235\3\2\2\2\u0091\u023b\3\2\2\2\u0093\u0242\3\2\2\2\u0095\u024f\3\2"+
		"\2\2\u0097\u0252\3\2\2\2\u0099\u0256\3\2\2\2\u009b\u0258\3\2\2\2\u009d"+
		"\u025a\3\2\2\2\u009f\u025d\3\2\2\2\u00a1\u0260\3\2\2\2\u00a3\u0263\3\2"+
		"\2\2\u00a5\u0265\3\2\2\2\u00a7\u0268\3\2\2\2\u00a9\u026a\3\2\2\2\u00ab"+
		"\u026d\3\2\2\2\u00ad\u026f\3\2\2\2\u00af\u0272\3\2\2\2\u00b1\u0274\3\2"+
		"\2\2\u00b3\u0277\3\2\2\2\u00b5\u0279\3\2\2\2\u00b7\u027c\3\2\2\2\u00b9"+
		"\u027e\3\2\2\2\u00bb\u0280\3\2\2\2\u00bd\u0282\3\2\2\2\u00bf\u0284\3\2"+
		"\2\2\u00c1\u0286\3\2\2\2\u00c3\u0289\3\2\2\2\u00c5\u028c\3\2\2\2\u00c7"+
		"\u028f\3\2\2\2\u00c9\u0292\3\2\2\2\u00cb\u0295\3\2\2\2\u00cd\u0298\3\2"+
		"\2\2\u00cf\u029b\3\2\2\2\u00d1\u02a3\3\2\2\2\u00d3\u02b1\3\2\2\2\u00d5"+
		"\u02bd\3\2\2\2\u00d7\u00d8\7}\2\2\u00d8\4\3\2\2\2\u00d9\u00da\7\177\2"+
		"\2\u00da\6\3\2\2\2\u00db\u00dc\7.\2\2\u00dc\b\3\2\2\2\u00dd\u00de\7*\2"+
		"\2\u00de\n\3\2\2\2\u00df\u00e0\7+\2\2\u00e0\f\3\2\2\2\u00e1\u00e2\4\62"+
		"\63\2\u00e2\16\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00ed\7g\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ed\7g\2\2\u00ec\u00e3\3\2\2"+
		"\2\u00ec\u00e7\3\2\2\2\u00ed\20\3\2\2\2\u00ee\u00ef\7\13\2\2\u00ef\22"+
		"\3\2\2\2\u00f0\u00f1\7\f\2\2\u00f1\24\3\2\2\2\u00f2\u00f3\7-\2\2\u00f3"+
		"\26\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5\30\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7"+
		"\32\3\2\2\2\u00f8\u00f9\t\2\2\2\u00f9\34\3\2\2\2\u00fa\u00fb\t\3\2\2\u00fb"+
		"\36\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe \3\2\2\2\u00ff"+
		"\u0100\t\5\2\2\u0100\"\3\2\2\2\u0101\u0103\t\6\2\2\u0102\u0101\3\2\2\2"+
		"\u0103$\3\2\2\2\u0104\u0105\n\7\2\2\u0105&\3\2\2\2\u0106\u0107\7A\2\2"+
		"\u0107(\3\2\2\2\u0108\u0109\7=\2\2\u0109*\3\2\2\2\u010a\u010b\7<\2\2\u010b"+
		",\3\2\2\2\u010c\u010d\7\60\2\2\u010d.\3\2\2\2\u010e\u010f\7.\2\2\u010f"+
		"\60\3\2\2\2\u0110\u0111\7a\2\2\u0111\62\3\2\2\2\u0112\u0113\5\'\24\2\u0113"+
		"\64\3\2\2\2\u0114\u0115\5+\26\2\u0115\66\3\2\2\2\u0116\u0117\7]\2\2\u0117"+
		"\u0118\7_\2\2\u01188\3\2\2\2\u0119\u011a\5-\27\2\u011a:\3\2\2\2\u011b"+
		"\u011c\5\17\b\2\u011c<\3\2\2\2\u011d\u011e\7p\2\2\u011e\u011f\7w\2\2\u011f"+
		"\u0120\7n\2\2\u0120\u0121\7n\2\2\u0121>\3\2\2\2\u0122\u0126\7$\2\2\u0123"+
		"\u0125\5%\23\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\7$\2\2\u012a@\3\2\2\2\u012b\u0134\7\62\2\2\u012c\u0130\5\33\16"+
		"\2\u012d\u012f\5\35\17\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u012b\3\2\2\2\u0133\u012c\3\2\2\2\u0134B\3\2\2\2\u0135\u0136"+
		"\5A!\2\u0136\u0137\7n\2\2\u0137D\3\2\2\2\u0138\u0141\7\62\2\2\u0139\u013d"+
		"\5\33\16\2\u013a\u013c\5\35\17\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2"+
		"\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0138\3\2\2\2\u0140\u0139\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0146\5-\27\2\u0143\u0145\5\35\17\2\u0144\u0143\3\2\2\2\u0145\u0148\3"+
		"\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147F\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014a\5E#\2\u014a\u014b\7f\2\2\u014bH\3\2\2\2\u014c\u014d"+
		"\7\62\2\2\u014d\u014e\7z\2\2\u014e\u0152\3\2\2\2\u014f\u0151\5\37\20\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153J\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7r\2\2\u0156\u0157"+
		"\7c\2\2\u0157\u0158\7e\2\2\u0158\u0159\7m\2\2\u0159\u015a\7c\2\2\u015a"+
		"\u015b\7i\2\2\u015b\u015c\7g\2\2\u015cL\3\2\2\2\u015d\u015e\7e\2\2\u015e"+
		"\u015f\7n\2\2\u015f\u0160\7c\2\2\u0160\u0161\7u\2\2\u0161\u0162\7u\2\2"+
		"\u0162N\3\2\2\2\u0163\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165\u0166\7v\2"+
		"\2\u0166\u0167\7g\2\2\u0167\u0168\7t\2\2\u0168\u0169\7h\2\2\u0169\u016a"+
		"\7c\2\2\u016a\u016b\7e\2\2\u016b\u016c\7g\2\2\u016cP\3\2\2\2\u016d\u016e"+
		"\7g\2\2\u016e\u016f\7p\2\2\u016f\u0170\7w\2\2\u0170\u0171\7o\2\2\u0171"+
		"R\3\2\2\2\u0172\u0173\7u\2\2\u0173\u0174\7v\2\2\u0174\u0175\7t\2\2\u0175"+
		"\u0176\7w\2\2\u0176\u0177\7e\2\2\u0177\u0178\7v\2\2\u0178T\3\2\2\2\u0179"+
		"\u017a\7x\2\2\u017a\u017b\7c\2\2\u017b\u017c\7t\2\2\u017cV\3\2\2\2\u017d"+
		"\u017e\7n\2\2\u017e\u017f\7g\2\2\u017f\u0180\7v\2\2\u0180X\3\2\2\2\u0181"+
		"\u0182\7c\2\2\u0182\u0183\7u\2\2\u0183Z\3\2\2\2\u0184\u0185\7v\2\2\u0185"+
		"\u0186\7j\2\2\u0186\u0187\7t\2\2\u0187\u0188\7q\2\2\u0188\u0189\7y\2\2"+
		"\u0189\\\3\2\2\2\u018a\u018b\7v\2\2\u018b\u018c\7j\2\2\u018c\u018d\7t"+
		"\2\2\u018d\u018e\7q\2\2\u018e\u018f\7y\2\2\u018f\u0190\7u\2\2\u0190^\3"+
		"\2\2\2\u0191\u0192\7t\2\2\u0192\u0193\7g\2\2\u0193\u0194\7v\2\2\u0194"+
		"\u0195\7w\2\2\u0195\u0196\7t\2\2\u0196\u0197\7p\2\2\u0197`\3\2\2\2\u0198"+
		"\u0199\7k\2\2\u0199\u019a\7o\2\2\u019a\u019b\7r\2\2\u019b\u019c\7q\2\2"+
		"\u019c\u019d\7t\2\2\u019d\u019e\7v\2\2\u019eb\3\2\2\2\u019f\u01a0\7v\2"+
		"\2\u01a0\u01a1\7j\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7u\2\2\u01a3d\3\2"+
		"\2\2\u01a4\u01a5\7u\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7r\2\2\u01a7\u01a8"+
		"\7g\2\2\u01a8\u01a9\7t\2\2\u01a9f\3\2\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac"+
		"\7h\2\2\u01ach\3\2\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7n\2\2\u01af\u01b0"+
		"\7u\2\2\u01b0\u01b1\7g\2\2\u01b1j\3\2\2\2\u01b2\u01b3\7y\2\2\u01b3\u01b4"+
		"\7j\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7n\2\2\u01b6\u01b7\7g\2\2\u01b7"+
		"l\3\2\2\2\u01b8\u01b9\7h\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7t\2\2\u01bb"+
		"n\3\2\2\2\u01bc\u01bd\7h\2\2\u01bd\u01be\7q\2\2\u01be\u01bf\7t\2\2\u01bf"+
		"\u01c0\7g\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7e\2\2\u01c2\u01c3\7j\2\2"+
		"\u01c3p\3\2\2\2\u01c4\u01c5\7e\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7p\2"+
		"\2\u01c7\u01c8\7v\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb"+
		"\7w\2\2\u01cb\u01cc\7g\2\2\u01ccr\3\2\2\2\u01cd\u01ce\7d\2\2\u01ce\u01cf"+
		"\7t\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7m\2\2\u01d2"+
		"t\3\2\2\2\u01d3\u01d4\7{\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7g\2\2\u01d6"+
		"\u01d7\7n\2\2\u01d7\u01d8\7f\2\2\u01d8v\3\2\2\2\u01d9\u01da\7v\2\2\u01da"+
		"\u01db\7t\2\2\u01db\u01dc\7{\2\2\u01dcx\3\2\2\2\u01dd\u01de\7e\2\2\u01de"+
		"\u01df\7c\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7e\2\2\u01e1\u01e2\7j\2\2"+
		"\u01e2z\3\2\2\2\u01e3\u01e4\7u\2\2\u01e4\u01e5\7y\2\2\u01e5\u01e6\7k\2"+
		"\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7e\2\2\u01e8\u01e9\7j\2\2\u01e9|\3\2"+
		"\2\2\u01ea\u01eb\7e\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee"+
		"\7g\2\2\u01ee~\3\2\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1\7o\2\2\u01f1\u01f2"+
		"\7r\2\2\u01f2\u01f3\7n\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7o\2\2\u01f5"+
		"\u01f6\7g\2\2\u01f6\u01f7\7p\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7u\2\2"+
		"\u01f9\u0080\3\2\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7z\2\2\u01fc\u01fd"+
		"\7v\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7p\2\2\u01ff\u0200\7f\2\2\u0200"+
		"\u0201\7u\2\2\u0201\u0082\3\2\2\2\u0202\u0203\7r\2\2\u0203\u0204\7t\2"+
		"\2\u0204\u0205\7k\2\2\u0205\u0206\7x\2\2\u0206\u0207\7c\2\2\u0207\u0208"+
		"\7v\2\2\u0208\u0209\7g\2\2\u0209\u0084\3\2\2\2\u020a\u020b\7r\2\2\u020b"+
		"\u020c\7t\2\2\u020c\u020d\7q\2\2\u020d\u020e\7v\2\2\u020e\u020f\7g\2\2"+
		"\u020f\u0210\7e\2\2\u0210\u0211\7v\2\2\u0211\u0212\7g\2\2\u0212\u0213"+
		"\7f\2\2\u0213\u0086\3\2\2\2\u0214\u0215\7p\2\2\u0215\u0216\7c\2\2\u0216"+
		"\u0217\7v\2\2\u0217\u0218\7k\2\2\u0218\u0219\7x\2\2\u0219\u021a\7g\2\2"+
		"\u021a\u0088\3\2\2\2\u021b\u021c\7x\2\2\u021c\u021d\7q\2\2\u021d\u021e"+
		"\7n\2\2\u021e\u021f\7c\2\2\u021f\u0220\7v\2\2\u0220\u0221\7k\2\2\u0221"+
		"\u0222\7n\2\2\u0222\u0223\7g\2\2\u0223\u008a\3\2\2\2\u0224\u0225\7c\2"+
		"\2\u0225\u0226\7d\2\2\u0226\u0227\7u\2\2\u0227\u0228\7v\2\2\u0228\u0229"+
		"\7t\2\2\u0229\u022a\7c\2\2\u022a\u022b\7e\2\2\u022b\u022c\7v\2\2\u022c"+
		"\u008c\3\2\2\2\u022d\u022e\7f\2\2\u022e\u022f\7g\2\2\u022f\u0230\7h\2"+
		"\2\u0230\u0231\7c\2\2\u0231\u0232\7w\2\2\u0232\u0233\7n\2\2\u0233\u0234"+
		"\7v\2\2\u0234\u008e\3\2\2\2\u0235\u0236\7c\2\2\u0236\u0237\7u\2\2\u0237"+
		"\u0238\7{\2\2\u0238\u0239\7p\2\2\u0239\u023a\7e\2\2\u023a\u0090\3\2\2"+
		"\2\u023b\u023c\7u\2\2\u023c\u023d\7v\2\2\u023d\u023e\7c\2\2\u023e\u023f"+
		"\7v\2\2\u023f\u0240\7k\2\2\u0240\u0241\7e\2\2\u0241\u0092\3\2\2\2\u0242"+
		"\u0243\7u\2\2\u0243\u0244\7{\2\2\u0244\u0245\7p\2\2\u0245\u0246\7e\2\2"+
		"\u0246\u0247\7j\2\2\u0247\u0248\7t\2\2\u0248\u0249\7q\2\2\u0249\u024a"+
		"\7p\2\2\u024a\u024b\7k\2\2\u024b\u024c\7|\2\2\u024c\u024d\7g\2\2\u024d"+
		"\u024e\7f\2\2\u024e\u0094\3\2\2\2\u024f\u0250\7k\2\2\u0250\u0251\7u\2"+
		"\2\u0251\u0096\3\2\2\2\u0252\u0253\7p\2\2\u0253\u0254\7q\2\2\u0254\u0255"+
		"\7v\2\2\u0255\u0098\3\2\2\2\u0256\u0257\7#\2\2\u0257\u009a\3\2\2\2\u0258"+
		"\u0259\5\31\r\2\u0259\u009c\3\2\2\2\u025a\u025b\5\31\r\2\u025b\u025c\5"+
		"\31\r\2\u025c\u009e\3\2\2\2\u025d\u025e\5\u0099M\2\u025e\u025f\5\31\r"+
		"\2\u025f\u00a0\3\2\2\2\u0260\u0261\7>\2\2\u0261\u0262\7@\2\2\u0262\u00a2"+
		"\3\2\2\2\u0263\u0264\7\u0080\2\2\u0264\u00a4\3\2\2\2\u0265\u0266\7#\2"+
		"\2\u0266\u0267\7\u0080\2\2\u0267\u00a6\3\2\2\2\u0268\u0269\7@\2\2\u0269"+
		"\u00a8\3\2\2\2\u026a\u026b\7@\2\2\u026b\u026c\7?\2\2\u026c\u00aa\3\2\2"+
		"\2\u026d\u026e\7>\2\2\u026e\u00ac\3\2\2\2\u026f\u0270\7>\2\2\u0270\u0271"+
		"\7?\2\2\u0271\u00ae\3\2\2\2\u0272\u0273\7~\2\2\u0273\u00b0\3\2\2\2\u0274"+
		"\u0275\7~\2\2\u0275\u0276\7~\2\2\u0276\u00b2\3\2\2\2\u0277\u0278\7(\2"+
		"\2\u0278\u00b4\3\2\2\2\u0279\u027a\7(\2\2\u027a\u027b\7(\2\2\u027b\u00b6"+
		"\3\2\2\2\u027c\u027d\5\25\13\2\u027d\u00b8\3\2\2\2\u027e\u027f\5\27\f"+
		"\2\u027f\u00ba\3\2\2\2\u0280\u0281\7\61\2\2\u0281\u00bc\3\2\2\2\u0282"+
		"\u0283\7,\2\2\u0283\u00be\3\2\2\2\u0284\u0285\7\'\2\2\u0285\u00c0\3\2"+
		"\2\2\u0286\u0287\5\25\13\2\u0287\u0288\5\25\13\2\u0288\u00c2\3\2\2\2\u0289"+
		"\u028a\5\27\f\2\u028a\u028b\5\27\f\2\u028b\u00c4\3\2\2\2\u028c\u028d\5"+
		"\31\r\2\u028d\u028e\5\25\13\2\u028e\u00c6\3\2\2\2\u028f\u0290\5\31\r\2"+
		"\u0290\u0291\5\27\f\2\u0291\u00c8\3\2\2\2\u0292\u0293\5\31\r\2\u0293\u0294"+
		"\5\u00bd_\2\u0294\u00ca\3\2\2\2\u0295\u0296\5\31\r\2\u0296\u0297\5\u00bb"+
		"^\2\u0297\u00cc\3\2\2\2\u0298\u0299\5\31\r\2\u0299\u029a\5\u00bf`\2\u029a"+
		"\u00ce\3\2\2\2\u029b\u02a0\5#\22\2\u029c\u029f\5#\22\2\u029d\u029f\5\35"+
		"\17\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u00d0\3\2\2\2\u02a2\u02a0\3\2"+
		"\2\2\u02a3\u02a4\7\61\2\2\u02a4\u02a5\7,\2\2\u02a5\u02a9\3\2\2\2\u02a6"+
		"\u02a8\13\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02aa\3"+
		"\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02ad\7,\2\2\u02ad\u02ae\7\61\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\bi"+
		"\2\2\u02b0\u00d2\3\2\2\2\u02b1\u02b2\7\61\2\2\u02b2\u02b3\7\61\2\2\u02b3"+
		"\u02b7\3\2\2\2\u02b4\u02b6\n\b\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2"+
		"\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bb\bj\2\2\u02bb\u00d4\3\2\2\2\u02bc\u02be\t\t"+
		"\2\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\bk\2\2\u02c2\u00d6\3\2"+
		"\2\2\22\2\u00ec\u00fd\u0102\u0126\u0130\u0133\u013d\u0140\u0146\u0152"+
		"\u029e\u02a0\u02a9\u02b7\u02bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}