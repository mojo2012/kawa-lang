// Generated from /Users/matthias.fuchs.lokal/Projekte/privat/kawa-lang/src/main/java/io/spotnext/kawa/lang/Kawa.g4 by ANTLR 4.7.1
package io.spotnext.kawa.lang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KawaParser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_kPackage = 1, RULE_kClass = 2, RULE_kInterface = 3, 
		RULE_kEenum = 4, RULE_kStruct = 5, RULE_kMemberVisibilityModifiers = 6, 
		RULE_kVariable = 7, RULE_kMethod = 8;
	public static final String[] ruleNames = {
		"compilationUnit", "kPackage", "kClass", "kInterface", "kEenum", "kStruct", 
		"kMemberVisibilityModifiers", "kVariable", "kMethod"
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

	@Override
	public String getGrammarFileName() { return "Kawa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KawaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public KPackageContext kPackage() {
			return getRuleContext(KPackageContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KawaParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			kPackage();
			setState(19);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KPackageContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KawaParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public List<KClassContext> kClass() {
			return getRuleContexts(KClassContext.class);
		}
		public KClassContext kClass(int i) {
			return getRuleContext(KClassContext.class,i);
		}
		public List<KInterfaceContext> kInterface() {
			return getRuleContexts(KInterfaceContext.class);
		}
		public KInterfaceContext kInterface(int i) {
			return getRuleContext(KInterfaceContext.class,i);
		}
		public List<KEenumContext> kEenum() {
			return getRuleContexts(KEenumContext.class);
		}
		public KEenumContext kEenum(int i) {
			return getRuleContext(KEenumContext.class,i);
		}
		public List<KStructContext> kStruct() {
			return getRuleContexts(KStructContext.class);
		}
		public KStructContext kStruct(int i) {
			return getRuleContext(KStructContext.class,i);
		}
		public KPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKPackage(this);
		}
	}

	public final KPackageContext kPackage() throws RecognitionException {
		KPackageContext _localctx = new KPackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_kPackage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(PACKAGE);
			setState(22);
			match(IDENTIFIER);
			setState(23);
			match(T__0);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << ENUM) | (1L << STRUCT) | (1L << PRIVATE) | (1L << ABSTRACT))) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
				case PRIVATE:
				case ABSTRACT:
					{
					setState(24);
					kClass();
					}
					break;
				case INTERFACE:
					{
					setState(25);
					kInterface();
					}
					break;
				case ENUM:
					{
					setState(26);
					kEenum();
					}
					break;
				case STRUCT:
					{
					setState(27);
					kStruct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(KawaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(KawaParser.ABSTRACT, 0); }
		public List<KVariableContext> kVariable() {
			return getRuleContexts(KVariableContext.class);
		}
		public KVariableContext kVariable(int i) {
			return getRuleContext(KVariableContext.class,i);
		}
		public List<KMethodContext> kMethod() {
			return getRuleContexts(KMethodContext.class);
		}
		public KMethodContext kMethod(int i) {
			return getRuleContext(KMethodContext.class,i);
		}
		public KClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKClass(this);
		}
	}

	public final KClassContext kClass() throws RecognitionException {
		KClassContext _localctx = new KClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_kClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				{
				setState(35);
				match(PRIVATE);
				}
				break;
			case CLASS:
			case ABSTRACT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
				{
				setState(39);
				match(ABSTRACT);
				}
				break;
			case CLASS:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(43);
			match(CLASS);
			setState(44);
			match(IDENTIFIER);
			setState(45);
			match(T__0);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (VARIABLE - 15)) | (1L << (FINAL_VARIABLE - 15)) | (1L << (PRIVATE - 15)) | (1L << (PROTECTED - 15)) | (1L << (ABSTRACT - 15)) | (1L << (ASYNC - 15)) | (1L << (STATIC - 15)) | (1L << (SYNCHRONIZED - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(46);
					kVariable();
					}
					break;
				case 2:
					{
					setState(47);
					kMethod();
					}
					break;
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KInterfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(KawaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public KInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKInterface(this);
		}
	}

	public final KInterfaceContext kInterface() throws RecognitionException {
		KInterfaceContext _localctx = new KInterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kInterface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(INTERFACE);
			setState(56);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KEenumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KawaParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public KEenumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kEenum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKEenum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKEenum(this);
		}
	}

	public final KEenumContext kEenum() throws RecognitionException {
		KEenumContext _localctx = new KEenumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kEenum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ENUM);
			setState(59);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KStructContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(KawaParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public KStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKStruct(this);
		}
	}

	public final KStructContext kStruct() throws RecognitionException {
		KStructContext _localctx = new KStructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(STRUCT);
			setState(62);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KMemberVisibilityModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(KawaParser.PROTECTED, 0); }
		public KMemberVisibilityModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kMemberVisibilityModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKMemberVisibilityModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKMemberVisibilityModifiers(this);
		}
	}

	public final KMemberVisibilityModifiersContext kMemberVisibilityModifiers() throws RecognitionException {
		KMemberVisibilityModifiersContext _localctx = new KMemberVisibilityModifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_kMemberVisibilityModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				{
				setState(64);
				match(PRIVATE);
				}
				break;
			case PROTECTED:
				{
				setState(65);
				match(PROTECTED);
				}
				break;
			case VARIABLE:
			case FINAL_VARIABLE:
			case ABSTRACT:
			case ASYNC:
			case STATIC:
			case SYNCHRONIZED:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KVariableContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(KawaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KawaParser.IDENTIFIER, i);
		}
		public TerminalNode TYPE_DECLARATION() { return getToken(KawaParser.TYPE_DECLARATION, 0); }
		public KMemberVisibilityModifiersContext kMemberVisibilityModifiers() {
			return getRuleContext(KMemberVisibilityModifiersContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(KawaParser.VARIABLE, 0); }
		public TerminalNode FINAL_VARIABLE() { return getToken(KawaParser.FINAL_VARIABLE, 0); }
		public KVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKVariable(this);
		}
	}

	public final KVariableContext kVariable() throws RecognitionException {
		KVariableContext _localctx = new KVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			kMemberVisibilityModifiers();
			}
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==FINAL_VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(TYPE_DECLARATION);
			setState(73);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KMethodContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(KawaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KawaParser.IDENTIFIER, i);
		}
		public TerminalNode TYPE_DECLARATION() { return getToken(KawaParser.TYPE_DECLARATION, 0); }
		public KMemberVisibilityModifiersContext kMemberVisibilityModifiers() {
			return getRuleContext(KMemberVisibilityModifiersContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(KawaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(KawaParser.STATIC, 0); }
		public TerminalNode ASYNC() { return getToken(KawaParser.ASYNC, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(KawaParser.SYNCHRONIZED, 0); }
		public KMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterKMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitKMethod(this);
		}
	}

	public final KMethodContext kMethod() throws RecognitionException {
		KMethodContext _localctx = new KMethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_kMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75);
			kMemberVisibilityModifiers();
			}
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
				{
				setState(76);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				{
				setState(77);
				match(STATIC);
				}
				break;
			case ASYNC:
			case SYNCHRONIZED:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASYNC:
				{
				setState(81);
				match(ASYNC);
				}
				break;
			case SYNCHRONIZED:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNCHRONIZED:
				{
				setState(85);
				match(SYNCHRONIZED);
				}
				break;
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(T__2);
			setState(91);
			match(T__3);
			setState(92);
			match(TYPE_DECLARATION);
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(T__0);
			setState(95);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Md\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3\3\3\4\3\4"+
		"\5\4(\n\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4\16\4\66"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\bF\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nR\n\n\3\n\3\n\5\nV\n\n\3\n"+
		"\3\n\5\nZ\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16"+
		"\20\22\2\3\3\2\21\22\2h\2\24\3\2\2\2\4\27\3\2\2\2\6\'\3\2\2\2\b9\3\2\2"+
		"\2\n<\3\2\2\2\f?\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22M\3\2\2\2\24\25\5\4"+
		"\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\7\f\2\2\30\31\7J\2\2\31 \7\3\2\2"+
		"\32\37\5\6\4\2\33\37\5\b\5\2\34\37\5\n\6\2\35\37\5\f\7\2\36\32\3\2\2\2"+
		"\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !"+
		"\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\4\2\2$\5\3\2\2\2%(\7&\2\2&(\3\2\2\2"+
		"\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2),\7(\2\2*,\3\2\2\2+)\3\2\2\2+*\3\2\2"+
		"\2,-\3\2\2\2-.\7\r\2\2./\7J\2\2/\64\7\3\2\2\60\63\5\20\t\2\61\63\5\22"+
		"\n\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\4\2\28\7\3\2\2\29:\7\16\2\2:;\7"+
		"J\2\2;\t\3\2\2\2<=\7\17\2\2=>\7J\2\2>\13\3\2\2\2?@\7\20\2\2@A\7J\2\2A"+
		"\r\3\2\2\2BF\7&\2\2CF\7\'\2\2DF\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2"+
		"F\17\3\2\2\2GH\5\16\b\2HI\t\2\2\2IJ\7J\2\2JK\7\23\2\2KL\7J\2\2L\21\3\2"+
		"\2\2MQ\5\16\b\2NR\7(\2\2OR\7+\2\2PR\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2"+
		"\2\2RU\3\2\2\2SV\7*\2\2TV\3\2\2\2US\3\2\2\2UT\3\2\2\2VY\3\2\2\2WZ\7,\2"+
		"\2XZ\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\7J\2\2\\]\7\5\2\2]^\7\6"+
		"\2\2^_\7\23\2\2_`\7J\2\2`a\7\3\2\2ab\7\4\2\2b\23\3\2\2\2\f\36 \'+\62\64"+
		"EQUY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}