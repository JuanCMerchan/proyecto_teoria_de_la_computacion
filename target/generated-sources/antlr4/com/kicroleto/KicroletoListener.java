// Generated from com\kicroleto\Kicroleto.g4 by ANTLR 4.9
package com.kicroleto;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KicroletoParser}.
 */
public interface KicroletoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KicroletoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KicroletoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KicroletoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KicroletoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KicroletoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(KicroletoParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KicroletoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(KicroletoParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KicroletoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(KicroletoParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link KicroletoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(KicroletoParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link KicroletoParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(KicroletoParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KicroletoParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(KicroletoParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KicroletoParser#println_var}.
	 * @param ctx the parse tree
	 */
	void enterPrintln_var(KicroletoParser.Println_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link KicroletoParser#println_var}.
	 * @param ctx the parse tree
	 */
	void exitPrintln_var(KicroletoParser.Println_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link KicroletoParser#println_int}.
	 * @param ctx the parse tree
	 */
	void enterPrintln_int(KicroletoParser.Println_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link KicroletoParser#println_int}.
	 * @param ctx the parse tree
	 */
	void exitPrintln_int(KicroletoParser.Println_intContext ctx);
}