package pattern.behavioral.interpreter

object PostfixCalc {
    fun calc(postfixExpression: String, context: Map<Char, Int>): Int =
        DSLParser().parse(postfixExpression).interpret(context)
}
