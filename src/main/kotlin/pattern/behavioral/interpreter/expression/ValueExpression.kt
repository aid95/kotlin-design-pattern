package pattern.behavioral.interpreter.expression

class ValueExpression constructor(private val id: Char) : Expression {

    override fun interpret(context: Map<Char, Int>): Int = context[id]!!
}
