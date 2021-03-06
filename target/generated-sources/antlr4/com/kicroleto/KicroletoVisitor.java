// Generated from com\kicroleto\Kicroleto.g4 by ANTLR 4.9
package com.kicroleto;

    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KicroletoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KicroletoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KicroletoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KicroletoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link KicroletoParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(KicroletoParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KicroletoParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(KicroletoParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link KicroletoParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(KicroletoParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KicroletoParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(KicroletoParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link KicroletoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(KicroletoParser.ExpresionContext ctx);
}