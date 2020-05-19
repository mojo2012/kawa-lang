// Generated from /Users/matthias/Projekte/kawa-lang/src/main/java/io/spotnext/kawa/lang/parser/Kawa.g4 by ANTLR 4.7.1
package io.spotnext.kawa.lang.parser;
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
		RULE_qualifiedTypeName = 0, RULE_qualifiedTypeNameElement = 1, RULE_qualifiedmemberNameElement = 2, 
		RULE_importsDeclaration = 3, RULE_importRename = 4, RULE_packageName = 5, 
		RULE_packageDeclaration = 6, RULE_compilationUnit = 7, RULE_extendsDeclaration = 8, 
		RULE_implementsDeclaration = 9, RULE_genericArgument = 10, RULE_genericArguments = 11, 
		RULE_classModifiers = 12, RULE_className = 13, RULE_classDeclaration = 14, 
		RULE_interfaceModifiers = 15, RULE_interfaceName = 16, RULE_interfaceDeclaration = 17, 
		RULE_enumModifiers = 18, RULE_enumName = 19, RULE_enumValueDeclarationArgument = 20, 
		RULE_enumValueDeclarationArguments = 21, RULE_enumValueDeclaration = 22, 
		RULE_enumValueDeclarations = 23, RULE_enumDeclaration = 24, RULE_structModifiers = 25, 
		RULE_structName = 26, RULE_structDeclaration = 27, RULE_annotationModifiers = 28, 
		RULE_annotationName = 29, RULE_annotationValue = 30, RULE_annotationDeclaration = 31, 
		RULE_typeLiteral = 32, RULE_casting = 33, RULE_literal = 34, RULE_memberVisibilityModifiers = 35, 
		RULE_assignment = 36, RULE_arguments = 37, RULE_variableName = 38, RULE_variableAccess = 39, 
		RULE_variableDeclaration = 40, RULE_fieldDeclaration = 41, RULE_methodModifiers = 42, 
		RULE_methodName = 43, RULE_methodParameter = 44, RULE_methodParameters = 45, 
		RULE_methodDeclaration = 46, RULE_returnStatement = 47, RULE_methodArguments = 48, 
		RULE_methodInvocation = 49, RULE_variableAssignment = 50, RULE_codeBlock = 51, 
		RULE_listInitialization = 52, RULE_mapKeyValue = 53, RULE_mapKeyValues = 54, 
		RULE_mapInitialization = 55, RULE_test_fieldDeclarations = 56, RULE_test_methodDeclarations = 57;
	public static final String[] ruleNames = {
		"qualifiedTypeName", "qualifiedTypeNameElement", "qualifiedmemberNameElement", 
		"importsDeclaration", "importRename", "packageName", "packageDeclaration", 
		"compilationUnit", "extendsDeclaration", "implementsDeclaration", "genericArgument", 
		"genericArguments", "classModifiers", "className", "classDeclaration", 
		"interfaceModifiers", "interfaceName", "interfaceDeclaration", "enumModifiers", 
		"enumName", "enumValueDeclarationArgument", "enumValueDeclarationArguments", 
		"enumValueDeclaration", "enumValueDeclarations", "enumDeclaration", "structModifiers", 
		"structName", "structDeclaration", "annotationModifiers", "annotationName", 
		"annotationValue", "annotationDeclaration", "typeLiteral", "casting", 
		"literal", "memberVisibilityModifiers", "assignment", "arguments", "variableName", 
		"variableAccess", "variableDeclaration", "fieldDeclaration", "methodModifiers", 
		"methodName", "methodParameter", "methodParameters", "methodDeclaration", 
		"returnStatement", "methodArguments", "methodInvocation", "variableAssignment", 
		"codeBlock", "listInitialization", "mapKeyValue", "mapKeyValues", "mapInitialization", 
		"test_fieldDeclarations", "test_methodDeclarations"
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
	public static class QualifiedTypeNameContext extends ParserRuleContext {
		public List<QualifiedTypeNameElementContext> qualifiedTypeNameElement() {
			return getRuleContexts(QualifiedTypeNameElementContext.class);
		}
		public QualifiedTypeNameElementContext qualifiedTypeNameElement(int i) {
			return getRuleContext(QualifiedTypeNameElementContext.class,i);
		}
		public List<TerminalNode> DOT_OPERATOR() { return getTokens(KawaParser.DOT_OPERATOR); }
		public TerminalNode DOT_OPERATOR(int i) {
			return getToken(KawaParser.DOT_OPERATOR, i);
		}
		public QualifiedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterQualifiedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitQualifiedTypeName(this);
		}
	}

	public final QualifiedTypeNameContext qualifiedTypeName() throws RecognitionException {
		QualifiedTypeNameContext _localctx = new QualifiedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qualifiedTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			qualifiedTypeNameElement();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_OPERATOR) {
				{
				{
				setState(117);
				match(DOT_OPERATOR);
				setState(118);
				qualifiedTypeNameElement();
				}
				}
				setState(123);
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

	public static class QualifiedTypeNameElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public QualifiedTypeNameElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedTypeNameElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterQualifiedTypeNameElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitQualifiedTypeNameElement(this);
		}
	}

	public final QualifiedTypeNameElementContext qualifiedTypeNameElement() throws RecognitionException {
		QualifiedTypeNameElementContext _localctx = new QualifiedTypeNameElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedTypeNameElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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

	public static class QualifiedmemberNameElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public QualifiedmemberNameElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedmemberNameElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterQualifiedmemberNameElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitQualifiedmemberNameElement(this);
		}
	}

	public final QualifiedmemberNameElementContext qualifiedmemberNameElement() throws RecognitionException {
		QualifiedmemberNameElementContext _localctx = new QualifiedmemberNameElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qualifiedmemberNameElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		public QualifiedTypeNameContext qualifiedTypeName() {
			return getRuleContext(QualifiedTypeNameContext.class,0);
		}
		public List<TerminalNode> OF_OERATOR() { return getTokens(KawaParser.OF_OERATOR); }
		public TerminalNode OF_OERATOR(int i) {
			return getToken(KawaParser.OF_OERATOR, i);
		}
		public QualifiedmemberNameElementContext qualifiedmemberNameElement() {
			return getRuleContext(QualifiedmemberNameElementContext.class,0);
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
		enterRule(_localctx, 6, RULE_importsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IMPORT);
			setState(129);
			qualifiedTypeName();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF_OERATOR) {
				{
				setState(130);
				match(OF_OERATOR);
				setState(131);
				match(OF_OERATOR);
				setState(132);
				qualifiedmemberNameElement();
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(135);
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
		enterRule(_localctx, 8, RULE_importRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(AS);
			setState(139);
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
		enterRule(_localctx, 10, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		enterRule(_localctx, 12, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(PACKAGE);
			setState(144);
			packageName();
			setState(145);
			match(T__0);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(146);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(147);
				interfaceDeclaration();
				}
				break;
			case 3:
				{
				setState(148);
				enumDeclaration();
				}
				break;
			case 4:
				{
				setState(149);
				structDeclaration();
				}
				break;
			}
			setState(152);
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
		enterRule(_localctx, 14, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(154);
				importsDeclaration();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			packageDeclaration();
			setState(161);
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
		enterRule(_localctx, 16, RULE_extendsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(EXTENDS);
			setState(164);
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
		enterRule(_localctx, 18, RULE_implementsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IMPLEMENTS);
			setState(167);
			className();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(168);
				match(T__2);
				setState(169);
				className();
				}
				}
				setState(174);
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
		enterRule(_localctx, 20, RULE_genericArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			className();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==IDENTIFIER) {
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(176);
					match(EXTENDS);
					}
				}

				setState(179);
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
		enterRule(_localctx, 22, RULE_genericArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LESS_THAN);
			setState(183);
			genericArgument();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(184);
				match(T__2);
				setState(185);
				genericArgument();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
		enterRule(_localctx, 24, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(193);
				match(ABSTRACT);
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(196);
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
		enterRule(_localctx, 26, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENTIFIER);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(200);
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
		enterRule(_localctx, 28, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			classModifiers();
			setState(204);
			match(CLASS);
			setState(205);
			className();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(206);
				extendsDeclaration();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(209);
				implementsDeclaration();
				}
			}

			setState(212);
			match(T__0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(213);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(214);
					methodDeclaration();
					}
					break;
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
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
		enterRule(_localctx, 30, RULE_interfaceModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(222);
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
		enterRule(_localctx, 32, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 34, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			interfaceModifiers();
			setState(228);
			match(INTERFACE);
			setState(229);
			interfaceName();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(230);
				genericArguments();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(233);
				extendsDeclaration();
				}
			}

			setState(236);
			match(T__0);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(237);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(238);
					methodDeclaration();
					}
					break;
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		enterRule(_localctx, 36, RULE_enumModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 38, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 40, RULE_enumValueDeclarationArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		enterRule(_localctx, 42, RULE_enumValueDeclarationArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			enumValueDeclarationArgument();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(253);
				match(T__2);
				setState(254);
				enumValueDeclarationArgument();
				}
				}
				setState(259);
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
		enterRule(_localctx, 44, RULE_enumValueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IDENTIFIER);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(261);
				match(T__3);
				setState(262);
				enumValueDeclarationArguments();
				setState(263);
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
		enterRule(_localctx, 46, RULE_enumValueDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			enumValueDeclaration();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(268);
				match(T__2);
				setState(269);
				enumValueDeclaration();
				}
				}
				setState(274);
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
		enterRule(_localctx, 48, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(275);
				enumModifiers();
				}
			}

			setState(278);
			match(ENUM);
			setState(279);
			enumName();
			setState(280);
			match(T__0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(281);
				enumValueDeclarations();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(287);
				match(T__5);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(288);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(289);
						methodDeclaration();
						}
						break;
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(297);
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
		enterRule(_localctx, 50, RULE_structModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 52, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 54, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(303);
				structModifiers();
				}
			}

			setState(306);
			match(STRUCT);
			setState(307);
			structName();
			setState(308);
			match(T__0);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(309);
				fieldDeclaration();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
		enterRule(_localctx, 56, RULE_annotationModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 58, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 60, RULE_annotationValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			variableName();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF_OERATOR) {
				{
				setState(322);
				match(OF_OERATOR);
				setState(323);
				typeLiteral();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(326);
				match(ASSIGN);
				{
				setState(327);
				assignment();
				}
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(330);
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
		enterRule(_localctx, 62, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(333);
				annotationModifiers();
				}
			}

			setState(336);
			match(ANNOTATION);
			setState(337);
			annotationName();
			setState(338);
			match(T__0);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(339);
				annotationValue();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
		enterRule(_localctx, 64, RULE_typeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IDENTIFIER);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_EMPTY) {
					{
					setState(348);
					match(ARRAY_EMPTY);
					}
				}

				}
				break;
			case 2:
				{
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(351);
					genericArguments();
					}
				}

				}
				break;
			}
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(356);
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
		enterRule(_localctx, 66, RULE_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			match(AS);
			setState(360);
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
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 70, RULE_memberVisibilityModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(364);
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
		enterRule(_localctx, 72, RULE_assignment);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				variableAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				listInitialization();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
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
		enterRule(_localctx, 74, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			assignment();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(375);
				match(T__2);
				setState(376);
				assignment();
				}
				}
				setState(381);
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
		enterRule(_localctx, 76, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 78, RULE_variableAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(384);
				match(THIS);
				setState(385);
				match(DOT_OPERATOR);
				}
			}

			setState(388);
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
		enterRule(_localctx, 80, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==FINAL_VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			variableName();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF_OERATOR) {
				{
				setState(392);
				match(OF_OERATOR);
				setState(393);
				typeLiteral();
				}
			}

			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(396);
				match(ASSIGN);
				{
				setState(397);
				assignment();
				}
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(400);
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
		enterRule(_localctx, 82, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			memberVisibilityModifiers();
			}
			setState(404);
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
		enterRule(_localctx, 84, RULE_methodModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(406);
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

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(409);
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

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(412);
				match(ASYNC);
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYNCHRONIZED) {
				{
				setState(415);
				match(SYNCHRONIZED);
				}
			}

			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(418);
				match(NATIVE);
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOLATILE) {
				{
				setState(421);
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
		enterRule(_localctx, 86, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 88, RULE_methodParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			variableName();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF_OERATOR) {
				{
				setState(427);
				match(OF_OERATOR);
				setState(428);
				typeLiteral();
				}
			}

			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(431);
				match(ASSIGN);
				{
				setState(432);
				assignment();
				}
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(435);
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
		enterRule(_localctx, 90, RULE_methodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			methodParameter();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(439);
				match(T__2);
				setState(440);
				methodParameter();
				}
				}
				setState(445);
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
		enterRule(_localctx, 92, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			methodModifiers();
			setState(447);
			match(METHOD);
			setState(448);
			methodName();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(449);
				genericArguments();
				}
			}

			setState(452);
			match(ASSIGN);
			setState(453);
			match(T__3);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(454);
				methodParameters();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(T__4);
			setState(461);
			match(OF_OERATOR);
			setState(462);
			typeLiteral();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(463);
				match(OPTIONAL);
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(466);
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
		enterRule(_localctx, 94, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(RETURN);
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(470);
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
				setState(471);
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
		enterRule(_localctx, 96, RULE_methodArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		enterRule(_localctx, 98, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(476);
					variableAccess();
					}
					break;
				case 2:
					{
					setState(477);
					className();
					}
					break;
				case 3:
					{
					setState(478);
					literal();
					}
					break;
				case 4:
					{
					setState(479);
					match(THIS);
					}
					break;
				case 5:
					{
					setState(480);
					match(SUPER);
					}
					break;
				}
				setState(483);
				match(DOT_OPERATOR);
				}
				break;
			}
			setState(486);
			methodName();
			setState(487);
			match(T__3);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL) | (1L << THIS) | (1L << SUPER))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(488);
				arguments();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
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
		enterRule(_localctx, 100, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(496);
				variableAccess();
				}
				break;
			case 2:
				{
				setState(497);
				className();
				}
				break;
			case 3:
				{
				setState(498);
				literal();
				}
				break;
			}
			setState(501);
			match(ASSIGN);
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(502);
				methodInvocation();
				}
				break;
			case 2:
				{
				setState(503);
				variableAccess();
				}
				break;
			case 3:
				{
				setState(504);
				literal();
				}
				break;
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(507);
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
		enterRule(_localctx, 102, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(T__0);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL) | (1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << THIS) | (1L << SUPER))) != 0) || _la==IDENTIFIER) {
				{
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(511);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(512);
					variableAssignment();
					}
					break;
				case 3:
					{
					setState(513);
					methodInvocation();
					}
					break;
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(519);
				returnStatement();
				}
			}

			setState(522);
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
		enterRule(_localctx, 104, RULE_listInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__6);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL) | (1L << THIS) | (1L << SUPER))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(525);
				arguments();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
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
		enterRule(_localctx, 106, RULE_mapKeyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(STRING_LITERAL);
			setState(534);
			match(OF_OERATOR);
			setState(535);
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
		enterRule(_localctx, 108, RULE_mapKeyValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			mapKeyValue();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(538);
				match(T__2);
				setState(539);
				mapKeyValue();
				}
				}
				setState(544);
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
		enterRule(_localctx, 110, RULE_mapInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__0);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING_LITERAL) {
				{
				{
				setState(546);
				mapKeyValues();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
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
		enterRule(_localctx, 112, RULE_test_fieldDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(554);
				fieldDeclaration();
				}
				}
				setState(559);
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
		enterRule(_localctx, 114, RULE_test_methodDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METHOD) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << NATIVE) | (1L << VOLATILE) | (1L << ABSTRACT) | (1L << ASYNC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				{
				setState(560);
				methodDeclaration();
				}
				}
				setState(565);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3a\u0239\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\7\2z\n\2\f\2\16\2}\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u0088"+
		"\n\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0099\n\b\3\b\3\b\3\t\7\t\u009e\n\t\f\t\16\t\u00a1\13\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00ad\n\13\f\13\16\13\u00b0\13"+
		"\13\3\f\3\f\5\f\u00b4\n\f\3\f\5\f\u00b7\n\f\3\r\3\r\3\r\3\r\7\r\u00bd"+
		"\n\r\f\r\16\r\u00c0\13\r\3\r\3\r\3\16\5\16\u00c5\n\16\3\16\5\16\u00c8"+
		"\n\16\3\17\3\17\5\17\u00cc\n\17\3\20\3\20\3\20\3\20\5\20\u00d2\n\20\3"+
		"\20\5\20\u00d5\n\20\3\20\3\20\3\20\7\20\u00da\n\20\f\20\16\20\u00dd\13"+
		"\20\3\20\3\20\3\21\5\21\u00e2\n\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23"+
		"\u00ea\n\23\3\23\5\23\u00ed\n\23\3\23\3\23\3\23\7\23\u00f2\n\23\f\23\16"+
		"\23\u00f5\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u0102\n\27\f\27\16\27\u0105\13\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u010c\n\30\3\31\3\31\3\31\7\31\u0111\n\31\f\31\16\31\u0114\13\31\3\32"+
		"\5\32\u0117\n\32\3\32\3\32\3\32\3\32\7\32\u011d\n\32\f\32\16\32\u0120"+
		"\13\32\3\32\3\32\3\32\7\32\u0125\n\32\f\32\16\32\u0128\13\32\5\32\u012a"+
		"\n\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\5\35\u0133\n\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0139\n\35\f\35\16\35\u013c\13\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \5 \u0147\n \3 \3 \5 \u014b\n \3 \5 \u014e\n \3!\5!\u0151"+
		"\n!\3!\3!\3!\3!\7!\u0157\n!\f!\16!\u015a\13!\3!\3!\3\"\3\"\5\"\u0160\n"+
		"\"\3\"\5\"\u0163\n\"\5\"\u0165\n\"\3\"\5\"\u0168\n\"\3#\3#\3#\3$\3$\3"+
		"%\5%\u0170\n%\3&\3&\3&\3&\3&\5&\u0177\n&\3\'\3\'\3\'\7\'\u017c\n\'\f\'"+
		"\16\'\u017f\13\'\3(\3(\3)\3)\5)\u0185\n)\3)\3)\3*\3*\3*\3*\5*\u018d\n"+
		"*\3*\3*\5*\u0191\n*\3*\5*\u0194\n*\3+\3+\3+\3,\5,\u019a\n,\3,\5,\u019d"+
		"\n,\3,\5,\u01a0\n,\3,\5,\u01a3\n,\3,\5,\u01a6\n,\3,\5,\u01a9\n,\3-\3-"+
		"\3.\3.\3.\5.\u01b0\n.\3.\3.\5.\u01b4\n.\3.\5.\u01b7\n.\3/\3/\3/\7/\u01bc"+
		"\n/\f/\16/\u01bf\13/\3\60\3\60\3\60\3\60\5\60\u01c5\n\60\3\60\3\60\3\60"+
		"\7\60\u01ca\n\60\f\60\16\60\u01cd\13\60\3\60\3\60\3\60\3\60\5\60\u01d3"+
		"\n\60\3\60\5\60\u01d6\n\60\3\61\3\61\3\61\5\61\u01db\n\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\5\63\u01e4\n\63\3\63\5\63\u01e7\n\63\3\63\3\63"+
		"\3\63\7\63\u01ec\n\63\f\63\16\63\u01ef\13\63\3\63\3\63\3\64\3\64\3\64"+
		"\5\64\u01f6\n\64\3\64\3\64\3\64\3\64\5\64\u01fc\n\64\3\64\5\64\u01ff\n"+
		"\64\3\65\3\65\3\65\3\65\7\65\u0205\n\65\f\65\16\65\u0208\13\65\3\65\5"+
		"\65\u020b\n\65\3\65\3\65\3\66\3\66\7\66\u0211\n\66\f\66\16\66\u0214\13"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\78\u021f\n8\f8\168\u0222\13"+
		"8\39\39\79\u0226\n9\f9\169\u0229\139\39\39\3:\7:\u022e\n:\f:\16:\u0231"+
		"\13:\3;\7;\u0234\n;\f;\16;\u0237\13;\3;\2\2<\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\6"+
		"\3\2\21\30\3\2\679\3\2\37 \4\2<<??\2\u0255\2v\3\2\2\2\4~\3\2\2\2\6\u0080"+
		"\3\2\2\2\b\u0082\3\2\2\2\n\u008c\3\2\2\2\f\u008f\3\2\2\2\16\u0091\3\2"+
		"\2\2\20\u009f\3\2\2\2\22\u00a5\3\2\2\2\24\u00a8\3\2\2\2\26\u00b1\3\2\2"+
		"\2\30\u00b8\3\2\2\2\32\u00c4\3\2\2\2\34\u00c9\3\2\2\2\36\u00cd\3\2\2\2"+
		" \u00e1\3\2\2\2\"\u00e3\3\2\2\2$\u00e5\3\2\2\2&\u00f8\3\2\2\2(\u00fa\3"+
		"\2\2\2*\u00fc\3\2\2\2,\u00fe\3\2\2\2.\u0106\3\2\2\2\60\u010d\3\2\2\2\62"+
		"\u0116\3\2\2\2\64\u012d\3\2\2\2\66\u012f\3\2\2\28\u0132\3\2\2\2:\u013f"+
		"\3\2\2\2<\u0141\3\2\2\2>\u0143\3\2\2\2@\u0150\3\2\2\2B\u015d\3\2\2\2D"+
		"\u0169\3\2\2\2F\u016c\3\2\2\2H\u016f\3\2\2\2J\u0176\3\2\2\2L\u0178\3\2"+
		"\2\2N\u0180\3\2\2\2P\u0184\3\2\2\2R\u0188\3\2\2\2T\u0195\3\2\2\2V\u0199"+
		"\3\2\2\2X\u01aa\3\2\2\2Z\u01ac\3\2\2\2\\\u01b8\3\2\2\2^\u01c0\3\2\2\2"+
		"`\u01d7\3\2\2\2b\u01dc\3\2\2\2d\u01e6\3\2\2\2f\u01f5\3\2\2\2h\u0200\3"+
		"\2\2\2j\u020e\3\2\2\2l\u0217\3\2\2\2n\u021b\3\2\2\2p\u0223\3\2\2\2r\u022f"+
		"\3\2\2\2t\u0235\3\2\2\2v{\5\4\3\2wx\7\16\2\2xz\5\4\3\2yw\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|\3\3\2\2\2}{\3\2\2\2~\177\7^\2\2\177\5\3\2\2"+
		"\2\u0080\u0081\7^\2\2\u0081\7\3\2\2\2\u0082\u0083\7&\2\2\u0083\u0087\5"+
		"\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\7\f\2\2\u0086\u0088\5\6\4\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\n"+
		"\6\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\t\3\2\2\2\u008c\u008d"+
		"\7\"\2\2\u008d\u008e\7^\2\2\u008e\13\3\2\2\2\u008f\u0090\7^\2\2\u0090"+
		"\r\3\2\2\2\u0091\u0092\7\31\2\2\u0092\u0093\5\f\7\2\u0093\u0098\7\3\2"+
		"\2\u0094\u0099\5\36\20\2\u0095\u0099\5$\23\2\u0096\u0099\5\62\32\2\u0097"+
		"\u0099\58\35\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\4\2\2\u009b"+
		"\17\3\2\2\2\u009c\u009e\5\b\5\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4\7\2\2\3\u00a4\21\3\2\2\2\u00a5"+
		"\u00a6\7\66\2\2\u00a6\u00a7\5\34\17\2\u00a7\23\3\2\2\2\u00a8\u00a9\7\65"+
		"\2\2\u00a9\u00ae\5\34\17\2\u00aa\u00ab\7\5\2\2\u00ab\u00ad\5\34\17\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\25\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b6\5\34\17\2\u00b2"+
		"\u00b4\7\66\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b7\5\34\17\2\u00b6\u00b3\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\27\3\2\2\2\u00b8\u00b9\7L\2\2\u00b9\u00be\5\26\f\2\u00ba\u00bb\7\5\2"+
		"\2\u00bb\u00bd\5\26\f\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c2\7J\2\2\u00c2\31\3\2\2\2\u00c3\u00c5\7<\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\7\67\2\2"+
		"\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00cb"+
		"\7^\2\2\u00ca\u00cc\5\30\r\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\35\3\2\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf\7\32\2\2\u00cf\u00d1\5\34"+
		"\17\2\u00d0\u00d2\5\22\n\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d5\5\24\13\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00db\7\3\2\2\u00d7\u00da\5T+\2\u00d8"+
		"\u00da\5^\60\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\7\4\2\2\u00df\37\3\2\2\2\u00e0\u00e2\7\67\2"+
		"\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4"+
		"\7^\2\2\u00e4#\3\2\2\2\u00e5\u00e6\5 \21\2\u00e6\u00e7\7\33\2\2\u00e7"+
		"\u00e9\5\"\22\2\u00e8\u00ea\5\30\r\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3"+
		"\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00ed\5\22\n\2\u00ec\u00eb\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f3\7\3\2\2\u00ef\u00f2\5T"+
		"+\2\u00f0\u00f2\5^\60\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\4\2\2\u00f7%\3\2\2\2\u00f8\u00f9"+
		"\7\67\2\2\u00f9\'\3\2\2\2\u00fa\u00fb\7^\2\2\u00fb)\3\2\2\2\u00fc\u00fd"+
		"\5F$\2\u00fd+\3\2\2\2\u00fe\u0103\5*\26\2\u00ff\u0100\7\5\2\2\u0100\u0102"+
		"\5*\26\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104-\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010b\7^\2\2\u0107"+
		"\u0108\7\6\2\2\u0108\u0109\5,\27\2\u0109\u010a\7\7\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c/\3\2\2\2\u010d\u0112"+
		"\5.\30\2\u010e\u010f\7\5\2\2\u010f\u0111\5.\30\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\61\3\2\2"+
		"\2\u0114\u0112\3\2\2\2\u0115\u0117\5&\24\2\u0116\u0115\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\34\2\2\u0119\u011a\5(\25\2"+
		"\u011a\u011e\7\3\2\2\u011b\u011d\5\60\31\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0129\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0126\7\b\2\2\u0122\u0125\5T+\2\u0123\u0125\5^\60"+
		"\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u0121\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\4"+
		"\2\2\u012c\63\3\2\2\2\u012d\u012e\7\67\2\2\u012e\65\3\2\2\2\u012f\u0130"+
		"\7^\2\2\u0130\67\3\2\2\2\u0131\u0133\5\64\33\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\35\2\2\u0135\u0136\5"+
		"\66\34\2\u0136\u013a\7\3\2\2\u0137\u0139\5T+\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\4\2\2\u013e9\3\2\2\2\u013f\u0140"+
		"\7\67\2\2\u0140;\3\2\2\2\u0141\u0142\7^\2\2\u0142=\3\2\2\2\u0143\u0146"+
		"\5N(\2\u0144\u0145\7\f\2\2\u0145\u0147\5B\"\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149\7D\2\2\u0149\u014b\5J&"+
		"\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e"+
		"\5D#\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e?\3\2\2\2\u014f\u0151"+
		"\5:\36\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\7\36\2\2\u0153\u0154\5<\37\2\u0154\u0158\7\3\2\2\u0155\u0157\5"+
		"> \2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\4"+
		"\2\2\u015cA\3\2\2\2\u015d\u0164\7^\2\2\u015e\u0160\7\r\2\2\u015f\u015e"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0165\3\2\2\2\u0161\u0163\5\30\r\2"+
		"\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u015f"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\7\13\2\2"+
		"\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168C\3\2\2\2\u0169\u016a\7"+
		"\"\2\2\u016a\u016b\5B\"\2\u016bE\3\2\2\2\u016c\u016d\t\2\2\2\u016dG\3"+
		"\2\2\2\u016e\u0170\t\3\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"I\3\2\2\2\u0171\u0177\5P)\2\u0172\u0177\5F$\2\u0173\u0177\5d\63\2\u0174"+
		"\u0177\5j\66\2\u0175\u0177\5p9\2\u0176\u0171\3\2\2\2\u0176\u0172\3\2\2"+
		"\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177K"+
		"\3\2\2\2\u0178\u017d\5J&\2\u0179\u017a\7\5\2\2\u017a\u017c\5J&\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017eM\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7^\2\2\u0181O\3\2"+
		"\2\2\u0182\u0183\7\'\2\2\u0183\u0185\7\16\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5N(\2\u0187Q\3\2\2\2\u0188"+
		"\u0189\t\4\2\2\u0189\u018c\5N(\2\u018a\u018b\7\f\2\2\u018b\u018d\5B\""+
		"\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018f"+
		"\7D\2\2\u018f\u0191\5J&\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0194\5D#\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2"+
		"\2\u0194S\3\2\2\2\u0195\u0196\5H%\2\u0196\u0197\5R*\2\u0197U\3\2\2\2\u0198"+
		"\u019a\t\3\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2"+
		"\2\2\u019b\u019d\t\5\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u01a0\7>\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\7@\2\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a6\7:\2\2\u01a5\u01a4\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\7;\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9W\3\2\2\2\u01aa\u01ab\7^\2\2\u01ab"+
		"Y\3\2\2\2\u01ac\u01af\5N(\2\u01ad\u01ae\7\f\2\2\u01ae\u01b0\5B\"\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b2\7D"+
		"\2\2\u01b2\u01b4\5J&\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6"+
		"\3\2\2\2\u01b5\u01b7\5D#\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"[\3\2\2\2\u01b8\u01bd\5Z.\2\u01b9\u01ba\7\5\2\2\u01ba\u01bc\5Z.\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be]\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\5V,\2\u01c1\u01c2"+
		"\7!\2\2\u01c2\u01c4\5X-\2\u01c3\u01c5\5\30\r\2\u01c4\u01c3\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7D\2\2\u01c7\u01cb\7\6"+
		"\2\2\u01c8\u01ca\5\\/\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01cf\7\7\2\2\u01cf\u01d0\7\f\2\2\u01d0\u01d2\5B\"\2\u01d1"+
		"\u01d3\7\13\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3"+
		"\2\2\2\u01d4\u01d6\5h\65\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"_\3\2\2\2\u01d7\u01da\7%\2\2\u01d8\u01db\7^\2\2\u01d9\u01db\5F$\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dba\3\2\2\2\u01dc\u01dd\5L\'\2\u01dd"+
		"c\3\2\2\2\u01de\u01e4\5P)\2\u01df\u01e4\5\34\17\2\u01e0\u01e4\5F$\2\u01e1"+
		"\u01e4\7\'\2\2\u01e2\u01e4\7(\2\2\u01e3\u01de\3\2\2\2\u01e3\u01df\3\2"+
		"\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e7\7\16\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e7\3"+
		"\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\5X-\2\u01e9\u01ed\7\6\2\2\u01ea"+
		"\u01ec\5L\'\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f1\7\7\2\2\u01f1e\3\2\2\2\u01f2\u01f6\5P)\2\u01f3\u01f6\5\34\17\2"+
		"\u01f4\u01f6\5F$\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb\7D\2\2\u01f8\u01fc\5d\63\2\u01f9"+
		"\u01fc\5P)\2\u01fa\u01fc\5F$\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2"+
		"\u01fb\u01fa\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5D#\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffg\3\2\2\2\u0200\u0206\7\3\2\2\u0201"+
		"\u0205\5R*\2\u0202\u0205\5f\64\2\u0203\u0205\5d\63\2\u0204\u0201\3\2\2"+
		"\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0209"+
		"\u020b\5`\61\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\7\4\2\2\u020di\3\2\2\2\u020e\u0212\7\t\2\2\u020f\u0211"+
		"\5L\'\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7\n"+
		"\2\2\u0216k\3\2\2\2\u0217\u0218\7\23\2\2\u0218\u0219\7\f\2\2\u0219\u021a"+
		"\5J&\2\u021am\3\2\2\2\u021b\u0220\5l\67\2\u021c\u021d\7\5\2\2\u021d\u021f"+
		"\5l\67\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221o\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0227\7\3\2\2"+
		"\u0224\u0226\5n8\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a"+
		"\u022b\7\4\2\2\u022bq\3\2\2\2\u022c\u022e\5T+\2\u022d\u022c\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230s\3\2\2\2"+
		"\u0231\u022f\3\2\2\2\u0232\u0234\5^\60\2\u0233\u0232\3\2\2\2\u0234\u0237"+
		"\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236u\3\2\2\2\u0237"+
		"\u0235\3\2\2\2N{\u0087\u008a\u0098\u009f\u00ae\u00b3\u00b6\u00be\u00c4"+
		"\u00c7\u00cb\u00d1\u00d4\u00d9\u00db\u00e1\u00e9\u00ec\u00f1\u00f3\u0103"+
		"\u010b\u0112\u0116\u011e\u0124\u0126\u0129\u0132\u013a\u0146\u014a\u014d"+
		"\u0150\u0158\u015f\u0162\u0164\u0167\u016f\u0176\u017d\u0184\u018c\u0190"+
		"\u0193\u0199\u019c\u019f\u01a2\u01a5\u01a8\u01af\u01b3\u01b6\u01bd\u01c4"+
		"\u01cb\u01d2\u01d5\u01da\u01e3\u01e6\u01ed\u01f5\u01fb\u01fe\u0204\u0206"+
		"\u020a\u0212\u0220\u0227\u022f\u0235";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}