package pattern.behavioral.interpreter.expression

interface Expression {
    fun interpret(context: Map<Char, Int>): Int
}
