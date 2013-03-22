// Generated from ./tube/syntactic/Grammar.g4 by ANTLR 4.0

package tube.syntactic;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrammarListener extends ParseTreeListener {
	void enterExpression(GrammarParser.ExpressionContext ctx);
	void exitExpression(GrammarParser.ExpressionContext ctx);

	void enterDeclarator(GrammarParser.DeclaratorContext ctx);
	void exitDeclarator(GrammarParser.DeclaratorContext ctx);

	void enterInitDeclarators(GrammarParser.InitDeclaratorsContext ctx);
	void exitInitDeclarators(GrammarParser.InitDeclaratorsContext ctx);

	void enterExpressionStatement(GrammarParser.ExpressionStatementContext ctx);
	void exitExpressionStatement(GrammarParser.ExpressionStatementContext ctx);

	void enterUnaryExpression(GrammarParser.UnaryExpressionContext ctx);
	void exitUnaryExpression(GrammarParser.UnaryExpressionContext ctx);

	void enterStructOrUnion(GrammarParser.StructOrUnionContext ctx);
	void exitStructOrUnion(GrammarParser.StructOrUnionContext ctx);

	void enterEqualityOperator(GrammarParser.EqualityOperatorContext ctx);
	void exitEqualityOperator(GrammarParser.EqualityOperatorContext ctx);

	void enterShiftOperator(GrammarParser.ShiftOperatorContext ctx);
	void exitShiftOperator(GrammarParser.ShiftOperatorContext ctx);

	void enterPrimaryExpression(GrammarParser.PrimaryExpressionContext ctx);
	void exitPrimaryExpression(GrammarParser.PrimaryExpressionContext ctx);

	void enterInitDeclarator(GrammarParser.InitDeclaratorContext ctx);
	void exitInitDeclarator(GrammarParser.InitDeclaratorContext ctx);

	void enterPlainDeclaration(GrammarParser.PlainDeclarationContext ctx);
	void exitPlainDeclaration(GrammarParser.PlainDeclarationContext ctx);

	void enterShiftExpression(GrammarParser.ShiftExpressionContext ctx);
	void exitShiftExpression(GrammarParser.ShiftExpressionContext ctx);

	void enterParameters(GrammarParser.ParametersContext ctx);
	void exitParameters(GrammarParser.ParametersContext ctx);

	void enterTypedefName(GrammarParser.TypedefNameContext ctx);
	void exitTypedefName(GrammarParser.TypedefNameContext ctx);

	void enterMultiplicativeOperator(GrammarParser.MultiplicativeOperatorContext ctx);
	void exitMultiplicativeOperator(GrammarParser.MultiplicativeOperatorContext ctx);

	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	void exitDeclaration(GrammarParser.DeclarationContext ctx);

	void enterAssignmentExpression(GrammarParser.AssignmentExpressionContext ctx);
	void exitAssignmentExpression(GrammarParser.AssignmentExpressionContext ctx);

	void enterSelectionStatement(GrammarParser.SelectionStatementContext ctx);
	void exitSelectionStatement(GrammarParser.SelectionStatementContext ctx);

	void enterAdditiveExpression(GrammarParser.AdditiveExpressionContext ctx);
	void exitAdditiveExpression(GrammarParser.AdditiveExpressionContext ctx);

	void enterCharacterConstant(GrammarParser.CharacterConstantContext ctx);
	void exitCharacterConstant(GrammarParser.CharacterConstantContext ctx);

	void enterPostfixExpression(GrammarParser.PostfixExpressionContext ctx);
	void exitPostfixExpression(GrammarParser.PostfixExpressionContext ctx);

	void enterStatement(GrammarParser.StatementContext ctx);
	void exitStatement(GrammarParser.StatementContext ctx);

	void enterExclusiveOrExpression(GrammarParser.ExclusiveOrExpressionContext ctx);
	void exitExclusiveOrExpression(GrammarParser.ExclusiveOrExpressionContext ctx);

	void enterUnaryOperator(GrammarParser.UnaryOperatorContext ctx);
	void exitUnaryOperator(GrammarParser.UnaryOperatorContext ctx);

	void enterFunctionDefinition(GrammarParser.FunctionDefinitionContext ctx);
	void exitFunctionDefinition(GrammarParser.FunctionDefinitionContext ctx);

	void enterConstantExpression(GrammarParser.ConstantExpressionContext ctx);
	void exitConstantExpression(GrammarParser.ConstantExpressionContext ctx);

	void enterProgram(GrammarParser.ProgramContext ctx);
	void exitProgram(GrammarParser.ProgramContext ctx);

	void enterIdentifier(GrammarParser.IdentifierContext ctx);
	void exitIdentifier(GrammarParser.IdentifierContext ctx);

	void enterAdditiveOperator(GrammarParser.AdditiveOperatorContext ctx);
	void exitAdditiveOperator(GrammarParser.AdditiveOperatorContext ctx);

	void enterMultiplicativeExpression(GrammarParser.MultiplicativeExpressionContext ctx);
	void exitMultiplicativeExpression(GrammarParser.MultiplicativeExpressionContext ctx);

	void enterAssignmentOperator(GrammarParser.AssignmentOperatorContext ctx);
	void exitAssignmentOperator(GrammarParser.AssignmentOperatorContext ctx);

	void enterTypeSpecifier(GrammarParser.TypeSpecifierContext ctx);
	void exitTypeSpecifier(GrammarParser.TypeSpecifierContext ctx);

	void enterAndExpression(GrammarParser.AndExpressionContext ctx);
	void exitAndExpression(GrammarParser.AndExpressionContext ctx);

	void enterIntegerConstant(GrammarParser.IntegerConstantContext ctx);
	void exitIntegerConstant(GrammarParser.IntegerConstantContext ctx);

	void enterDeclarators(GrammarParser.DeclaratorsContext ctx);
	void exitDeclarators(GrammarParser.DeclaratorsContext ctx);

	void enterRelationalExpression(GrammarParser.RelationalExpressionContext ctx);
	void exitRelationalExpression(GrammarParser.RelationalExpressionContext ctx);

	void enterIterationStatement(GrammarParser.IterationStatementContext ctx);
	void exitIterationStatement(GrammarParser.IterationStatementContext ctx);

	void enterConstant(GrammarParser.ConstantContext ctx);
	void exitConstant(GrammarParser.ConstantContext ctx);

	void enterCompoundStatement(GrammarParser.CompoundStatementContext ctx);
	void exitCompoundStatement(GrammarParser.CompoundStatementContext ctx);

	void enterJumpStatement(GrammarParser.JumpStatementContext ctx);
	void exitJumpStatement(GrammarParser.JumpStatementContext ctx);

	void enterRelationalOperator(GrammarParser.RelationalOperatorContext ctx);
	void exitRelationalOperator(GrammarParser.RelationalOperatorContext ctx);

	void enterLogicalAndExpression(GrammarParser.LogicalAndExpressionContext ctx);
	void exitLogicalAndExpression(GrammarParser.LogicalAndExpressionContext ctx);

	void enterLogicalOrExpression(GrammarParser.LogicalOrExpressionContext ctx);
	void exitLogicalOrExpression(GrammarParser.LogicalOrExpressionContext ctx);

	void enterInclusiveOrExpression(GrammarParser.InclusiveOrExpressionContext ctx);
	void exitInclusiveOrExpression(GrammarParser.InclusiveOrExpressionContext ctx);

	void enterTypeName(GrammarParser.TypeNameContext ctx);
	void exitTypeName(GrammarParser.TypeNameContext ctx);

	void enterPostfix(GrammarParser.PostfixContext ctx);
	void exitPostfix(GrammarParser.PostfixContext ctx);

	void enterEqualityExpression(GrammarParser.EqualityExpressionContext ctx);
	void exitEqualityExpression(GrammarParser.EqualityExpressionContext ctx);

	void enterArguments(GrammarParser.ArgumentsContext ctx);
	void exitArguments(GrammarParser.ArgumentsContext ctx);

	void enterCastExpression(GrammarParser.CastExpressionContext ctx);
	void exitCastExpression(GrammarParser.CastExpressionContext ctx);

	void enterString(GrammarParser.StringContext ctx);
	void exitString(GrammarParser.StringContext ctx);

	void enterPlainDeclarator(GrammarParser.PlainDeclaratorContext ctx);
	void exitPlainDeclarator(GrammarParser.PlainDeclaratorContext ctx);

	void enterInitializer(GrammarParser.InitializerContext ctx);
	void exitInitializer(GrammarParser.InitializerContext ctx);
}