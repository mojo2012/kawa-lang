// Generated from /Users/matthias/Projekte/kawa-lang/src/main/java/io/spotnext/kawa/lang/parser/Kawa.g4 by ANTLR 4.7.1
package io.spotnext.kawa.lang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KawaParser}.
 */
public interface KawaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KawaParser#qualifiedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedTypeName(KawaParser.QualifiedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#qualifiedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedTypeName(KawaParser.QualifiedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#qualifiedTypeNameElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedTypeNameElement(KawaParser.QualifiedTypeNameElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#qualifiedTypeNameElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedTypeNameElement(KawaParser.QualifiedTypeNameElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#qualifiedmemberNameElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedmemberNameElement(KawaParser.QualifiedmemberNameElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#qualifiedmemberNameElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedmemberNameElement(KawaParser.QualifiedmemberNameElementContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link KawaParser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgument(KawaParser.GenericArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgument(KawaParser.GenericArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#genericArguments}.
	 * @param ctx the parse tree
	 */
	void enterGenericArguments(KawaParser.GenericArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#genericArguments}.
	 * @param ctx the parse tree
	 */
	void exitGenericArguments(KawaParser.GenericArgumentsContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#interfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifiers(KawaParser.InterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#interfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifiers(KawaParser.InterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(KawaParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(KawaParser.InterfaceNameContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#enumModifiers}.
	 * @param ctx the parse tree
	 */
	void enterEnumModifiers(KawaParser.EnumModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#enumModifiers}.
	 * @param ctx the parse tree
	 */
	void exitEnumModifiers(KawaParser.EnumModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(KawaParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(KawaParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#enumValueDeclarationArgument}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueDeclarationArgument(KawaParser.EnumValueDeclarationArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#enumValueDeclarationArgument}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueDeclarationArgument(KawaParser.EnumValueDeclarationArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#enumValueDeclarationArguments}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueDeclarationArguments(KawaParser.EnumValueDeclarationArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#enumValueDeclarationArguments}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueDeclarationArguments(KawaParser.EnumValueDeclarationArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#enumValueDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueDeclaration(KawaParser.EnumValueDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#enumValueDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueDeclaration(KawaParser.EnumValueDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#enumValueDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueDeclarations(KawaParser.EnumValueDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#enumValueDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueDeclarations(KawaParser.EnumValueDeclarationsContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#structModifiers}.
	 * @param ctx the parse tree
	 */
	void enterStructModifiers(KawaParser.StructModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#structModifiers}.
	 * @param ctx the parse tree
	 */
	void exitStructModifiers(KawaParser.StructModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(KawaParser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(KawaParser.StructNameContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#annotationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationModifiers(KawaParser.AnnotationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#annotationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationModifiers(KawaParser.AnnotationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(KawaParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(KawaParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#annotationValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationValue(KawaParser.AnnotationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#annotationValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationValue(KawaParser.AnnotationValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDeclaration(KawaParser.AnnotationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDeclaration(KawaParser.AnnotationDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#casting}.
	 * @param ctx the parse tree
	 */
	void enterCasting(KawaParser.CastingContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#casting}.
	 * @param ctx the parse tree
	 */
	void exitCasting(KawaParser.CastingContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(KawaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(KawaParser.LiteralContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KawaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KawaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(KawaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(KawaParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(KawaParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(KawaParser.VariableAccessContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#methodModifiers}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifiers(KawaParser.MethodModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodModifiers}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifiers(KawaParser.MethodModifiersContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(KawaParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(KawaParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameters(KawaParser.MethodParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameters(KawaParser.MethodParametersContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(KawaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(KawaParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link KawaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(KawaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(KawaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(KawaParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(KawaParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(KawaParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(KawaParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#listInitialization}.
	 * @param ctx the parse tree
	 */
	void enterListInitialization(KawaParser.ListInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#listInitialization}.
	 * @param ctx the parse tree
	 */
	void exitListInitialization(KawaParser.ListInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#mapKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterMapKeyValue(KawaParser.MapKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#mapKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitMapKeyValue(KawaParser.MapKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#mapKeyValues}.
	 * @param ctx the parse tree
	 */
	void enterMapKeyValues(KawaParser.MapKeyValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#mapKeyValues}.
	 * @param ctx the parse tree
	 */
	void exitMapKeyValues(KawaParser.MapKeyValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#mapInitialization}.
	 * @param ctx the parse tree
	 */
	void enterMapInitialization(KawaParser.MapInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#mapInitialization}.
	 * @param ctx the parse tree
	 */
	void exitMapInitialization(KawaParser.MapInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#test_fieldDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterTest_fieldDeclarations(KawaParser.Test_fieldDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#test_fieldDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitTest_fieldDeclarations(KawaParser.Test_fieldDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#test_methodDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterTest_methodDeclarations(KawaParser.Test_methodDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#test_methodDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitTest_methodDeclarations(KawaParser.Test_methodDeclarationsContext ctx);
}