// Generated from /Users/matthias/Projekte/kawa-lang/src/main/java/io/spotnext/kawa/lang/Kawa.g4 by ANTLR 4.7.1
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
	public static final int
		RULE_qualifiedName = 0, RULE_qualifiedNameElement = 1, RULE_importsDeclaration = 2, 
		RULE_importRename = 3, RULE_packageName = 4, RULE_packageDeclaration = 5, 
		RULE_compilationUnit = 6, RULE_extendsDeclaration = 7, RULE_implementsDeclaration = 8, 
		RULE_genericArgument = 9, RULE_genericArguments = 10, RULE_classModifiers = 11, 
		RULE_className = 12, RULE_classDeclaration = 13, RULE_interfaceModifiers = 14, 
		RULE_interfaceName = 15, RULE_interfaceDeclaration = 16, RULE_enumModifiers = 17, 
		RULE_enumName = 18, RULE_enumValueDeclarationArgument = 19, RULE_enumValueDeclarationArguments = 20, 
		RULE_enumValueDeclaration = 21, RULE_enumValueDeclarations = 22, RULE_enumDeclaration = 23, 
		RULE_structModifiers = 24, RULE_structName = 25, RULE_structDeclaration = 26, 
		RULE_annotationModifiers = 27, RULE_annotationName = 28, RULE_annotationValue = 29, 
		RULE_annotationDeclaration = 30, RULE_typeLiteral = 31, RULE_casting = 32, 
		RULE_literal = 33, RULE_memberVisibilityModifiers = 34, RULE_assignment = 35, 
		RULE_arguments = 36, RULE_variableName = 37, RULE_variableAccess = 38, 
		RULE_variableDeclaration = 39, RULE_fieldDeclaration = 40, RULE_methodModifiers = 41, 
		RULE_methodName = 42, RULE_methodParameter = 43, RULE_methodParameters = 44, 
		RULE_methodDeclaration = 45, RULE_returnStatement = 46, RULE_methodArguments = 47, 
		RULE_methodInvocation = 48, RULE_variableAssignment = 49, RULE_codeBlock = 50, 
		RULE_listInitialization = 51, RULE_mapKeyValue = 52, RULE_mapKeyValues = 53, 
		RULE_mapInitialization = 54, RULE_test_fieldDeclarations = 55, RULE_test_methodDeclarations = 56;
	public static final String[] ruleNames = {
		"qualifiedName", "qualifiedNameElement", "importsDeclaration", "importRename", 
		"packageName", "packageDeclaration", "compilationUnit", "extendsDeclaration", 
		"implementsDeclaration", "genericArgument", "genericArguments", "classModifiers", 
		"className", "classDeclaration", "interfaceModifiers", "interfaceName", 
		"interfaceDeclaration", "enumModifiers", "enumName", "enumValueDeclarationArgument", 
		"enumValueDeclarationArguments", "enumValueDeclaration", "enumValueDeclarations", 
		"enumDeclaration", "structModifiers", "structName", "structDeclaration", 
		"annotationModifiers", "annotationName", "annotationValue", "annotationDeclaration", 
		"typeLiteral", "casting", "literal", "memberVisibilityModifiers", "assignment", 
		"arguments", "variableName", "variableAccess", "variableDeclaration", 
		"fieldDeclaration", "methodModifiers", "methodName", "methodParameter", 
		"methodParameters", "methodDeclaration", "returnStatement", "methodArguments", 
		"methodInvocation", "variableAssignment", "codeBlock", "listInitialization", 
		"mapKeyValue", "mapKeyValues", "mapInitialization", "test_fieldDeclarations", 
		"test_methodDeclarations"
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
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<QualifiedNameElementContext> qualifiedNameElement() {
			return getRuleContexts(QualifiedNameElementContext.class);
		}
		public QualifiedNameElementContext qualifiedNameElement(int i) {
			return getRuleContext(QualifiedNameElementContext.class,i);
		}
		public List<TerminalNode> DOT_OPERATOR() { return getTokens(KawaParser.DOT_OPERATOR); }
		public TerminalNode DOT_OPERATOR(int i) {
			return getToken(KawaParser.DOT_OPERATOR, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			qualifiedNameElement();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_OPERATOR) {
				{
				{
				setState(115);
				match(DOT_OPERATOR);
				setState(116);
				qualifiedNameElement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class QualifiedNameElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public QualifiedNameElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterQualifiedNameElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitQualifiedNameElement(this);
		}
	}

	public final QualifiedNameElementContext qualifiedNameElement() throws RecognitionException {
		QualifiedNameElementContext _localctx = new QualifiedNameElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedNameElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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

	public static class ImportsDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KawaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportRenameContext importRename() {
			return getRuleContext(ImportRenameContext.class,0);
		}
		public ImportsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterImportsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitImportsDeclaration(this);
		}
	}

	public final ImportsDeclarationContext importsDeclaration() throws RecognitionException {
		ImportsDeclarationContext _localctx = new ImportsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IMPORT);
			setState(125);
			qualifiedName();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(126);
				importRename();
				}
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

	public static class ImportRenameContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(KawaParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public ImportRenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importRename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterImportRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitImportRename(this);
		}
	}

	public final ImportRenameContext importRename() throws RecognitionException {
		ImportRenameContext _localctx = new ImportRenameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(AS);
			setState(130);
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KawaParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(PACKAGE);
			setState(135);
			packageName();
			setState(136);
			match(T__0);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(137);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(138);
				interfaceDeclaration();
				}
				break;
			case 3:
				{
				setState(139);
				enumDeclaration();
				}
				break;
			case 4:
				{
				setState(140);
				structDeclaration();
				}
				break;
			}
			setState(143);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KawaParser.EOF, 0); }
		public List<ImportsDeclarationContext> importsDeclaration() {
			return getRuleContexts(ImportsDeclarationContext.class);
		}
		public ImportsDeclarationContext importsDeclaration(int i) {
			return getRuleContext(ImportsDeclarationContext.class,i);
		}
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
		enterRule(_localctx, 12, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(145);
				importsDeclaration();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			packageDeclaration();
			setState(152);
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

	public static class ExtendsDeclarationContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(KawaParser.EXTENDS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ExtendsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterExtendsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitExtendsDeclaration(this);
		}
	}

	public final ExtendsDeclarationContext extendsDeclaration() throws RecognitionException {
		ExtendsDeclarationContext _localctx = new ExtendsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_extendsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(EXTENDS);
			setState(155);
			className();
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

	public static class ImplementsDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(KawaParser.IMPLEMENTS, 0); }
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public ImplementsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterImplementsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitImplementsDeclaration(this);
		}
	}

	public final ImplementsDeclarationContext implementsDeclaration() throws RecognitionException {
		ImplementsDeclarationContext _localctx = new ImplementsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_implementsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IMPLEMENTS);
			setState(158);
			className();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(159);
				match(T__2);
				setState(160);
				className();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class GenericArgumentContext extends ParserRuleContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(KawaParser.EXTENDS, 0); }
		public GenericArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterGenericArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitGenericArgument(this);
		}
	}

	public final GenericArgumentContext genericArgument() throws RecognitionException {
		GenericArgumentContext _localctx = new GenericArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_genericArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			className();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==IDENTIFIER) {
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(167);
					match(EXTENDS);
					}
				}

				setState(170);
				className();
				}
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

	public static class GenericArgumentsContext extends ParserRuleContext {
		public List<GenericArgumentContext> genericArgument() {
			return getRuleContexts(GenericArgumentContext.class);
		}
		public GenericArgumentContext genericArgument(int i) {
			return getRuleContext(GenericArgumentContext.class,i);
		}
		public GenericArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterGenericArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitGenericArguments(this);
		}
	}

	public final GenericArgumentsContext genericArguments() throws RecognitionException {
		GenericArgumentsContext _localctx = new GenericArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LESS_THAN);
			setState(174);
			genericArgument();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(175);
				match(T__2);
				setState(176);
				genericArgument();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(GREATER_THAN);
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

	public static class ClassModifiersContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(KawaParser.ABSTRACT, 0); }
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public ClassModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterClassModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitClassModifiers(this);
		}
	}

	public final ClassModifiersContext classModifiers() throws RecognitionException {
		ClassModifiersContext _localctx = new ClassModifiersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(184);
				match(ABSTRACT);
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(187);
				match(PRIVATE);
				}
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public GenericArgumentsContext genericArguments() {
			return getRuleContext(GenericArgumentsContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IDENTIFIER);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(191);
				genericArguments();
				}
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassModifiersContext classModifiers() {
			return getRuleContext(ClassModifiersContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(KawaParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ExtendsDeclarationContext extendsDeclaration() {
			return getRuleContext(ExtendsDeclarationContext.class,0);
		}
		public ImplementsDeclarationContext implementsDeclaration() {
			return getRuleContext(ImplementsDeclarationContext.class,0);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			classModifiers();
			setState(195);
			match(CLASS);
			setState(196);
			className();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(197);
				extendsDeclaration();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(200);
				implementsDeclaration();
				}
			}

			setState(203);
			match(T__0);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(204);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(205);
					methodDeclaration();
					}
					break;
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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

	public static class InterfaceModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public InterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitInterfaceModifiers(this);
		}
	}

	public final InterfaceModifiersContext interfaceModifiers() throws RecognitionException {
		InterfaceModifiersContext _localctx = new InterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(213);
				match(PRIVATE);
				}
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

	public static class InterfaceNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitInterfaceName(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceModifiersContext interfaceModifiers() {
			return getRuleContext(InterfaceModifiersContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(KawaParser.INTERFACE, 0); }
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
		public GenericArgumentsContext genericArguments() {
			return getRuleContext(GenericArgumentsContext.class,0);
		}
		public ExtendsDeclarationContext extendsDeclaration() {
			return getRuleContext(ExtendsDeclarationContext.class,0);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			interfaceModifiers();
			setState(219);
			match(INTERFACE);
			setState(220);
			interfaceName();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(221);
				genericArguments();
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(224);
				extendsDeclaration();
				}
			}

			setState(227);
			match(T__0);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(228);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(229);
					methodDeclaration();
					}
					break;
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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

	public static class EnumModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public EnumModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterEnumModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitEnumModifiers(this);
		}
	}

	public final EnumModifiersContext enumModifiers() throws RecognitionException {
		EnumModifiersContext _localctx = new EnumModifiersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(PRIVATE);
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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

	public static class EnumValueDeclarationArgumentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public EnumValueDeclarationArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueDeclarationArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterEnumValueDeclarationArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitEnumValueDeclarationArgument(this);
		}
	}

	public final EnumValueDeclarationArgumentContext enumValueDeclarationArgument() throws RecognitionException {
		EnumValueDeclarationArgumentContext _localctx = new EnumValueDeclarationArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumValueDeclarationArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			literal();
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

	public static class EnumValueDeclarationArgumentsContext extends ParserRuleContext {
		public List<EnumValueDeclarationArgumentContext> enumValueDeclarationArgument() {
			return getRuleContexts(EnumValueDeclarationArgumentContext.class);
		}
		public EnumValueDeclarationArgumentContext enumValueDeclarationArgument(int i) {
			return getRuleContext(EnumValueDeclarationArgumentContext.class,i);
		}
		public EnumValueDeclarationArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueDeclarationArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterEnumValueDeclarationArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitEnumValueDeclarationArguments(this);
		}
	}

	public final EnumValueDeclarationArgumentsContext enumValueDeclarationArguments() throws RecognitionException {
		EnumValueDeclarationArgumentsContext _localctx = new EnumValueDeclarationArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumValueDeclarationArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			enumValueDeclarationArgument();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(244);
				match(T__2);
				setState(245);
				enumValueDeclarationArgument();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnumValueDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public EnumValueDeclarationArgumentsContext enumValueDeclarationArguments() {
			return getRuleContext(EnumValueDeclarationArgumentsContext.class,0);
		}
		public EnumValueDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterEnumValueDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitEnumValueDeclaration(this);
		}
	}

	public final EnumValueDeclarationContext enumValueDeclaration() throws RecognitionException {
		EnumValueDeclarationContext _localctx = new EnumValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumValueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IDENTIFIER);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(252);
				match(T__3);
				setState(253);
				enumValueDeclarationArguments();
				setState(254);
				match(T__4);
				}
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

	public static class EnumValueDeclarationsContext extends ParserRuleContext {
		public List<EnumValueDeclarationContext> enumValueDeclaration() {
			return getRuleContexts(EnumValueDeclarationContext.class);
		}
		public EnumValueDeclarationContext enumValueDeclaration(int i) {
			return getRuleContext(EnumValueDeclarationContext.class,i);
		}
		public EnumValueDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterEnumValueDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitEnumValueDeclarations(this);
		}
	}

	public final EnumValueDeclarationsContext enumValueDeclarations() throws RecognitionException {
		EnumValueDeclarationsContext _localctx = new EnumValueDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumValueDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			enumValueDeclaration();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(259);
				match(T__2);
				setState(260);
				enumValueDeclaration();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KawaParser.ENUM, 0); }
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public EnumModifiersContext enumModifiers() {
			return getRuleContext(EnumModifiersContext.class,0);
		}
		public List<EnumValueDeclarationsContext> enumValueDeclarations() {
			return getRuleContexts(EnumValueDeclarationsContext.class);
		}
		public EnumValueDeclarationsContext enumValueDeclarations(int i) {
			return getRuleContext(EnumValueDeclarationsContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(266);
				enumModifiers();
				}
			}

			setState(269);
			match(ENUM);
			setState(270);
			enumName();
			setState(271);
			match(T__0);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(272);
				enumValueDeclarations();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(278);
				match(T__5);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(279);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(280);
						methodDeclaration();
						}
						break;
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(288);
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

	public static class StructModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public StructModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterStructModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitStructModifiers(this);
		}
	}

	public final StructModifiersContext structModifiers() throws RecognitionException {
		StructModifiersContext _localctx = new StructModifiersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_structModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(PRIVATE);
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

	public static class StructNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public StructNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterStructName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitStructName(this);
		}
	}

	public final StructNameContext structName() throws RecognitionException {
		StructNameContext _localctx = new StructNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(KawaParser.STRUCT, 0); }
		public StructNameContext structName() {
			return getRuleContext(StructNameContext.class,0);
		}
		public StructModifiersContext structModifiers() {
			return getRuleContext(StructModifiersContext.class,0);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(294);
				structModifiers();
				}
			}

			setState(297);
			match(STRUCT);
			setState(298);
			structName();
			setState(299);
			match(T__0);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(300);
				fieldDeclaration();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
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

	public static class AnnotationModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public AnnotationModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterAnnotationModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitAnnotationModifiers(this);
		}
	}

	public final AnnotationModifiersContext annotationModifiers() throws RecognitionException {
		AnnotationModifiersContext _localctx = new AnnotationModifiersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_annotationModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(PRIVATE);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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

	public static class AnnotationValueContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode OF_OERATOR() { return getToken(KawaParser.OF_OERATOR, 0); }
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AnnotationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterAnnotationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitAnnotationValue(this);
		}
	}

	public final AnnotationValueContext annotationValue() throws RecognitionException {
		AnnotationValueContext _localctx = new AnnotationValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotationValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			variableName();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF_OERATOR) {
				{
				setState(313);
				match(OF_OERATOR);
				setState(314);
				typeLiteral();
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(317);
				match(ASSIGN);
				{
				setState(318);
				assignment();
				}
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(321);
				casting();
				}
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

	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION() { return getToken(KawaParser.ANNOTATION, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public AnnotationModifiersContext annotationModifiers() {
			return getRuleContext(AnnotationModifiersContext.class,0);
		}
		public List<AnnotationValueContext> annotationValue() {
			return getRuleContexts(AnnotationValueContext.class);
		}
		public AnnotationValueContext annotationValue(int i) {
			return getRuleContext(AnnotationValueContext.class,i);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterAnnotationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitAnnotationDeclaration(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(324);
				annotationModifiers();
				}
			}

			setState(327);
			match(ANNOTATION);
			setState(328);
			annotationName();
			setState(329);
			match(T__0);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(330);
				annotationValue();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
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

	public static class TypeLiteralContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public TerminalNode OPTIONAL() { return getToken(KawaParser.OPTIONAL, 0); }
		public TerminalNode ARRAY_EMPTY() { return getToken(KawaParser.ARRAY_EMPTY, 0); }
		public GenericArgumentsContext genericArguments() {
			return getRuleContext(GenericArgumentsContext.class,0);
		}
		public TypeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitTypeLiteral(this);
		}
	}

	public final TypeLiteralContext typeLiteral() throws RecognitionException {
		TypeLiteralContext _localctx = new TypeLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(IDENTIFIER);
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_EMPTY) {
					{
					setState(339);
					match(ARRAY_EMPTY);
					}
				}

				}
				break;
			case 2:
				{
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(342);
					genericArguments();
					}
				}

				}
				break;
			}
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(347);
				match(OPTIONAL);
				}
				break;
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

	public static class CastingContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(KawaParser.AS, 0); }
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public CastingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterCasting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitCasting(this);
		}
	}

	public final CastingContext casting() throws RecognitionException {
		CastingContext _localctx = new CastingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(350);
			match(AS);
			setState(351);
			typeLiteral();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(KawaParser.STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(KawaParser.INTEGER_LITERAL, 0); }
		public TerminalNode LONG_LITERAL() { return getToken(KawaParser.LONG_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(KawaParser.FLOAT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(KawaParser.DOUBLE_LITERAL, 0); }
		public TerminalNode HEX_NUMERIC_LITERAL() { return getToken(KawaParser.HEX_NUMERIC_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(KawaParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(KawaParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MemberVisibilityModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(KawaParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(KawaParser.PUBLIC, 0); }
		public MemberVisibilityModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberVisibilityModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMemberVisibilityModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMemberVisibilityModifiers(this);
		}
	}

	public final MemberVisibilityModifiersContext memberVisibilityModifiers() throws RecognitionException {
		MemberVisibilityModifiersContext _localctx = new MemberVisibilityModifiersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_memberVisibilityModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(355);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ListInitializationContext listInitialization() {
			return getRuleContext(ListInitializationContext.class,0);
		}
		public MapInitializationContext mapInitialization() {
			return getRuleContext(MapInitializationContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				variableAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				listInitialization();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				mapInitialization();
				}
				break;
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			assignment();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(366);
				match(T__2);
				setState(367);
				assignment();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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

	public static class VariableAccessContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode THIS() { return getToken(KawaParser.THIS, 0); }
		public TerminalNode DOT_OPERATOR() { return getToken(KawaParser.DOT_OPERATOR, 0); }
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitVariableAccess(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(375);
				match(THIS);
				setState(376);
				match(DOT_OPERATOR);
				}
			}

			setState(379);
			variableName();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(KawaParser.VARIABLE, 0); }
		public TerminalNode FINAL_VARIABLE() { return getToken(KawaParser.FINAL_VARIABLE, 0); }
		public TerminalNode OF_OERATOR() { return getToken(KawaParser.OF_OERATOR, 0); }
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==FINAL_VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(382);
			variableName();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF_OERATOR) {
				{
				setState(383);
				match(OF_OERATOR);
				setState(384);
				typeLiteral();
				}
			}

			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(387);
				match(ASSIGN);
				{
				setState(388);
				assignment();
				}
				}
			}

			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(391);
				casting();
				}
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MemberVisibilityModifiersContext memberVisibilityModifiers() {
			return getRuleContext(MemberVisibilityModifiersContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			memberVisibilityModifiers();
			}
			setState(395);
			variableDeclaration();
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

	public static class MethodModifiersContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(KawaParser.ASYNC, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(KawaParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(KawaParser.NATIVE, 0); }
		public TerminalNode VOLATILE() { return getToken(KawaParser.VOLATILE, 0); }
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(KawaParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(KawaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(KawaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(KawaParser.STATIC, 0); }
		public MethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodModifiers(this);
		}
	}

	public final MethodModifiersContext methodModifiers() throws RecognitionException {
		MethodModifiersContext _localctx = new MethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_methodModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(397);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(400);
				_la = _input.LA(1);
				if ( !(_la==ABSTRACT || _la==STATIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(403);
				match(ASYNC);
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYNCHRONIZED) {
				{
				setState(406);
				match(SYNCHRONIZED);
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(409);
				match(NATIVE);
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOLATILE) {
				{
				setState(412);
				match(VOLATILE);
				}
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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

	public static class MethodParameterContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode OF_OERATOR() { return getToken(KawaParser.OF_OERATOR, 0); }
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodParameter(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_methodParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			variableName();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF_OERATOR) {
				{
				setState(418);
				match(OF_OERATOR);
				setState(419);
				typeLiteral();
				}
			}

			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(422);
				match(ASSIGN);
				{
				setState(423);
				assignment();
				}
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(426);
				casting();
				}
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

	public static class MethodParametersContext extends ParserRuleContext {
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public MethodParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodParameters(this);
		}
	}

	public final MethodParametersContext methodParameters() throws RecognitionException {
		MethodParametersContext _localctx = new MethodParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_methodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			methodParameter();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(430);
				match(T__2);
				setState(431);
				methodParameter();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public TerminalNode METHOD() { return getToken(KawaParser.METHOD, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public TerminalNode OF_OERATOR() { return getToken(KawaParser.OF_OERATOR, 0); }
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public GenericArgumentsContext genericArguments() {
			return getRuleContext(GenericArgumentsContext.class,0);
		}
		public List<MethodParametersContext> methodParameters() {
			return getRuleContexts(MethodParametersContext.class);
		}
		public MethodParametersContext methodParameters(int i) {
			return getRuleContext(MethodParametersContext.class,i);
		}
		public TerminalNode OPTIONAL() { return getToken(KawaParser.OPTIONAL, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			methodModifiers();
			setState(438);
			match(METHOD);
			setState(439);
			methodName();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(440);
				genericArguments();
				}
			}

			setState(443);
			match(ASSIGN);
			setState(444);
			match(T__3);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(445);
				methodParameters();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(T__4);
			setState(452);
			match(OF_OERATOR);
			setState(453);
			typeLiteral();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(454);
				match(OPTIONAL);
				}
			}

			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(457);
				codeBlock();
				}
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KawaParser.RETURN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(RETURN);
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(461);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
			case STRING_LITERAL:
			case INTEGER_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case HEX_NUMERIC_LITERAL:
				{
				setState(462);
				literal();
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

	public static class MethodArgumentsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodArguments(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_methodArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			arguments();
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode DOT_OPERATOR() { return getToken(KawaParser.DOT_OPERATOR, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(KawaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(KawaParser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(467);
					variableAccess();
					}
					break;
				case 2:
					{
					setState(468);
					className();
					}
					break;
				case 3:
					{
					setState(469);
					literal();
					}
					break;
				case 4:
					{
					setState(470);
					match(THIS);
					}
					break;
				case 5:
					{
					setState(471);
					match(SUPER);
					}
					break;
				}
				setState(474);
				match(DOT_OPERATOR);
				}
				break;
			}
			setState(477);
			methodName();
			setState(478);
			match(T__3);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL) | (1L << THIS) | (1L << SUPER))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(479);
				arguments();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(T__4);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public List<VariableAccessContext> variableAccess() {
			return getRuleContexts(VariableAccessContext.class);
		}
		public VariableAccessContext variableAccess(int i) {
			return getRuleContext(VariableAccessContext.class,i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(487);
				variableAccess();
				}
				break;
			case 2:
				{
				setState(488);
				className();
				}
				break;
			case 3:
				{
				setState(489);
				literal();
				}
				break;
			}
			setState(492);
			match(ASSIGN);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(493);
				methodInvocation();
				}
				break;
			case 2:
				{
				setState(494);
				variableAccess();
				}
				break;
			case 3:
				{
				setState(495);
				literal();
				}
				break;
			}
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(498);
				casting();
				}
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public List<MethodInvocationContext> methodInvocation() {
			return getRuleContexts(MethodInvocationContext.class);
		}
		public MethodInvocationContext methodInvocation(int i) {
			return getRuleContext(MethodInvocationContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__0);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL) | (1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << THIS) | (1L << SUPER))) != 0) || _la==IDENTIFIER) {
				{
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(502);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(503);
					variableAssignment();
					}
					break;
				case 3:
					{
					setState(504);
					methodInvocation();
					}
					break;
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(510);
				returnStatement();
				}
			}

			setState(513);
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

	public static class ListInitializationContext extends ParserRuleContext {
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public ListInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterListInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitListInitialization(this);
		}
	}

	public final ListInitializationContext listInitialization() throws RecognitionException {
		ListInitializationContext _localctx = new ListInitializationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_listInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__6);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL) | (1L << THIS) | (1L << SUPER))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(516);
				arguments();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(T__7);
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

	public static class MapKeyValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(KawaParser.STRING_LITERAL, 0); }
		public TerminalNode OF_OERATOR() { return getToken(KawaParser.OF_OERATOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MapKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMapKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMapKeyValue(this);
		}
	}

	public final MapKeyValueContext mapKeyValue() throws RecognitionException {
		MapKeyValueContext _localctx = new MapKeyValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_mapKeyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(STRING_LITERAL);
			setState(525);
			match(OF_OERATOR);
			setState(526);
			assignment();
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

	public static class MapKeyValuesContext extends ParserRuleContext {
		public List<MapKeyValueContext> mapKeyValue() {
			return getRuleContexts(MapKeyValueContext.class);
		}
		public MapKeyValueContext mapKeyValue(int i) {
			return getRuleContext(MapKeyValueContext.class,i);
		}
		public MapKeyValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapKeyValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMapKeyValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMapKeyValues(this);
		}
	}

	public final MapKeyValuesContext mapKeyValues() throws RecognitionException {
		MapKeyValuesContext _localctx = new MapKeyValuesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_mapKeyValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			mapKeyValue();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(529);
				match(T__2);
				setState(530);
				mapKeyValue();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MapInitializationContext extends ParserRuleContext {
		public List<MapKeyValuesContext> mapKeyValues() {
			return getRuleContexts(MapKeyValuesContext.class);
		}
		public MapKeyValuesContext mapKeyValues(int i) {
			return getRuleContext(MapKeyValuesContext.class,i);
		}
		public MapInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMapInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMapInitialization(this);
		}
	}

	public final MapInitializationContext mapInitialization() throws RecognitionException {
		MapInitializationContext _localctx = new MapInitializationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mapInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__0);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING_LITERAL) {
				{
				{
				setState(537);
				mapKeyValues();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
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

	public static class Test_fieldDeclarationsContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public Test_fieldDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_fieldDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterTest_fieldDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitTest_fieldDeclarations(this);
		}
	}

	public final Test_fieldDeclarationsContext test_fieldDeclarations() throws RecognitionException {
		Test_fieldDeclarationsContext _localctx = new Test_fieldDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_test_fieldDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(545);
				fieldDeclaration();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Test_methodDeclarationsContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public Test_methodDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_methodDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterTest_methodDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitTest_methodDeclarations(this);
		}
	}

	public final Test_methodDeclarationsContext test_methodDeclarations() throws RecognitionException {
		Test_methodDeclarationsContext _localctx = new Test_methodDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_test_methodDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				{
				setState(551);
				methodDeclaration();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3a\u0230\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\7\2x\n"+
		"\2\f\2\16\2{\13\2\3\3\3\3\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\7\3\7\3\b\7\b\u0095\n\b"+
		"\f\b\16\b\u0098\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00a4"+
		"\n\n\f\n\16\n\u00a7\13\n\3\13\3\13\5\13\u00ab\n\13\3\13\5\13\u00ae\n\13"+
		"\3\f\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\f\3\f\3\r\5\r\u00bc"+
		"\n\r\3\r\5\r\u00bf\n\r\3\16\3\16\5\16\u00c3\n\16\3\17\3\17\3\17\3\17\5"+
		"\17\u00c9\n\17\3\17\5\17\u00cc\n\17\3\17\3\17\3\17\7\17\u00d1\n\17\f\17"+
		"\16\17\u00d4\13\17\3\17\3\17\3\20\5\20\u00d9\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00e1\n\22\3\22\5\22\u00e4\n\22\3\22\3\22\3\22\7\22\u00e9"+
		"\n\22\f\22\16\22\u00ec\13\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\7\26\u00f9\n\26\f\26\16\26\u00fc\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u0103\n\27\3\30\3\30\3\30\7\30\u0108\n\30\f\30\16\30\u010b"+
		"\13\30\3\31\5\31\u010e\n\31\3\31\3\31\3\31\3\31\7\31\u0114\n\31\f\31\16"+
		"\31\u0117\13\31\3\31\3\31\3\31\7\31\u011c\n\31\f\31\16\31\u011f\13\31"+
		"\5\31\u0121\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\5\34\u012a\n\34\3"+
		"\34\3\34\3\34\3\34\7\34\u0130\n\34\f\34\16\34\u0133\13\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u013e\n\37\3\37\3\37\5\37\u0142"+
		"\n\37\3\37\5\37\u0145\n\37\3 \5 \u0148\n \3 \3 \3 \3 \7 \u014e\n \f \16"+
		" \u0151\13 \3 \3 \3!\3!\5!\u0157\n!\3!\5!\u015a\n!\5!\u015c\n!\3!\5!\u015f"+
		"\n!\3\"\3\"\3\"\3#\3#\3$\5$\u0167\n$\3%\3%\3%\3%\3%\5%\u016e\n%\3&\3&"+
		"\3&\7&\u0173\n&\f&\16&\u0176\13&\3\'\3\'\3(\3(\5(\u017c\n(\3(\3(\3)\3"+
		")\3)\3)\5)\u0184\n)\3)\3)\5)\u0188\n)\3)\5)\u018b\n)\3*\3*\3*\3+\5+\u0191"+
		"\n+\3+\5+\u0194\n+\3+\5+\u0197\n+\3+\5+\u019a\n+\3+\5+\u019d\n+\3+\5+"+
		"\u01a0\n+\3,\3,\3-\3-\3-\5-\u01a7\n-\3-\3-\5-\u01ab\n-\3-\5-\u01ae\n-"+
		"\3.\3.\3.\7.\u01b3\n.\f.\16.\u01b6\13.\3/\3/\3/\3/\5/\u01bc\n/\3/\3/\3"+
		"/\7/\u01c1\n/\f/\16/\u01c4\13/\3/\3/\3/\3/\5/\u01ca\n/\3/\5/\u01cd\n/"+
		"\3\60\3\60\3\60\5\60\u01d2\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u01db\n\62\3\62\5\62\u01de\n\62\3\62\3\62\3\62\7\62\u01e3\n\62\f\62\16"+
		"\62\u01e6\13\62\3\62\3\62\3\63\3\63\3\63\5\63\u01ed\n\63\3\63\3\63\3\63"+
		"\3\63\5\63\u01f3\n\63\3\63\5\63\u01f6\n\63\3\64\3\64\3\64\3\64\7\64\u01fc"+
		"\n\64\f\64\16\64\u01ff\13\64\3\64\5\64\u0202\n\64\3\64\3\64\3\65\3\65"+
		"\7\65\u0208\n\65\f\65\16\65\u020b\13\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\7\67\u0216\n\67\f\67\16\67\u0219\13\67\38\38\78\u021d"+
		"\n8\f8\168\u0220\138\38\38\39\79\u0225\n9\f9\169\u0228\139\3:\7:\u022b"+
		"\n:\f:\16:\u022e\13:\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\6\3\2\21\30\3\2\67"+
		"9\3\2\37 \4\2<<??\2\u024c\2t\3\2\2\2\4|\3\2\2\2\6~\3\2\2\2\b\u0083\3\2"+
		"\2\2\n\u0086\3\2\2\2\f\u0088\3\2\2\2\16\u0096\3\2\2\2\20\u009c\3\2\2\2"+
		"\22\u009f\3\2\2\2\24\u00a8\3\2\2\2\26\u00af\3\2\2\2\30\u00bb\3\2\2\2\32"+
		"\u00c0\3\2\2\2\34\u00c4\3\2\2\2\36\u00d8\3\2\2\2 \u00da\3\2\2\2\"\u00dc"+
		"\3\2\2\2$\u00ef\3\2\2\2&\u00f1\3\2\2\2(\u00f3\3\2\2\2*\u00f5\3\2\2\2,"+
		"\u00fd\3\2\2\2.\u0104\3\2\2\2\60\u010d\3\2\2\2\62\u0124\3\2\2\2\64\u0126"+
		"\3\2\2\2\66\u0129\3\2\2\28\u0136\3\2\2\2:\u0138\3\2\2\2<\u013a\3\2\2\2"+
		">\u0147\3\2\2\2@\u0154\3\2\2\2B\u0160\3\2\2\2D\u0163\3\2\2\2F\u0166\3"+
		"\2\2\2H\u016d\3\2\2\2J\u016f\3\2\2\2L\u0177\3\2\2\2N\u017b\3\2\2\2P\u017f"+
		"\3\2\2\2R\u018c\3\2\2\2T\u0190\3\2\2\2V\u01a1\3\2\2\2X\u01a3\3\2\2\2Z"+
		"\u01af\3\2\2\2\\\u01b7\3\2\2\2^\u01ce\3\2\2\2`\u01d3\3\2\2\2b\u01dd\3"+
		"\2\2\2d\u01ec\3\2\2\2f\u01f7\3\2\2\2h\u0205\3\2\2\2j\u020e\3\2\2\2l\u0212"+
		"\3\2\2\2n\u021a\3\2\2\2p\u0226\3\2\2\2r\u022c\3\2\2\2ty\5\4\3\2uv\7\16"+
		"\2\2vx\5\4\3\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\3\3\2\2\2{y\3"+
		"\2\2\2|}\7^\2\2}\5\3\2\2\2~\177\7&\2\2\177\u0081\5\2\2\2\u0080\u0082\5"+
		"\b\5\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083\u0084"+
		"\7\"\2\2\u0084\u0085\7^\2\2\u0085\t\3\2\2\2\u0086\u0087\7^\2\2\u0087\13"+
		"\3\2\2\2\u0088\u0089\7\31\2\2\u0089\u008a\5\n\6\2\u008a\u008f\7\3\2\2"+
		"\u008b\u0090\5\34\17\2\u008c\u0090\5\"\22\2\u008d\u0090\5\60\31\2\u008e"+
		"\u0090\5\66\34\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\4\2\2\u0092"+
		"\r\3\2\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7\2\2\3\u009b\17\3\2\2\2\u009c"+
		"\u009d\7\66\2\2\u009d\u009e\5\32\16\2\u009e\21\3\2\2\2\u009f\u00a0\7\65"+
		"\2\2\u00a0\u00a5\5\32\16\2\u00a1\u00a2\7\5\2\2\u00a2\u00a4\5\32\16\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\23\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ad\5\32\16\2\u00a9"+
		"\u00ab\7\66\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00ae\5\32\16\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00b0\7L\2\2\u00b0\u00b5\5\24\13\2\u00b1\u00b2\7\5\2"+
		"\2\u00b2\u00b4\5\24\13\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7J\2\2\u00b9\27\3\2\2\2\u00ba\u00bc\7<\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\7\67\2\2"+
		"\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00c2"+
		"\7^\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\33\3\2\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7\32\2\2\u00c6\u00c8\5\32"+
		"\16\2\u00c7\u00c9\5\20\t\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00cc\5\22\n\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d2\7\3\2\2\u00ce\u00d1\5R*\2\u00cf"+
		"\u00d1\5\\/\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\4\2\2\u00d6\35\3\2\2\2\u00d7\u00d9\7\67\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\37\3\2\2\2\u00da\u00db"+
		"\7^\2\2\u00db!\3\2\2\2\u00dc\u00dd\5\36\20\2\u00dd\u00de\7\33\2\2\u00de"+
		"\u00e0\5 \21\2\u00df\u00e1\5\26\f\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\5\20\t\2\u00e3\u00e2\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ea\7\3\2\2\u00e6\u00e9\5R"+
		"*\2\u00e7\u00e9\5\\/\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\4\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\67\2\2"+
		"\u00f0%\3\2\2\2\u00f1\u00f2\7^\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\5D#\2\u00f4"+
		")\3\2\2\2\u00f5\u00fa\5(\25\2\u00f6\u00f7\7\5\2\2\u00f7\u00f9\5(\25\2"+
		"\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb+\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0102\7^\2\2\u00fe\u00ff"+
		"\7\6\2\2\u00ff\u0100\5*\26\2\u0100\u0101\7\7\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00fe\3\2\2\2\u0102\u0103\3\2\2\2\u0103-\3\2\2\2\u0104\u0109\5,\27\2"+
		"\u0105\u0106\7\5\2\2\u0106\u0108\5,\27\2\u0107\u0105\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a/\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010e\5$\23\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\34\2\2\u0110\u0111\5&\24\2\u0111"+
		"\u0115\7\3\2\2\u0112\u0114\5.\30\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0120\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011d\7\b\2\2\u0119\u011c\5R*\2\u011a\u011c\5\\/"+
		"\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0118\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\4"+
		"\2\2\u0123\61\3\2\2\2\u0124\u0125\7\67\2\2\u0125\63\3\2\2\2\u0126\u0127"+
		"\7^\2\2\u0127\65\3\2\2\2\u0128\u012a\5\62\32\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\35\2\2\u012c\u012d\5"+
		"\64\33\2\u012d\u0131\7\3\2\2\u012e\u0130\5R*\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\4\2\2\u0135\67\3\2\2\2\u0136\u0137"+
		"\7\67\2\2\u01379\3\2\2\2\u0138\u0139\7^\2\2\u0139;\3\2\2\2\u013a\u013d"+
		"\5L\'\2\u013b\u013c\7\f\2\2\u013c\u013e\5@!\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u0140\7D\2\2\u0140\u0142\5H%"+
		"\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0145"+
		"\5B\"\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145=\3\2\2\2\u0146\u0148"+
		"\58\35\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\7\36\2\2\u014a\u014b\5:\36\2\u014b\u014f\7\3\2\2\u014c\u014e\5"+
		"<\37\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\4"+
		"\2\2\u0153?\3\2\2\2\u0154\u015b\7^\2\2\u0155\u0157\7\r\2\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015c\3\2\2\2\u0158\u015a\5\26\f\2"+
		"\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0156"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\7\13\2\2"+
		"\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015fA\3\2\2\2\u0160\u0161\7"+
		"\"\2\2\u0161\u0162\5@!\2\u0162C\3\2\2\2\u0163\u0164\t\2\2\2\u0164E\3\2"+
		"\2\2\u0165\u0167\t\3\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"G\3\2\2\2\u0168\u016e\5N(\2\u0169\u016e\5D#\2\u016a\u016e\5b\62\2\u016b"+
		"\u016e\5h\65\2\u016c\u016e\5n8\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2"+
		"\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016eI"+
		"\3\2\2\2\u016f\u0174\5H%\2\u0170\u0171\7\5\2\2\u0171\u0173\5H%\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175K\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7^\2\2\u0178M\3\2"+
		"\2\2\u0179\u017a\7\'\2\2\u017a\u017c\7\16\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5L\'\2\u017eO\3\2\2\2\u017f"+
		"\u0180\t\4\2\2\u0180\u0183\5L\'\2\u0181\u0182\7\f\2\2\u0182\u0184\5@!"+
		"\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0186"+
		"\7D\2\2\u0186\u0188\5H%\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u018b\5B\"\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018bQ\3\2\2\2\u018c\u018d\5F$\2\u018d\u018e\5P)\2\u018eS\3\2\2\2"+
		"\u018f\u0191\t\3\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193"+
		"\3\2\2\2\u0192\u0194\t\5\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0197\7>\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u019a\7@\2\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\7:\2\2\u019c\u019b\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\7;\2\2\u019f"+
		"\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0U\3\2\2\2\u01a1\u01a2\7^\2\2\u01a2"+
		"W\3\2\2\2\u01a3\u01a6\5L\'\2\u01a4\u01a5\7\f\2\2\u01a5\u01a7\5@!\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a9\7D"+
		"\2\2\u01a9\u01ab\5H%\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u01ae\5B\"\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"Y\3\2\2\2\u01af\u01b4\5X-\2\u01b0\u01b1\7\5\2\2\u01b1\u01b3\5X-\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5[\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\5T+\2\u01b8\u01b9"+
		"\7!\2\2\u01b9\u01bb\5V,\2\u01ba\u01bc\5\26\f\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7D\2\2\u01be\u01c2\7\6"+
		"\2\2\u01bf\u01c1\5Z.\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c6\7\7\2\2\u01c6\u01c7\7\f\2\2\u01c7\u01c9\5@!\2\u01c8\u01ca\7\13"+
		"\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01cd\5f\64\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd]\3\2\2\2"+
		"\u01ce\u01d1\7%\2\2\u01cf\u01d2\7^\2\2\u01d0\u01d2\5D#\2\u01d1\u01cf\3"+
		"\2\2\2\u01d1\u01d0\3\2\2\2\u01d2_\3\2\2\2\u01d3\u01d4\5J&\2\u01d4a\3\2"+
		"\2\2\u01d5\u01db\5N(\2\u01d6\u01db\5\32\16\2\u01d7\u01db\5D#\2\u01d8\u01db"+
		"\7\'\2\2\u01d9\u01db\7(\2\2\u01da\u01d5\3\2\2\2\u01da\u01d6\3\2\2\2\u01da"+
		"\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01de\7\16\2\2\u01dd\u01da\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\5V,\2\u01e0\u01e4\7\6\2\2\u01e1\u01e3\5J&\2"+
		"\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7\7\2\2\u01e8"+
		"c\3\2\2\2\u01e9\u01ed\5N(\2\u01ea\u01ed\5\32\16\2\u01eb\u01ed\5D#\2\u01ec"+
		"\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f2\7D\2\2\u01ef\u01f3\5b\62\2\u01f0\u01f3\5N(\2\u01f1\u01f3"+
		"\5D#\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01f6\5B\"\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6e\3\2\2\2\u01f7\u01fd\7\3\2\2\u01f8\u01fc\5P)\2\u01f9\u01fc"+
		"\5d\63\2\u01fa\u01fc\5b\62\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\5^\60\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\4"+
		"\2\2\u0204g\3\2\2\2\u0205\u0209\7\t\2\2\u0206\u0208\5J&\2\u0207\u0206"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\n\2\2\u020di\3\2\2\2"+
		"\u020e\u020f\7\23\2\2\u020f\u0210\7\f\2\2\u0210\u0211\5H%\2\u0211k\3\2"+
		"\2\2\u0212\u0217\5j\66\2\u0213\u0214\7\5\2\2\u0214\u0216\5j\66\2\u0215"+
		"\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218m\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021e\7\3\2\2\u021b\u021d"+
		"\5l\67\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7\4"+
		"\2\2\u0222o\3\2\2\2\u0223\u0225\5R*\2\u0224\u0223\3\2\2\2\u0225\u0228"+
		"\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227q\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0229\u022b\5\\/\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2"+
		"\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022ds\3\2\2\2\u022e\u022c"+
		"\3\2\2\2My\u0081\u008f\u0096\u00a5\u00aa\u00ad\u00b5\u00bb\u00be\u00c2"+
		"\u00c8\u00cb\u00d0\u00d2\u00d8\u00e0\u00e3\u00e8\u00ea\u00fa\u0102\u0109"+
		"\u010d\u0115\u011b\u011d\u0120\u0129\u0131\u013d\u0141\u0144\u0147\u014f"+
		"\u0156\u0159\u015b\u015e\u0166\u016d\u0174\u017b\u0183\u0187\u018a\u0190"+
		"\u0193\u0196\u0199\u019c\u019f\u01a6\u01aa\u01ad\u01b4\u01bb\u01c2\u01c9"+
		"\u01cc\u01d1\u01da\u01dd\u01e4\u01ec\u01f2\u01f5\u01fb\u01fd\u0201\u0209"+
		"\u0217\u021e\u0226\u022c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}