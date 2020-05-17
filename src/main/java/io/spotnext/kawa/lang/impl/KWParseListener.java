package io.spotnext.kawa.lang.impl;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import io.spotnext.kawa.lang.KawaListener;
import io.spotnext.kawa.lang.KawaParser.CastingContext;
import io.spotnext.kawa.lang.KawaParser.ClassDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.ClassModifiersContext;
import io.spotnext.kawa.lang.KawaParser.ClassNameContext;
import io.spotnext.kawa.lang.KawaParser.CodeBlockContext;
import io.spotnext.kawa.lang.KawaParser.CompilationUnitContext;
import io.spotnext.kawa.lang.KawaParser.EnumDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.ExtendsDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.FieldDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.ImplementsDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.ImportRenameContext;
import io.spotnext.kawa.lang.KawaParser.ImportsDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.InterfaceDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.MemberVisibilityModifiersContext;
import io.spotnext.kawa.lang.KawaParser.MethodArgumentsContext;
import io.spotnext.kawa.lang.KawaParser.MethodDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.MethodInvocationContext;
import io.spotnext.kawa.lang.KawaParser.MethodNameContext;
import io.spotnext.kawa.lang.KawaParser.PackageDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.PackageNameContext;
import io.spotnext.kawa.lang.KawaParser.QualifiedNameContext;
import io.spotnext.kawa.lang.KawaParser.QualifiedNameElementContext;
import io.spotnext.kawa.lang.KawaParser.ReturnStatementContext;
import io.spotnext.kawa.lang.KawaParser.StructDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.Test_fieldDeclarationsContext;
import io.spotnext.kawa.lang.KawaParser.Test_methodDeclarationsContext;
import io.spotnext.kawa.lang.KawaParser.TypeLiteralContext;
import io.spotnext.kawa.lang.KawaParser.VariableAssignmentContext;
import io.spotnext.kawa.lang.KawaParser.VariableDeclarationContext;
import io.spotnext.kawa.lang.KawaParser.VariableNameContext;

public abstract class KWParseListener implements KawaListener {

	@Override
	public void visitTerminal(TerminalNode node) {
		//

	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		//

	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		//

	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		//

	}

	@Override
	public void enterCompilationUnit(CompilationUnitContext ctx) {
		//

	}

	@Override
	public void exitCompilationUnit(CompilationUnitContext ctx) {
		//

	}

	@Override
	public void enterImportsDeclaration(ImportsDeclarationContext ctx) {
		//

	}

	@Override
	public void exitImportsDeclaration(ImportsDeclarationContext ctx) {
		//

	}

	@Override
	public void enterImportRename(ImportRenameContext ctx) {
		//

	}

	@Override
	public void exitImportRename(ImportRenameContext ctx) {
		//

	}

	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		//

	}

	@Override
	public void exitPackageDeclaration(PackageDeclarationContext ctx) {
		//

	}

	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		//

	}

	@Override
	public void exitClassDeclaration(ClassDeclarationContext ctx) {
		//

	}

	@Override
	public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		//

	}

	@Override
	public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		//

	}

	@Override
	public void enterEnumDeclaration(EnumDeclarationContext ctx) {
		//

	}

	@Override
	public void exitEnumDeclaration(EnumDeclarationContext ctx) {
		//

	}

	@Override
	public void enterStructDeclaration(StructDeclarationContext ctx) {
		//

	}

	@Override
	public void exitStructDeclaration(StructDeclarationContext ctx) {
		//

	}

	@Override
	public void enterVariableDeclaration(VariableDeclarationContext ctx) {
		//

	}

	@Override
	public void exitVariableDeclaration(VariableDeclarationContext ctx) {
		//

	}

	@Override
	public void enterMethodArguments(MethodArgumentsContext ctx) {
		//

	}

	@Override
	public void exitMethodArguments(MethodArgumentsContext ctx) {
		//

	}

	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {
		//

	}

	@Override
	public void exitFieldDeclaration(FieldDeclarationContext ctx) {
		//

	}

	@Override
	public void enterMethodDeclaration(MethodDeclarationContext ctx) {
		//

	}

	@Override
	public void exitMethodDeclaration(MethodDeclarationContext ctx) {
		//

	}

	@Override
	public void enterQualifiedName(QualifiedNameContext ctx) {
		//

	}

	@Override
	public void exitQualifiedName(QualifiedNameContext ctx) {
		//

	}

	@Override
	public void enterQualifiedNameElement(QualifiedNameElementContext ctx) {
		//

	}

	@Override
	public void exitQualifiedNameElement(QualifiedNameElementContext ctx) {
		//

	}

	@Override
	public void enterClassModifiers(ClassModifiersContext ctx) {
		//

	}

	@Override
	public void exitClassModifiers(ClassModifiersContext ctx) {
		//

	}

	@Override
	public void enterMemberVisibilityModifiers(MemberVisibilityModifiersContext ctx) {
		//

	}

	@Override
	public void exitMemberVisibilityModifiers(MemberVisibilityModifiersContext ctx) {
		//

	}

	@Override
	public void enterTypeLiteral(TypeLiteralContext ctx) {
		//

	}

	@Override
	public void exitTypeLiteral(TypeLiteralContext ctx) {
		//

	}

	@Override
	public void enterPackageName(PackageNameContext ctx) {
		//

	}

	@Override
	public void exitPackageName(PackageNameContext ctx) {
		//

	}

	@Override
	public void enterClassName(ClassNameContext ctx) {
		//

	}

	@Override
	public void exitClassName(ClassNameContext ctx) {
		//

	}

	@Override
	public void enterVariableName(VariableNameContext ctx) {
		//

	}

	@Override
	public void exitVariableName(VariableNameContext ctx) {
		//

	}

	@Override
	public void enterMethodName(MethodNameContext ctx) {
		//

	}

	@Override
	public void exitMethodName(MethodNameContext ctx) {
		//

	}

	@Override
	public void enterExtendsDeclaration(ExtendsDeclarationContext ctx) {
		//

	}

	@Override
	public void exitExtendsDeclaration(ExtendsDeclarationContext ctx) {
		//

	}

	@Override
	public void enterImplementsDeclaration(ImplementsDeclarationContext ctx) {
		//

	}

	@Override
	public void exitImplementsDeclaration(ImplementsDeclarationContext ctx) {
		//

	}

	@Override
	public void enterReturnStatement(ReturnStatementContext ctx) {
		//

	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		//

	}

	@Override
	public void enterCodeBlock(CodeBlockContext ctx) {
		//

	}

	@Override
	public void exitCodeBlock(CodeBlockContext ctx) {
		//

	}

	@Override
	public void enterMethodInvocation(MethodInvocationContext ctx) {
		//

	}

	@Override
	public void exitMethodInvocation(MethodInvocationContext ctx) {
		//

	}

	@Override
	public void enterVariableAssignment(VariableAssignmentContext ctx) {
		//

	}

	@Override
	public void exitVariableAssignment(VariableAssignmentContext ctx) {
		//

	}

	@Override
	public void enterCasting(CastingContext ctx) {
		//

	}

	@Override
	public void exitCasting(CastingContext ctx) {
		//

	}

	@Override
	public void enterTest_fieldDeclarations(Test_fieldDeclarationsContext ctx) {
		//

	}

	@Override
	public void exitTest_fieldDeclarations(Test_fieldDeclarationsContext ctx) {
		//

	}

	@Override
	public void enterTest_methodDeclarations(Test_methodDeclarationsContext ctx) {
		//

	}

	@Override
	public void exitTest_methodDeclarations(Test_methodDeclarationsContext ctx) {
		//

	}

}