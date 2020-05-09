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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OPTIONAL=6, DECLARE_TYPE=7, ARRAY_EMPTY=8, 
		PACKAGE_SEPARATOR=9, PROPERTY_ACCESS_INDICATOR=10, METHOD_INVOCATION_INDICATOR=11, 
		BOOLEAN_LITERAL=12, NULL_LITERAL=13, STRING_LITERAL=14, INTEGER_LITERAL=15, 
		LONG_LITERAL=16, FLOAT_LITERAL=17, DOUBLE_LITERAL=18, HEX_NUMERIC_LITERAL=19, 
		PACKAGE=20, CLASS=21, INTERFACE=22, ENUM=23, STRUCT=24, VARIABLE=25, FINAL_VARIABLE=26, 
		AS=27, THROW=28, THROWS=29, RETURN=30, IMPORT=31, THIS=32, SUPER=33, IF=34, 
		ELSE=35, WHILE=36, FOR=37, FOREACH=38, CONTINUE=39, BREAK=40, YIELD=41, 
		TRY=42, CATCH=43, SWITCH=44, CASE=45, IMPLEMENTS=46, EXTENDS=47, PRIVATE=48, 
		PROTECTED=49, NATIVE=50, VOLATILE=51, ABSTRACT=52, DEFAULT=53, ASYNC=54, 
		STATIC=55, SYNCHRONIZED=56, IS=57, NOT=58, NEGATE=59, ASSIGN=60, EQUALS=61, 
		NOT_EQUALS=62, NOT_EQUALS_LT_GT=63, LIKE=64, NOT_LIKE=65, GREATER_THAN=66, 
		GREATER_THAN_OR_EQUAL=67, LESS_THAN=68, LESS_THAN_OR_EQUAL=69, OR=70, 
		OR_BINARY=71, AND=72, AND_BINARY=73, ADD=74, SUBTRACT=75, DIVIDE=76, MULTIPLY=77, 
		MODULUS=78, INCREMET=79, DECREMENT=80, INCREMENT_AND_ASSIGN=81, DECREMENT_AND_ASSIGN=82, 
		MULTIPLY_AND_ASSIGN=83, DIVIDE_AND_ASSIGN=84, MODULUS_AND_ASSIGN=85, IDENTIFIER=86, 
		BLOCK_COMMENT=87, LINE_COMMENT=88, WHITESPACE=89;
	public static final int
		RULE_compilationUnit = 0, RULE_importsDeclaration = 1, RULE_importRename = 2, 
		RULE_packageDeclaration = 3, RULE_classDeclaration = 4, RULE_interfaceDeclaration = 5, 
		RULE_enumDeclaration = 6, RULE_structDeclaration = 7, RULE_variableDeclaration = 8, 
		RULE_methodArgument = 9, RULE_methodArguments = 10, RULE_fieldDeclaration = 11, 
		RULE_methodDeclaration = 12, RULE_qualifiedName = 13, RULE_qualifiedNameElement = 14, 
		RULE_classVisibilityModifiers = 15, RULE_classModifiers = 16, RULE_memberVisibilityModifiers = 17, 
		RULE_literals = 18, RULE_typeLiteral = 19, RULE_packageName = 20, RULE_className = 21, 
		RULE_variableName = 22, RULE_methodName = 23, RULE_extendsDeclaration = 24, 
		RULE_implementsDeclaration = 25, RULE_returnStatement = 26, RULE_codeBlock = 27, 
		RULE_methodInvocation = 28, RULE_variableAssignment = 29, RULE_casting = 30, 
		RULE_test_fieldDeclarations = 31, RULE_test_methodDeclarations = 32;
	public static final String[] ruleNames = {
		"compilationUnit", "importsDeclaration", "importRename", "packageDeclaration", 
		"classDeclaration", "interfaceDeclaration", "enumDeclaration", "structDeclaration", 
		"variableDeclaration", "methodArgument", "methodArguments", "fieldDeclaration", 
		"methodDeclaration", "qualifiedName", "qualifiedNameElement", "classVisibilityModifiers", 
		"classModifiers", "memberVisibilityModifiers", "literals", "typeLiteral", 
		"packageName", "className", "variableName", "methodName", "extendsDeclaration", 
		"implementsDeclaration", "returnStatement", "codeBlock", "methodInvocation", 
		"variableAssignment", "casting", "test_fieldDeclarations", "test_methodDeclarations"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "'('", "')'", null, null, "'[]'", null, null, 
		null, null, "'null'", null, null, null, null, null, null, "'package'", 
		"'class'", "'interface'", "'enum'", "'struct'", "'var'", null, "'as'", 
		"'throw'", "'throws'", "'return'", "'import'", "'this'", "'super'", "'if'", 
		"'else'", "'while'", "'for'", "'foreach'", "'continue'", "'break'", "'yield'", 
		"'try'", "'catch'", "'switch'", "'case'", "'implements'", "'extends'", 
		"'private'", "'protected'", "'native'", "'volatile'", "'abstract'", "'default'", 
		"'async'", "'static'", "'synchronized'", "'is'", "'not'", "'!'", null, 
		null, null, "'<>'", "'~'", "'!~'", "'>'", "'>='", "'<'", "'<='", "'|'", 
		"'||'", "'&'", "'&&'", null, null, "'/'", "'*'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "OPTIONAL", "DECLARE_TYPE", "ARRAY_EMPTY", 
		"PACKAGE_SEPARATOR", "PROPERTY_ACCESS_INDICATOR", "METHOD_INVOCATION_INDICATOR", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "INTEGER_LITERAL", 
		"LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", "HEX_NUMERIC_LITERAL", 
		"PACKAGE", "CLASS", "INTERFACE", "ENUM", "STRUCT", "VARIABLE", "FINAL_VARIABLE", 
		"AS", "THROW", "THROWS", "RETURN", "IMPORT", "THIS", "SUPER", "IF", "ELSE", 
		"WHILE", "FOR", "FOREACH", "CONTINUE", "BREAK", "YIELD", "TRY", "CATCH", 
		"SWITCH", "CASE", "IMPLEMENTS", "EXTENDS", "PRIVATE", "PROTECTED", "NATIVE", 
		"VOLATILE", "ABSTRACT", "DEFAULT", "ASYNC", "STATIC", "SYNCHRONIZED", 
		"IS", "NOT", "NEGATE", "ASSIGN", "EQUALS", "NOT_EQUALS", "NOT_EQUALS_LT_GT", 
		"LIKE", "NOT_LIKE", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN", 
		"LESS_THAN_OR_EQUAL", "OR", "OR_BINARY", "AND", "AND_BINARY", "ADD", "SUBTRACT", 
		"DIVIDE", "MULTIPLY", "MODULUS", "INCREMET", "DECREMENT", "INCREMENT_AND_ASSIGN", 
		"DECREMENT_AND_ASSIGN", "MULTIPLY_AND_ASSIGN", "DIVIDE_AND_ASSIGN", "MODULUS_AND_ASSIGN", 
		"IDENTIFIER", "BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
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
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(66);
				importsDeclaration();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			packageDeclaration();
			setState(73);
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
		enterRule(_localctx, 2, RULE_importsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IMPORT);
			setState(76);
			qualifiedName();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(77);
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
		enterRule(_localctx, 4, RULE_importRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(AS);
			setState(81);
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
		enterRule(_localctx, 6, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(PACKAGE);
			setState(84);
			packageName();
			setState(85);
			match(T__0);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(86);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(87);
				interfaceDeclaration();
				}
				break;
			case 3:
				{
				setState(88);
				enumDeclaration();
				}
				break;
			case 4:
				{
				setState(89);
				structDeclaration();
				}
				break;
			}
			setState(92);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(KawaParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassVisibilityModifiersContext classVisibilityModifiers() {
			return getRuleContext(ClassVisibilityModifiersContext.class,0);
		}
		public ClassModifiersContext classModifiers() {
			return getRuleContext(ClassModifiersContext.class,0);
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
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(94);
				classVisibilityModifiers();
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(97);
				classModifiers();
				}
			}

			setState(100);
			match(CLASS);
			setState(101);
			className();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(102);
				extendsDeclaration();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(105);
				implementsDeclaration();
				}
			}

			setState(108);
			match(T__0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (VARIABLE - 25)) | (1L << (FINAL_VARIABLE - 25)) | (1L << (PRIVATE - 25)) | (1L << (PROTECTED - 25)) | (1L << (NATIVE - 25)) | (1L << (VOLATILE - 25)) | (1L << (ABSTRACT - 25)) | (1L << (ASYNC - 25)) | (1L << (STATIC - 25)) | (1L << (SYNCHRONIZED - 25)) | (1L << (IDENTIFIER - 25)))) != 0)) {
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(109);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(110);
					methodDeclaration();
					}
					break;
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(KawaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
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
		enterRule(_localctx, 10, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(118);
				match(PRIVATE);
				}
			}

			setState(121);
			match(INTERFACE);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KawaParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
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
		enterRule(_localctx, 12, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(124);
				match(PRIVATE);
				}
			}

			setState(127);
			match(ENUM);
			setState(128);
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
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
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
		enterRule(_localctx, 14, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(130);
				match(PRIVATE);
				}
			}

			setState(133);
			match(STRUCT);
			setState(134);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(KawaParser.VARIABLE, 0); }
		public TerminalNode FINAL_VARIABLE() { return getToken(KawaParser.FINAL_VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode DECLARE_TYPE() { return getToken(KawaParser.DECLARE_TYPE, 0); }
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
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
		enterRule(_localctx, 16, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==FINAL_VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			variableName();
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(138);
				match(ASSIGN);
				setState(139);
				literals();
				}
				break;
			case DECLARE_TYPE:
				{
				setState(140);
				match(DECLARE_TYPE);
				setState(141);
				typeLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(144);
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

	public static class MethodArgumentContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode DECLARE_TYPE() { return getToken(KawaParser.DECLARE_TYPE, 0); }
		public List<TypeLiteralContext> typeLiteral() {
			return getRuleContexts(TypeLiteralContext.class);
		}
		public TypeLiteralContext typeLiteral(int i) {
			return getRuleContext(TypeLiteralContext.class,i);
		}
		public TerminalNode AS() { return getToken(KawaParser.AS, 0); }
		public MethodArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterMethodArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitMethodArgument(this);
		}
	}

	public final MethodArgumentContext methodArgument() throws RecognitionException {
		MethodArgumentContext _localctx = new MethodArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			variableName();
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(148);
				match(ASSIGN);
				setState(149);
				literals();
				}
				break;
			case DECLARE_TYPE:
				{
				setState(150);
				match(DECLARE_TYPE);
				setState(151);
				typeLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(154);
				match(AS);
				setState(155);
				typeLiteral();
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

	public static class MethodArgumentsContext extends ParserRuleContext {
		public List<MethodArgumentContext> methodArgument() {
			return getRuleContexts(MethodArgumentContext.class);
		}
		public MethodArgumentContext methodArgument(int i) {
			return getRuleContext(MethodArgumentContext.class,i);
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
		enterRule(_localctx, 20, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			methodArgument();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(159);
				match(T__2);
				setState(160);
				methodArgument();
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
		enterRule(_localctx, 22, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			memberVisibilityModifiers();
			}
			setState(167);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode DECLARE_TYPE() { return getToken(KawaParser.DECLARE_TYPE, 0); }
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public MemberVisibilityModifiersContext memberVisibilityModifiers() {
			return getRuleContext(MemberVisibilityModifiersContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(KawaParser.NATIVE, 0); }
		public TerminalNode VOLATILE() { return getToken(KawaParser.VOLATILE, 0); }
		public TerminalNode ASYNC() { return getToken(KawaParser.ASYNC, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(KawaParser.SYNCHRONIZED, 0); }
		public List<MethodArgumentsContext> methodArguments() {
			return getRuleContexts(MethodArgumentsContext.class);
		}
		public MethodArgumentsContext methodArguments(int i) {
			return getRuleContext(MethodArgumentsContext.class,i);
		}
		public TerminalNode OPTIONAL() { return getToken(KawaParser.OPTIONAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(KawaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(KawaParser.STATIC, 0); }
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
		enterRule(_localctx, 24, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			memberVisibilityModifiers();
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(170);
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

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(173);
				match(NATIVE);
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOLATILE) {
				{
				setState(176);
				match(VOLATILE);
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(179);
				match(ASYNC);
				}
			}

			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYNCHRONIZED) {
				{
				setState(182);
				match(SYNCHRONIZED);
				}
			}

			setState(185);
			methodName();
			setState(186);
			match(T__3);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(187);
				methodArguments();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__4);
			setState(194);
			match(DECLARE_TYPE);
			setState(195);
			typeLiteral();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(196);
				match(OPTIONAL);
				}
			}

			setState(199);
			codeBlock();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<QualifiedNameElementContext> qualifiedNameElement() {
			return getRuleContexts(QualifiedNameElementContext.class);
		}
		public QualifiedNameElementContext qualifiedNameElement(int i) {
			return getRuleContext(QualifiedNameElementContext.class,i);
		}
		public List<TerminalNode> PACKAGE_SEPARATOR() { return getTokens(KawaParser.PACKAGE_SEPARATOR); }
		public TerminalNode PACKAGE_SEPARATOR(int i) {
			return getToken(KawaParser.PACKAGE_SEPARATOR, i);
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
		enterRule(_localctx, 26, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			qualifiedNameElement();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PACKAGE_SEPARATOR) {
				{
				{
				setState(202);
				match(PACKAGE_SEPARATOR);
				setState(203);
				qualifiedNameElement();
				}
				}
				setState(208);
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
		enterRule(_localctx, 28, RULE_qualifiedNameElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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

	public static class ClassVisibilityModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(KawaParser.PRIVATE, 0); }
		public ClassVisibilityModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVisibilityModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterClassVisibilityModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitClassVisibilityModifiers(this);
		}
	}

	public final ClassVisibilityModifiersContext classVisibilityModifiers() throws RecognitionException {
		ClassVisibilityModifiersContext _localctx = new ClassVisibilityModifiersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classVisibilityModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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

	public static class ClassModifiersContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(KawaParser.ABSTRACT, 0); }
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
		enterRule(_localctx, 32, RULE_classModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ABSTRACT);
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
		enterRule(_localctx, 34, RULE_memberVisibilityModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PROTECTED) {
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PROTECTED) ) {
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

	public static class LiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(KawaParser.STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(KawaParser.INTEGER_LITERAL, 0); }
		public TerminalNode LONG_LITERAL() { return getToken(KawaParser.LONG_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(KawaParser.FLOAT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(KawaParser.DOUBLE_LITERAL, 0); }
		public TerminalNode HEX_NUMERIC_LITERAL() { return getToken(KawaParser.HEX_NUMERIC_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(KawaParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(KawaParser.NULL_LITERAL, 0); }
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KawaListener ) ((KawaListener)listener).exitLiterals(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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

	public static class TypeLiteralContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
		public TerminalNode ARRAY_EMPTY() { return getToken(KawaParser.ARRAY_EMPTY, 0); }
		public TerminalNode OPTIONAL() { return getToken(KawaParser.OPTIONAL, 0); }
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
		enterRule(_localctx, 38, RULE_typeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_EMPTY) {
				{
				setState(221);
				match(ARRAY_EMPTY);
				}
			}

			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(224);
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
		enterRule(_localctx, 40, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 42, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		enterRule(_localctx, 44, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 46, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 48, RULE_extendsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(EXTENDS);
			setState(236);
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
		enterRule(_localctx, 50, RULE_implementsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IMPLEMENTS);
			setState(239);
			className();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(240);
				match(T__2);
				setState(241);
				className();
				}
				}
				setState(246);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KawaParser.RETURN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KawaParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 52, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(RETURN);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
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
		enterRule(_localctx, 54, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__0);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL) | (1L << VARIABLE) | (1L << FINAL_VARIABLE))) != 0) || _la==IDENTIFIER) {
				{
				setState(253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
				case FINAL_VARIABLE:
					{
					setState(251);
					variableDeclaration();
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
				case IDENTIFIER:
					{
					setState(252);
					methodInvocation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(258);
				returnStatement();
				}
			}

			setState(261);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode METHOD_INVOCATION_INDICATOR() { return getToken(KawaParser.METHOD_INVOCATION_INDICATOR, 0); }
		public List<MethodArgumentsContext> methodArguments() {
			return getRuleContexts(MethodArgumentsContext.class);
		}
		public MethodArgumentsContext methodArguments(int i) {
			return getRuleContext(MethodArgumentsContext.class,i);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(263);
					variableName();
					}
					break;
				case 2:
					{
					setState(264);
					className();
					}
					break;
				case 3:
					{
					setState(265);
					literals();
					}
					break;
				}
				setState(268);
				match(METHOD_INVOCATION_INDICATOR);
				}
				break;
			}
			setState(272);
			methodName();
			setState(273);
			match(T__3);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(274);
				methodArguments();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
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
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KawaParser.ASSIGN, 0); }
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
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
		enterRule(_localctx, 58, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			variableName();
			setState(283);
			match(ASSIGN);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(284);
				methodInvocation();
				}
				break;
			case 2:
				{
				setState(285);
				literals();
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(288);
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
		enterRule(_localctx, 60, RULE_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			match(AS);
			setState(292);
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
		enterRule(_localctx, 62, RULE_test_fieldDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << FINAL_VARIABLE) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				{
				setState(294);
				fieldDeclaration();
				}
				}
				setState(299);
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
		enterRule(_localctx, 64, RULE_test_methodDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (PRIVATE - 48)) | (1L << (PROTECTED - 48)) | (1L << (NATIVE - 48)) | (1L << (VOLATILE - 48)) | (1L << (ABSTRACT - 48)) | (1L << (ASYNC - 48)) | (1L << (STATIC - 48)) | (1L << (SYNCHRONIZED - 48)) | (1L << (IDENTIFIER - 48)))) != 0)) {
				{
				{
				setState(300);
				methodDeclaration();
				}
				}
				setState(305);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3Q\n"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\6\5\6b\n"+
		"\6\3\6\5\6e\n\6\3\6\3\6\3\6\5\6j\n\6\3\6\5\6m\n\6\3\6\3\6\3\6\7\6r\n\6"+
		"\f\6\16\6u\13\6\3\6\3\6\3\7\5\7z\n\7\3\7\3\7\3\7\3\b\5\b\u0080\n\b\3\b"+
		"\3\b\3\b\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091"+
		"\n\n\3\n\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\13\3"+
		"\13\5\13\u009f\n\13\3\f\3\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\r"+
		"\3\r\3\r\3\16\3\16\5\16\u00ae\n\16\3\16\5\16\u00b1\n\16\3\16\5\16\u00b4"+
		"\n\16\3\16\5\16\u00b7\n\16\3\16\5\16\u00ba\n\16\3\16\3\16\3\16\7\16\u00bf"+
		"\n\16\f\16\16\16\u00c2\13\16\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\16"+
		"\3\16\3\17\3\17\3\17\7\17\u00cf\n\17\f\17\16\17\u00d2\13\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\5\23\u00db\n\23\3\24\3\24\3\25\3\25\5\25\u00e1"+
		"\n\25\3\25\5\25\u00e4\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00f5\n\33\f\33\16\33\u00f8\13\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0100\n\35\f\35\16\35\u0103\13\35"+
		"\3\35\5\35\u0106\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u010d\n\36\3\36\3"+
		"\36\5\36\u0111\n\36\3\36\3\36\3\36\7\36\u0116\n\36\f\36\16\36\u0119\13"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0121\n\37\3\37\5\37\u0124\n\37"+
		"\3 \3 \3 \3!\7!\u012a\n!\f!\16!\u012d\13!\3\"\7\"\u0130\n\"\f\"\16\"\u0133"+
		"\13\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@B\2\6\3\2\33\34\4\2\66\6699\3\2\62\63\3\2\16\25\2\u013d\2G\3\2"+
		"\2\2\4M\3\2\2\2\6R\3\2\2\2\bU\3\2\2\2\na\3\2\2\2\fy\3\2\2\2\16\177\3\2"+
		"\2\2\20\u0085\3\2\2\2\22\u008a\3\2\2\2\24\u0095\3\2\2\2\26\u00a0\3\2\2"+
		"\2\30\u00a8\3\2\2\2\32\u00ab\3\2\2\2\34\u00cb\3\2\2\2\36\u00d3\3\2\2\2"+
		" \u00d5\3\2\2\2\"\u00d7\3\2\2\2$\u00da\3\2\2\2&\u00dc\3\2\2\2(\u00de\3"+
		"\2\2\2*\u00e5\3\2\2\2,\u00e7\3\2\2\2.\u00e9\3\2\2\2\60\u00eb\3\2\2\2\62"+
		"\u00ed\3\2\2\2\64\u00f0\3\2\2\2\66\u00f9\3\2\2\28\u00fc\3\2\2\2:\u0110"+
		"\3\2\2\2<\u011c\3\2\2\2>\u0125\3\2\2\2@\u012b\3\2\2\2B\u0131\3\2\2\2D"+
		"F\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JK\5\b\5\2KL\7\2\2\3L\3\3\2\2\2MN\7!\2\2NP\5\34\17\2OQ\5\6\4\2PO\3\2\2"+
		"\2PQ\3\2\2\2Q\5\3\2\2\2RS\7\35\2\2ST\7X\2\2T\7\3\2\2\2UV\7\26\2\2VW\5"+
		"*\26\2W\\\7\3\2\2X]\5\n\6\2Y]\5\f\7\2Z]\5\16\b\2[]\5\20\t\2\\X\3\2\2\2"+
		"\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^_\7\4\2\2_\t\3\2\2\2`b\5 "+
		"\21\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\5\"\22\2dc\3\2\2\2de\3\2\2\2ef\3"+
		"\2\2\2fg\7\27\2\2gi\5,\27\2hj\5\62\32\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2"+
		"km\5\64\33\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2ns\7\3\2\2or\5\30\r\2pr\5\32"+
		"\16\2qo\3\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3"+
		"\2\2\2vw\7\4\2\2w\13\3\2\2\2xz\7\62\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{|\7\30\2\2|}\7X\2\2}\r\3\2\2\2~\u0080\7\62\2\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\31\2\2\u0082\u0083\7X\2\2\u0083"+
		"\17\3\2\2\2\u0084\u0086\7\62\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0088\7\32\2\2\u0088\u0089\7X\2\2\u0089\21"+
		"\3\2\2\2\u008a\u008b\t\2\2\2\u008b\u0090\5.\30\2\u008c\u008d\7>\2\2\u008d"+
		"\u0091\5&\24\2\u008e\u008f\7\t\2\2\u008f\u0091\5(\25\2\u0090\u008c\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\5> \2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u009a\5.\30\2\u0096"+
		"\u0097\7>\2\2\u0097\u009b\5&\24\2\u0098\u0099\7\t\2\2\u0099\u009b\5(\25"+
		"\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009d"+
		"\7\35\2\2\u009d\u009f\5(\25\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\25\3\2\2\2\u00a0\u00a5\5\24\13\2\u00a1\u00a2\7\5\2\2\u00a2\u00a4"+
		"\5\24\13\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\5$\23\2\u00a9\u00aa\5\22\n\2\u00aa\31\3\2\2\2\u00ab\u00ad\5$\23\2\u00ac"+
		"\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2"+
		"\2\2\u00af\u00b1\7\64\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b4\7\65\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\78\2\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\7:\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5\60\31\2\u00bc"+
		"\u00c0\7\6\2\2\u00bd\u00bf\5\26\f\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c7\5("+
		"\25\2\u00c6\u00c8\7\b\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\58\35\2\u00ca\33\3\2\2\2\u00cb\u00d0\5\36\20"+
		"\2\u00cc\u00cd\7\13\2\2\u00cd\u00cf\5\36\20\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\35\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7X\2\2\u00d4\37\3\2\2\2\u00d5\u00d6"+
		"\7\62\2\2\u00d6!\3\2\2\2\u00d7\u00d8\7\66\2\2\u00d8#\3\2\2\2\u00d9\u00db"+
		"\t\4\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db%\3\2\2\2\u00dc"+
		"\u00dd\t\5\2\2\u00dd\'\3\2\2\2\u00de\u00e0\7X\2\2\u00df\u00e1\7\n\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4"+
		"\7\b\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4)\3\2\2\2\u00e5"+
		"\u00e6\7X\2\2\u00e6+\3\2\2\2\u00e7\u00e8\7X\2\2\u00e8-\3\2\2\2\u00e9\u00ea"+
		"\7X\2\2\u00ea/\3\2\2\2\u00eb\u00ec\7X\2\2\u00ec\61\3\2\2\2\u00ed\u00ee"+
		"\7\61\2\2\u00ee\u00ef\5,\27\2\u00ef\63\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1"+
		"\u00f6\5,\27\2\u00f2\u00f3\7\5\2\2\u00f3\u00f5\5,\27\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\65\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\7X\2\2"+
		"\u00fb\67\3\2\2\2\u00fc\u0101\7\3\2\2\u00fd\u0100\5\22\n\2\u00fe\u0100"+
		"\5:\36\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0106\5\66\34\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\7\4\2\2\u01089\3\2\2\2\u0109\u010d\5.\30\2"+
		"\u010a\u010d\5,\27\2\u010b\u010d\5&\24\2\u010c\u0109\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\r\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\5\60\31\2\u0113\u0117\7\6\2\2\u0114\u0116\5\26\f\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\7\2\2\u011b"+
		";\3\2\2\2\u011c\u011d\5.\30\2\u011d\u0120\7>\2\2\u011e\u0121\5:\36\2\u011f"+
		"\u0121\5&\24\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0124\5> \2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124="+
		"\3\2\2\2\u0125\u0126\7\35\2\2\u0126\u0127\5(\25\2\u0127?\3\2\2\2\u0128"+
		"\u012a\5\30\r\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012cA\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130"+
		"\5\32\16\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132C\3\2\2\2\u0133\u0131\3\2\2\2)GP\\adilqsy\177"+
		"\u0085\u0090\u0093\u009a\u009e\u00a5\u00ad\u00b0\u00b3\u00b6\u00b9\u00c0"+
		"\u00c7\u00d0\u00da\u00e0\u00e3\u00f6\u00ff\u0101\u0105\u010c\u0110\u0117"+
		"\u0120\u0123\u012b\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}