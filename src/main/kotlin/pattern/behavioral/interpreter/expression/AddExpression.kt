package pattern.behavioral.interpreter.expression

class AddExpression constructor(
    private val leftExpression: Expression,
    private val rightException: Expression
) : Expression {

    override fun interpret(context: Map<Char, Int>): Int {
        return leftExpression.interpret(context) + rightException.interpret(context)
    }
}
