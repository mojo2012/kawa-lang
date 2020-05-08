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
	public static final int
		RULE_compilationUnit = 0, RULE_importsDeclaration = 1, RULE_importRename = 2, 
		RULE_packageDeclaration = 3, RULE_classDeclaration = 4, RULE_interfaceDeclaration = 5, 
		RULE_enumDeclaration = 6, RULE_structDeclaration = 7, RULE_variableDeclaration = 8, 
		RULE_methodArgument = 9, RULE_methodArguments = 10, RULE_fieldDeclaration = 11, 
		RULE_methodDeclaration = 12, RULE_qualifiedName = 13, RULE_qualifiedNameElement = 14, 
		RULE_classVisibilityModifiers = 15, RULE_classModifiers = 16, RULE_memberVisibilityModifiers = 17, 
		RULE_literals = 18, RULE_typeLiteral = 19, RULE_packageName = 20, RULE_className = 21, 
		RULE_variableName = 22, RULE_methodName = 23, RULE_extendsDeclaration = 24, 
		RULE_implementsDeclaration = 25;
	public static final String[] ruleNames = {
		"compilationUnit", "importsDeclaration", "importRename", "packageDeclaration", 
		"classDeclaration", "interfaceDeclaration", "enumDeclaration", "structDeclaration", 
		"variableDeclaration", "methodArgument", "methodArguments", "fieldDeclaration", 
		"methodDeclaration", "qualifiedName", "qualifiedNameElement", "classVisibilityModifiers", 
		"classModifiers", "memberVisibilityModifiers", "literals", "typeLiteral", 
		"packageName", "className", "variableName", "methodName", "extendsDeclaration", 
		"implementsDeclaration"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(52);
				importsDeclaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			packageDeclaration();
			setState(59);
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
			setState(61);
			match(IMPORT);
			setState(62);
			qualifiedName();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(63);
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
			setState(66);
			match(AS);
			setState(67);
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
			setState(69);
			match(PACKAGE);
			setState(70);
			packageName();
			setState(71);
			match(T__0);
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(72);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(73);
				interfaceDeclaration();
				}
				break;
			case 3:
				{
				setState(74);
				enumDeclaration();
				}
				break;
			case 4:
				{
				setState(75);
				structDeclaration();
				}
				break;
			}
			setState(78);
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(80);
				classVisibilityModifiers();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(83);
				classModifiers();
				}
			}

			setState(86);
			match(CLASS);
			setState(87);
			className();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(88);
				extendsDeclaration();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(91);
				implementsDeclaration();
				}
			}

			setState(94);
			match(T__0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (VARIABLE - 23)) | (1L << (FINAL_VARIABLE - 23)) | (1L << (PRIVATE - 23)) | (1L << (PROTECTED - 23)) | (1L << (NATIVE - 23)) | (1L << (VOLATILE - 23)) | (1L << (ABSTRACT - 23)) | (1L << (ASYNC - 23)) | (1L << (STATIC - 23)) | (1L << (SYNCHRONIZED - 23)) | (1L << (IDENTIFIER - 23)))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(95);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(96);
					methodDeclaration();
					}
					break;
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(104);
				match(PRIVATE);
				}
			}

			setState(107);
			match(INTERFACE);
			setState(108);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(110);
				match(PRIVATE);
				}
			}

			setState(113);
			match(ENUM);
			setState(114);
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(116);
				match(PRIVATE);
				}
			}

			setState(119);
			match(STRUCT);
			setState(120);
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
		public List<TypeLiteralContext> typeLiteral() {
			return getRuleContexts(TypeLiteralContext.class);
		}
		public TypeLiteralContext typeLiteral(int i) {
			return getRuleContext(TypeLiteralContext.class,i);
		}
		public TerminalNode AS() { return getToken(KawaParser.AS, 0); }
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
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==FINAL_VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			variableName();
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(124);
				match(ASSIGN);
				setState(125);
				literals();
				}
				break;
			case DECLARE_TYPE:
				{
				setState(126);
				match(DECLARE_TYPE);
				setState(127);
				typeLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(130);
				match(AS);
				setState(131);
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
			setState(134);
			variableName();
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(135);
				match(ASSIGN);
				setState(136);
				literals();
				}
				break;
			case DECLARE_TYPE:
				{
				setState(137);
				match(DECLARE_TYPE);
				setState(138);
				typeLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(141);
				match(AS);
				setState(142);
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
			setState(145);
			methodArgument();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(146);
				match(T__2);
				setState(147);
				methodArgument();
				}
				}
				setState(152);
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
			setState(153);
			memberVisibilityModifiers();
			}
			setState(154);
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
			setState(156);
			memberVisibilityModifiers();
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(157);
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

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(160);
				match(NATIVE);
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOLATILE) {
				{
				setState(163);
				match(VOLATILE);
				}
			}

			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(166);
				match(ASYNC);
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYNCHRONIZED) {
				{
				setState(169);
				match(SYNCHRONIZED);
				}
			}

			setState(172);
			methodName();
			setState(173);
			match(T__3);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(174);
				methodArguments();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(T__4);
			setState(181);
			match(DECLARE_TYPE);
			setState(182);
			typeLiteral();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(183);
				match(OPTIONAL);
				}
			}

			setState(186);
			match(T__0);
			setState(187);
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
			setState(189);
			qualifiedNameElement();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PACKAGE_SEPARATOR) {
				{
				{
				setState(190);
				match(PACKAGE_SEPARATOR);
				setState(191);
				qualifiedNameElement();
				}
				}
				setState(196);
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
			setState(197);
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
			setState(199);
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
			setState(201);
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
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PROTECTED) {
				{
				setState(203);
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
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << HEX_NUMERIC_LITERAL))) != 0)) ) {
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
			setState(208);
			match(IDENTIFIER);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_EMPTY) {
				{
				setState(209);
				match(ARRAY_EMPTY);
				}
			}

			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(212);
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
			setState(215);
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
			setState(217);
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
			setState(219);
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
			setState(221);
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
			setState(223);
			match(EXTENDS);
			setState(224);
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
			setState(226);
			match(IMPLEMENTS);
			setState(227);
			className();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(228);
				match(T__2);
				setState(229);
				className();
				}
				}
				setState(234);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\5\3C\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3"+
		"\6\5\6T\n\6\3\6\5\6W\n\6\3\6\3\6\3\6\5\6\\\n\6\3\6\5\6_\n\6\3\6\3\6\3"+
		"\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\7\5\7l\n\7\3\7\3\7\3\7\3\b\5\br\n"+
		"\b\3\b\3\b\3\b\3\t\5\tx\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083"+
		"\n\n\3\n\3\n\5\n\u0087\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3"+
		"\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f"+
		"\3\r\3\r\3\r\3\16\3\16\5\16\u00a1\n\16\3\16\5\16\u00a4\n\16\3\16\5\16"+
		"\u00a7\n\16\3\16\5\16\u00aa\n\16\3\16\5\16\u00ad\n\16\3\16\3\16\3\16\7"+
		"\16\u00b2\n\16\f\16\16\16\u00b5\13\16\3\16\3\16\3\16\3\16\5\16\u00bb\n"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00c3\n\17\f\17\16\17\u00c6\13"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23\u00cf\n\23\3\24\3\24\3\25"+
		"\3\25\5\25\u00d5\n\25\3\25\5\25\u00d8\n\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00e9\n\33\f\33"+
		"\16\33\u00ec\13\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\6\3\2\31\32\4\2\64\64\67\67\3\2\60\61\4\2\f\f\16"+
		"\23\2\u00f2\29\3\2\2\2\4?\3\2\2\2\6D\3\2\2\2\bG\3\2\2\2\nS\3\2\2\2\fk"+
		"\3\2\2\2\16q\3\2\2\2\20w\3\2\2\2\22|\3\2\2\2\24\u0088\3\2\2\2\26\u0093"+
		"\3\2\2\2\30\u009b\3\2\2\2\32\u009e\3\2\2\2\34\u00bf\3\2\2\2\36\u00c7\3"+
		"\2\2\2 \u00c9\3\2\2\2\"\u00cb\3\2\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00d2"+
		"\3\2\2\2*\u00d9\3\2\2\2,\u00db\3\2\2\2.\u00dd\3\2\2\2\60\u00df\3\2\2\2"+
		"\62\u00e1\3\2\2\2\64\u00e4\3\2\2\2\668\5\4\3\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5\b\5\2=>\7\2\2\3>\3\3\2"+
		"\2\2?@\7\37\2\2@B\5\34\17\2AC\5\6\4\2BA\3\2\2\2BC\3\2\2\2C\5\3\2\2\2D"+
		"E\7\33\2\2EF\7V\2\2F\7\3\2\2\2GH\7\24\2\2HI\5*\26\2IN\7\3\2\2JO\5\n\6"+
		"\2KO\5\f\7\2LO\5\16\b\2MO\5\20\t\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2"+
		"\2\2OP\3\2\2\2PQ\7\4\2\2Q\t\3\2\2\2RT\5 \21\2SR\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2UW\5\"\22\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\25\2\2Y[\5,\27\2Z"+
		"\\\5\62\32\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\5\64\33\2^]\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`e\7\3\2\2ad\5\30\r\2bd\5\32\16\2ca\3\2\2\2cb\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\4\2\2i\13\3\2\2"+
		"\2jl\7\60\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\26\2\2no\7V\2\2o\r\3\2"+
		"\2\2pr\7\60\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\27\2\2tu\7V\2\2u\17"+
		"\3\2\2\2vx\7\60\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\30\2\2z{\7V\2\2"+
		"{\21\3\2\2\2|}\t\2\2\2}\u0082\5.\30\2~\177\7<\2\2\177\u0083\5&\24\2\u0080"+
		"\u0081\7\t\2\2\u0081\u0083\5(\25\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0085\7\33\2\2\u0085\u0087\5(\25\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088\u008d\5.\30\2\u0089"+
		"\u008a\7<\2\2\u008a\u008e\5&\24\2\u008b\u008c\7\t\2\2\u008c\u008e\5(\25"+
		"\2\u008d\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090"+
		"\7\33\2\2\u0090\u0092\5(\25\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\25\3\2\2\2\u0093\u0098\5\24\13\2\u0094\u0095\7\5\2\2\u0095\u0097"+
		"\5\24\13\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\27\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c"+
		"\5$\23\2\u009c\u009d\5\22\n\2\u009d\31\3\2\2\2\u009e\u00a0\5$\23\2\u009f"+
		"\u00a1\t\3\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a4\7\62\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a7\7\63\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\7\66\2\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\78\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\60\31\2\u00af"+
		"\u00b3\7\6\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00ba\5("+
		"\25\2\u00b9\u00bb\7\b\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\7\4\2\2\u00be\33\3\2\2"+
		"\2\u00bf\u00c4\5\36\20\2\u00c0\u00c1\7\13\2\2\u00c1\u00c3\5\36\20\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\35\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7V\2\2\u00c8\37"+
		"\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca!\3\2\2\2\u00cb\u00cc\7\64\2\2\u00cc"+
		"#\3\2\2\2\u00cd\u00cf\t\4\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf%\3\2\2\2\u00d0\u00d1\t\5\2\2\u00d1\'\3\2\2\2\u00d2\u00d4\7V\2\2"+
		"\u00d3\u00d5\7\n\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7"+
		"\3\2\2\2\u00d6\u00d8\7\b\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		")\3\2\2\2\u00d9\u00da\7V\2\2\u00da+\3\2\2\2\u00db\u00dc\7V\2\2\u00dc-"+
		"\3\2\2\2\u00dd\u00de\7V\2\2\u00de/\3\2\2\2\u00df\u00e0\7V\2\2\u00e0\61"+
		"\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2\u00e3\5,\27\2\u00e3\63\3\2\2\2\u00e4"+
		"\u00e5\7.\2\2\u00e5\u00ea\5,\27\2\u00e6\u00e7\7\5\2\2\u00e7\u00e9\5,\27"+
		"\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\65\3\2\2\2\u00ec\u00ea\3\2\2\2\379BNSV[^cekqw\u0082\u0086"+
		"\u008d\u0091\u0098\u00a0\u00a3\u00a6\u00a9\u00ac\u00b3\u00ba\u00c4\u00ce"+
		"\u00d4\u00d7\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}