// Generated from grammer.g4 by ANTLR 4.4
package com.northeastern.msd.team102.plagiarismchecker.antlr.grammer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammerParser}.
 */
public interface grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammerParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(@NotNull grammerParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(@NotNull grammerParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(@NotNull grammerParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(@NotNull grammerParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull grammerParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull grammerParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(@NotNull grammerParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(@NotNull grammerParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(@NotNull grammerParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(@NotNull grammerParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(@NotNull grammerParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(@NotNull grammerParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(@NotNull grammerParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(@NotNull grammerParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(@NotNull grammerParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(@NotNull grammerParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(@NotNull grammerParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(@NotNull grammerParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(@NotNull grammerParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(@NotNull grammerParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(@NotNull grammerParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(@NotNull grammerParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(@NotNull grammerParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(@NotNull grammerParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(@NotNull grammerParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(@NotNull grammerParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(@NotNull grammerParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(@NotNull grammerParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(@NotNull grammerParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(@NotNull grammerParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(@NotNull grammerParser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(@NotNull grammerParser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(@NotNull grammerParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(@NotNull grammerParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(@NotNull grammerParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(@NotNull grammerParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(@NotNull grammerParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(@NotNull grammerParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(@NotNull grammerParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(@NotNull grammerParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(@NotNull grammerParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(@NotNull grammerParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(@NotNull grammerParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(@NotNull grammerParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(@NotNull grammerParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(@NotNull grammerParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(@NotNull grammerParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(@NotNull grammerParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull grammerParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull grammerParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(@NotNull grammerParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(@NotNull grammerParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(@NotNull grammerParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(@NotNull grammerParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(@NotNull grammerParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(@NotNull grammerParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(@NotNull grammerParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(@NotNull grammerParser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(@NotNull grammerParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(@NotNull grammerParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(@NotNull grammerParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(@NotNull grammerParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(@NotNull grammerParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(@NotNull grammerParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(@NotNull grammerParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(@NotNull grammerParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(@NotNull grammerParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(@NotNull grammerParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(@NotNull grammerParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(@NotNull grammerParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(@NotNull grammerParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(@NotNull grammerParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(@NotNull grammerParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(@NotNull grammerParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(@NotNull grammerParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(@NotNull grammerParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(@NotNull grammerParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(@NotNull grammerParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(@NotNull grammerParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(@NotNull grammerParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(@NotNull grammerParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(@NotNull grammerParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull grammerParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull grammerParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(@NotNull grammerParser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(@NotNull grammerParser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(@NotNull grammerParser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(@NotNull grammerParser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(@NotNull grammerParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(@NotNull grammerParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(@NotNull grammerParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(@NotNull grammerParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(@NotNull grammerParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(@NotNull grammerParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull grammerParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull grammerParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(@NotNull grammerParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(@NotNull grammerParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(@NotNull grammerParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(@NotNull grammerParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(@NotNull grammerParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(@NotNull grammerParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(@NotNull grammerParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(@NotNull grammerParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(@NotNull grammerParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(@NotNull grammerParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(@NotNull grammerParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(@NotNull grammerParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(@NotNull grammerParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(@NotNull grammerParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull grammerParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull grammerParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(@NotNull grammerParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(@NotNull grammerParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(@NotNull grammerParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(@NotNull grammerParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull grammerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull grammerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull grammerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull grammerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull grammerParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull grammerParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(@NotNull grammerParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(@NotNull grammerParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull grammerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull grammerParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(@NotNull grammerParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(@NotNull grammerParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(@NotNull grammerParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(@NotNull grammerParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(@NotNull grammerParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(@NotNull grammerParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(@NotNull grammerParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(@NotNull grammerParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(@NotNull grammerParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(@NotNull grammerParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(@NotNull grammerParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(@NotNull grammerParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(@NotNull grammerParser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(@NotNull grammerParser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(@NotNull grammerParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(@NotNull grammerParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(@NotNull grammerParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(@NotNull grammerParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(@NotNull grammerParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(@NotNull grammerParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(@NotNull grammerParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(@NotNull grammerParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(@NotNull grammerParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(@NotNull grammerParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(@NotNull grammerParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(@NotNull grammerParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(@NotNull grammerParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(@NotNull grammerParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(@NotNull grammerParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(@NotNull grammerParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(@NotNull grammerParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(@NotNull grammerParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(@NotNull grammerParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(@NotNull grammerParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(@NotNull grammerParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(@NotNull grammerParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(@NotNull grammerParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(@NotNull grammerParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(@NotNull grammerParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(@NotNull grammerParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(@NotNull grammerParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(@NotNull grammerParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull grammerParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull grammerParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull grammerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull grammerParser.StmtContext ctx);
}