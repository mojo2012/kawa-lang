package io.spotnext.kawa.lang.listeneres;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import io.spotnext.kawa.lang.nodes.ClassNode;
import io.spotnext.kawa.lang.nodes.CodeBlockNode;
import io.spotnext.kawa.lang.nodes.FieldNode;
import io.spotnext.kawa.lang.nodes.ImportStatementNode;
import io.spotnext.kawa.lang.nodes.MemberModifierNode;
import io.spotnext.kawa.lang.nodes.MethodArgumentNode;
import io.spotnext.kawa.lang.nodes.MethodInvocationNode;
import io.spotnext.kawa.lang.nodes.MethodNode;
import io.spotnext.kawa.lang.nodes.StatementNode;
import io.spotnext.kawa.lang.nodes.TypeNode;
import io.spotnext.kawa.lang.parser.KawaListener;
import io.spotnext.kawa.lang.parser.KawaParser.AnnotationDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.AnnotationModifiersContext;
import io.spotnext.kawa.lang.parser.KawaParser.AnnotationNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.AnnotationValueContext;
import io.spotnext.kawa.lang.parser.KawaParser.ArgumentsContext;
import io.spotnext.kawa.lang.parser.KawaParser.AssignmentContext;
import io.spotnext.kawa.lang.parser.KawaParser.CastingContext;
import io.spotnext.kawa.lang.parser.KawaParser.ClassDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.ClassModifiersContext;
import io.spotnext.kawa.lang.parser.KawaParser.ClassNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.CodeBlockContext;
import io.spotnext.kawa.lang.parser.KawaParser.CompilationUnitContext;
import io.spotnext.kawa.lang.parser.KawaParser.EnumDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.EnumModifiersContext;
import io.spotnext.kawa.lang.parser.KawaParser.EnumNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.EnumValueDeclarationArgumentContext;
import io.spotnext.kawa.lang.parser.KawaParser.EnumValueDeclarationArgumentsContext;
import io.spotnext.kawa.lang.parser.KawaParser.EnumValueDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.EnumValueDeclarationsContext;
import io.spotnext.kawa.lang.parser.KawaParser.ExtendsDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.FieldDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.GenericArgumentContext;
import io.spotnext.kawa.lang.parser.KawaParser.GenericArgumentsContext;
import io.spotnext.kawa.lang.parser.KawaParser.ImplementsDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.ImportRenameContext;
import io.spotnext.kawa.lang.parser.KawaParser.ImportsDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.InterfaceDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.InterfaceModifiersContext;
import io.spotnext.kawa.lang.parser.KawaParser.InterfaceNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.ListInitializationContext;
import io.spotnext.kawa.lang.parser.KawaParser.LiteralContext;
import io.spotnext.kawa.lang.parser.KawaParser.MapInitializationContext;
import io.spotnext.kawa.lang.parser.KawaParser.MapKeyValueContext;
import io.spotnext.kawa.lang.parser.KawaParser.MapKeyValuesContext;
import io.spotnext.kawa.lang.parser.KawaParser.MemberVisibilityModifiersContext;
import io.spotnext.kawa.lang.parser.KawaParser.MethodArgumentsContext;
import io.spotnext.kawa.lang.parser.KawaParser.MethodDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.MethodInvocationContext;
import io.spotnext.kawa.lang.parser.KawaParser.MethodModifiersContext;
import io.spotnext.kawa.lang.parser.KawaParser.MethodNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.MethodParameterContext;
import io.spotnext.kawa.lang.parser.KawaParser.MethodParametersContext;
import io.spotnext.kawa.lang.parser.KawaParser.PackageDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.PackageNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.QualifiedTypeNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.QualifiedTypeNameElementContext;
import io.spotnext.kawa.lang.parser.KawaParser.QualifiedmemberNameElementContext;
import io.spotnext.kawa.lang.parser.KawaParser.ReturnStatementContext;
import io.spotnext.kawa.lang.parser.KawaParser.StructDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.StructModifiersContext;
import io.spotnext.kawa.lang.parser.KawaParser.StructNameContext;
import io.spotnext.kawa.lang.parser.KawaParser.Test_fieldDeclarationsContext;
import io.spotnext.kawa.lang.parser.KawaParser.Test_methodDeclarationsContext;
import io.spotnext.kawa.lang.parser.KawaParser.TypeLiteralContext;
import io.spotnext.kawa.lang.parser.KawaParser.VariableAccessContext;
import io.spotnext.kawa.lang.parser.KawaParser.VariableAssignmentContext;
import io.spotnext.kawa.lang.parser.KawaParser.VariableDeclarationContext;
import io.spotnext.kawa.lang.parser.KawaParser.VariableNameContext;
import io.spotnext.kawa.lang.runtime.MemberVisibility;
import io.spotnext.kawa.util.Loggable;

public class KWParseListener implements KawaListener, Loggable {
	// temporary variables
	private List<ImportStatementNode> importStatements = new ArrayList<>();
	private String packageName;
	private String typeName;

	private List<MethodNode> methods = new ArrayList<>();
	private List<FieldNode> fields = new ArrayList<>();

	// current typeNode
	private TypeNode typeNode;
	private MethodNode mainMethod;

	public Optional<MethodNode> getMainMethod() {
		return Optional.ofNullable(mainMethod);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// import
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void enterImportsDeclaration(ImportsDeclarationContext ctx) {
		log().info("enterImportsDeclaration");
	}

	@Override
	public void exitImportsDeclaration(ImportsDeclarationContext ctx) {
		log().info("exitImportsDeclaration");

		if (ctx.children.size() >= 2) {
			final var qualifiedTypeName = ctx.children.get(1).getText();
			String qualifiedMethodName = null;
			String alias = null;

			if (ctx.children.size() >= 5) {
				qualifiedMethodName = ctx.children.get(4).getText();

				if (ctx.children.size() >= 6) {
					alias = ctx.children.get(5).getChild(1).getText();
				}
			}

			final var statement = new ImportStatementNode(qualifiedTypeName, qualifiedMethodName, alias);

			importStatements.add(statement);
		} else {
			log().warning("Cannot process import statement");
		}
	}

	@Override
	public void enterImportRename(ImportRenameContext ctx) {
		log().info("enterImportRename");
		// not needed
	}

	@Override
	public void exitImportRename(ImportRenameContext ctx) {
		log().info("exitImportRename");
		// not needed
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// package
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		log().info("enterPackageDeclaration");
	}

	@Override
	public void exitPackageDeclaration(PackageDeclarationContext ctx) {
		log().info("exitPackageDeclaration");
		this.packageName = ctx.children.get(1).getText();
		this.typeNode = new ClassNode(typeName, packageName, importStatements, methods);
	}

	@Override
	public void enterPackageName(PackageNameContext ctx) {
		log().info("enterPackageName");
		// not needed
	}

	@Override
	public void exitPackageName(PackageNameContext ctx) {
		log().info("exitPackageName");
		// not needed
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// type
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		log().info("enterClassDeclaration");
		// not needed
	}

	@Override
	public void exitClassDeclaration(ClassDeclarationContext ctx) {
		log().info("exitClassDeclaration");
		// not needed
	}

	@Override
	public void enterClassName(ClassNameContext ctx) {
		log().info("enterClassName");
		// not needed
	}

	@Override
	public void exitClassName(ClassNameContext ctx) {
		log().info("exitClassName");
		if (ctx.children != null) {
			this.typeName = ctx.children.get(0).getText();
		} else {
			log().warning("No children");
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// class body
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void exitMethodDeclaration(MethodDeclarationContext ctx) {
		log().info("exitMethodDeclaration");

		final var modifiers = new ArrayList<MemberModifierNode>();
		final var modifierParentNode = ctx.children.get(0);

		for (int x = 0; x < modifierParentNode.getChildCount(); x++) {
			final var modifier = modifierParentNode.getChild(x);
			final var modifierNode = new MemberModifierNode(modifier.getText());
			modifiers.add(modifierNode);
		}

		final var name = ctx.children.get(2).getText();
		final var statements = new ArrayList<StatementNode>();

		{
			final var methodName = ctx.children.get(9).getChild(1).getChild(0).getText();
			final var methodArguments = new ArrayList<MethodArgumentNode>();

			for (int x = 0; x < ctx.getChild(2).getChildCount(); x++) {
				final var arg = ctx.getChild(2).getChild(x);
				final var argNode = new MethodArgumentNode(x);
				methodArguments.add(argNode);
			}

			final var statement = new MethodInvocationNode(methodName, methodArguments);
			statements.add(statement);
		}

		final var method = new MethodNode(name, modifiers, new CodeBlockNode(statements));

		this.methods.add(method);

		if ("main".equals(method.getName()) && MemberVisibility.PUBLIC.equals(method.getVisibility())) {
			this.mainMethod = method;
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// code blocks
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void exitMethodInvocation(MethodInvocationContext ctx) {
		log().info("exitMethodInvocation");

		// final var methodName = ctx.children.get(0).getText();
		// final var methodArguments = new ArrayList<String>();

		// for (int x = 0; x < ctx.getChild(2).getChildCount(); x++) {
		// 	final var arg = ctx.getChild(2).getChild(x);
		// 	final var argNode = new MethodArgumentNode(x);
		// }

	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// unused
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterQualifiedTypeName(QualifiedTypeNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitQualifiedTypeName(QualifiedTypeNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterQualifiedTypeNameElement(QualifiedTypeNameElementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitQualifiedTypeNameElement(QualifiedTypeNameElementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterQualifiedmemberNameElement(QualifiedmemberNameElementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitQualifiedmemberNameElement(QualifiedmemberNameElementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterCompilationUnit(CompilationUnitContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitCompilationUnit(CompilationUnitContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterExtendsDeclaration(ExtendsDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitExtendsDeclaration(ExtendsDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterImplementsDeclaration(ImplementsDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitImplementsDeclaration(ImplementsDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterGenericArgument(GenericArgumentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitGenericArgument(GenericArgumentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterGenericArguments(GenericArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitGenericArguments(GenericArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterClassModifiers(ClassModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitClassModifiers(ClassModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterInterfaceModifiers(InterfaceModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitInterfaceModifiers(InterfaceModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterInterfaceName(InterfaceNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitInterfaceName(InterfaceNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnumModifiers(EnumModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnumModifiers(EnumModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnumName(EnumNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnumName(EnumNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnumValueDeclarationArgument(EnumValueDeclarationArgumentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnumValueDeclarationArgument(EnumValueDeclarationArgumentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnumValueDeclarationArguments(EnumValueDeclarationArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnumValueDeclarationArguments(EnumValueDeclarationArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnumValueDeclaration(EnumValueDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnumValueDeclaration(EnumValueDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnumValueDeclarations(EnumValueDeclarationsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnumValueDeclarations(EnumValueDeclarationsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnumDeclaration(EnumDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnumDeclaration(EnumDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterStructModifiers(StructModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitStructModifiers(StructModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterStructName(StructNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitStructName(StructNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterStructDeclaration(StructDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitStructDeclaration(StructDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAnnotationModifiers(AnnotationModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAnnotationModifiers(AnnotationModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAnnotationName(AnnotationNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAnnotationName(AnnotationNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAnnotationValue(AnnotationValueContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAnnotationValue(AnnotationValueContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAnnotationDeclaration(AnnotationDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAnnotationDeclaration(AnnotationDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterTypeLiteral(TypeLiteralContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitTypeLiteral(TypeLiteralContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterCasting(CastingContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitCasting(CastingContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMemberVisibilityModifiers(MemberVisibilityModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMemberVisibilityModifiers(MemberVisibilityModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterVariableName(VariableNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitVariableName(VariableNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterVariableAccess(VariableAccessContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitVariableAccess(VariableAccessContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterVariableDeclaration(VariableDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitVariableDeclaration(VariableDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitFieldDeclaration(FieldDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMethodModifiers(MethodModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMethodModifiers(MethodModifiersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMethodName(MethodNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMethodName(MethodNameContext ctx) {

	}

	@Override
	public void enterMethodParameter(MethodParameterContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMethodParameter(MethodParameterContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMethodParameters(MethodParametersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMethodParameters(MethodParametersContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMethodDeclaration(MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMethodArguments(MethodArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMethodArguments(MethodArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMethodInvocation(MethodInvocationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterVariableAssignment(VariableAssignmentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitVariableAssignment(VariableAssignmentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterCodeBlock(CodeBlockContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitCodeBlock(CodeBlockContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterListInitialization(ListInitializationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitListInitialization(ListInitializationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMapKeyValue(MapKeyValueContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMapKeyValue(MapKeyValueContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMapKeyValues(MapKeyValuesContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMapKeyValues(MapKeyValuesContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMapInitialization(MapInitializationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMapInitialization(MapInitializationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterTest_fieldDeclarations(Test_fieldDeclarationsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitTest_fieldDeclarations(Test_fieldDeclarationsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterTest_methodDeclarations(Test_methodDeclarationsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitTest_methodDeclarations(Test_methodDeclarationsContext ctx) {
		// TODO Auto-generated method stub

	}

}