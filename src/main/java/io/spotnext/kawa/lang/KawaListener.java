// Generated from /Users/matthias.fuchs.lokal/Projekte/privat/kawa-lang/src/main/java/io/spotnext/kawa/lang/Kawa.g4 by ANTLR 4.7.1
package io.spotnext.kawa.lang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KawaParser}.
 */
public interface KawaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KawaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(KawaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(KawaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#importsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportsDeclaration(KawaParser.ImportsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#importsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportsDeclaration(KawaParser.ImportsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#importRename}.
	 * @param ctx the parse tree
	 */
	void enterImportRename(KawaParser.ImportRenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#importRename}.
	 * @param ctx the parse tree
	 */
	void exitImportRename(KawaParser.ImportRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(KawaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(KawaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(KawaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(KawaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(KawaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(KawaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(KawaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(KawaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(KawaParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(KawaParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(KawaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(KawaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#methodArgument}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgument(KawaParser.MethodArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodArgument}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgument(KawaParser.MethodArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodArguments(KawaParser.MethodArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodArguments(KawaParser.MethodArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(KawaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(KawaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(KawaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(KawaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(KawaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(KawaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameElement(KawaParser.QualifiedNameElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameElement(KawaParser.QualifiedNameElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#classVisibilityModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassVisibilityModifiers(KawaParser.ClassVisibilityModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#classVisibilityModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassVisibilityModifiers(KawaParser.ClassVisibilityModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#classModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassModifiers(KawaParser.ClassModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#classModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassModifiers(KawaParser.ClassModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#memberVisibilityModifiers}.
	 * @param ctx the parse tree
	 */
	void enterMemberVisibilityModifiers(KawaParser.MemberVisibilityModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#memberVisibilityModifiers}.
	 * @param ctx the parse tree
	 */
	void exitMemberVisibilityModifiers(KawaParser.MemberVisibilityModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(KawaParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(KawaParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTypeLiteral(KawaParser.TypeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTypeLiteral(KawaParser.TypeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(KawaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(KawaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(KawaParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(KawaParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(KawaParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(KawaParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(KawaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(KawaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#extendsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtendsDeclaration(KawaParser.ExtendsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#extendsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtendsDeclaration(KawaParser.ExtendsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#implementsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImplementsDeclaration(KawaParser.ImplementsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#implementsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImplementsDeclaration(KawaParser.ImplementsDeclarationContext ctx);
}