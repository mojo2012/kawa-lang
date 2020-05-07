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
	 * Enter a parse tree produced by {@link KawaParser#kPackage}.
	 * @param ctx the parse tree
	 */
	void enterKPackage(KawaParser.KPackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kPackage}.
	 * @param ctx the parse tree
	 */
	void exitKPackage(KawaParser.KPackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#kClass}.
	 * @param ctx the parse tree
	 */
	void enterKClass(KawaParser.KClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kClass}.
	 * @param ctx the parse tree
	 */
	void exitKClass(KawaParser.KClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#kInterface}.
	 * @param ctx the parse tree
	 */
	void enterKInterface(KawaParser.KInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kInterface}.
	 * @param ctx the parse tree
	 */
	void exitKInterface(KawaParser.KInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#kEenum}.
	 * @param ctx the parse tree
	 */
	void enterKEenum(KawaParser.KEenumContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kEenum}.
	 * @param ctx the parse tree
	 */
	void exitKEenum(KawaParser.KEenumContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#kStruct}.
	 * @param ctx the parse tree
	 */
	void enterKStruct(KawaParser.KStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kStruct}.
	 * @param ctx the parse tree
	 */
	void exitKStruct(KawaParser.KStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#kMemberVisibilityModifiers}.
	 * @param ctx the parse tree
	 */
	void enterKMemberVisibilityModifiers(KawaParser.KMemberVisibilityModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kMemberVisibilityModifiers}.
	 * @param ctx the parse tree
	 */
	void exitKMemberVisibilityModifiers(KawaParser.KMemberVisibilityModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#kVariable}.
	 * @param ctx the parse tree
	 */
	void enterKVariable(KawaParser.KVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kVariable}.
	 * @param ctx the parse tree
	 */
	void exitKVariable(KawaParser.KVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KawaParser#kMethod}.
	 * @param ctx the parse tree
	 */
	void enterKMethod(KawaParser.KMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link KawaParser#kMethod}.
	 * @param ctx the parse tree
	 */
	void exitKMethod(KawaParser.KMethodContext ctx);
}