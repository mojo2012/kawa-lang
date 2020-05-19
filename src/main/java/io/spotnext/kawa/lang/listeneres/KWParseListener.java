package io.spotnext.kawa.lang.listeneres;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import io.spotnext.kawa.lang.nodes.ImportStatementNode;
import io.spotnext.kawa.lang.nodes.PackageNode;
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

public class KWParseListener implements KawaListener {
	private static final Logger LOGGER = Logger.getLogger(KWErrorListener.class.toString());

	private List<ImportStatementNode> importStatements = new ArrayList<>();

	private PackageNode packageDeclaration;

	@Override
	public void enterImportsDeclaration(ImportsDeclarationContext ctx) {
		LOGGER.info("enterImportsDeclaration");
	}

	@Override
	public void exitImportsDeclaration(ImportsDeclarationContext ctx) {
		LOGGER.info("exitImportsDeclaration");

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
			LOGGER.warning("Canno process import statement");
		}
	}

	@Override
	public void exitPackageDeclaration(PackageDeclarationContext ctx) {
		final var packageName = ctx.children.get(1).getText();
		packageDeclaration = new PackageNode(packageName);
	}

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
	public void enterImportRename(ImportRenameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitImportRename(ImportRenameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterPackageName(PackageNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitPackageName(PackageNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
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
	public void enterClassName(ClassNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitClassName(ClassNameContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitClassDeclaration(ClassDeclarationContext ctx) {
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
		// TODO Auto-generated method stub

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
	public void exitMethodDeclaration(MethodDeclarationContext ctx) {
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
	public void exitMethodInvocation(MethodInvocationContext ctx) {
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