// Generated from grammer.g4 by ANTLR 4.4
package com.northeastern.msd.team102.plagiarismchecker.antlr.grammer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammerParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(@NotNull grammerParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(@NotNull grammerParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull grammerParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(@NotNull grammerParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(@NotNull grammerParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(@NotNull grammerParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(@NotNull grammerParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(@NotNull grammerParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(@NotNull grammerParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(@NotNull grammerParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(@NotNull grammerParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(@NotNull grammerParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(@NotNull grammerParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(@NotNull grammerParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(@NotNull grammerParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#encoding_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_decl(@NotNull grammerParser.Encoding_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(@NotNull grammerParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(@NotNull grammerParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(@NotNull grammerParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(@NotNull grammerParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(@NotNull grammerParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(@NotNull grammerParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(@NotNull grammerParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(@NotNull grammerParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull grammerParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(@NotNull grammerParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(@NotNull grammerParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(@NotNull grammerParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(@NotNull grammerParser.Yield_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(@NotNull grammerParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(@NotNull grammerParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(@NotNull grammerParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(@NotNull grammerParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(@NotNull grammerParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(@NotNull grammerParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(@NotNull grammerParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(@NotNull grammerParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(@NotNull grammerParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(@NotNull grammerParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(@NotNull grammerParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(@NotNull grammerParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull grammerParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(@NotNull grammerParser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#async_funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_funcdef(@NotNull grammerParser.Async_funcdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(@NotNull grammerParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(@NotNull grammerParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(@NotNull grammerParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(@NotNull grammerParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(@NotNull grammerParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(@NotNull grammerParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(@NotNull grammerParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(@NotNull grammerParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(@NotNull grammerParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(@NotNull grammerParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(@NotNull grammerParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull grammerParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(@NotNull grammerParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(@NotNull grammerParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull grammerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull grammerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(@NotNull grammerParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(@NotNull grammerParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull grammerParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(@NotNull grammerParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(@NotNull grammerParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(@NotNull grammerParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(@NotNull grammerParser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(@NotNull grammerParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(@NotNull grammerParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_stmt(@NotNull grammerParser.Async_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(@NotNull grammerParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(@NotNull grammerParser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(@NotNull grammerParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(@NotNull grammerParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(@NotNull grammerParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(@NotNull grammerParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(@NotNull grammerParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(@NotNull grammerParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(@NotNull grammerParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(@NotNull grammerParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(@NotNull grammerParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(@NotNull grammerParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(@NotNull grammerParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(@NotNull grammerParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull grammerParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull grammerParser.StmtContext ctx);
}