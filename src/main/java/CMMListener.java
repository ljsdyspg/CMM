// Generated from G:/JavaProject/CMM/src\CMM.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMParser}.
 */
public interface CMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CMMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CMMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CMMParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CMMParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(CMMParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(CMMParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CMMParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CMMParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(CMMParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(CMMParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void enterDecl_assign(CMMParser.Decl_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void exitDecl_assign(CMMParser.Decl_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_S(CMMParser.I_SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_S(CMMParser.I_SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_SB(CMMParser.I_SBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_SB(CMMParser.I_SBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_S_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_S_E_S(CMMParser.I_S_E_SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_S_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_S_E_S(CMMParser.I_S_E_SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_S_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_S_E_SB(CMMParser.I_S_E_SBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_S_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_S_E_SB(CMMParser.I_S_E_SBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_SB_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_SB_E_S(CMMParser.I_SB_E_SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_SB_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_SB_E_S(CMMParser.I_SB_E_SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_SB_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_SB_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CMMParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CMMParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(CMMParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(CMMParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(CMMParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(CMMParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(CMMParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(CMMParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(CMMParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(CMMParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CMMParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CMMParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(CMMParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(CMMParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(CMMParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(CMMParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CMMParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CMMParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(CMMParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(CMMParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(CMMParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(CMMParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(CMMParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(CMMParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddMinExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddMinExpr(CMMParser.AddMinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddMinExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddMinExpr(CMMParser.AddMinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(CMMParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(CMMParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(CMMParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(CMMParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpr(CMMParser.ParenthesesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpr(CMMParser.ParenthesesExprContext ctx);
}