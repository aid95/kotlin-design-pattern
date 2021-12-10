package pattern.behavioral.interpreter

import pattern.behavioral.interpreter.expression.AddExpression
import pattern.behavioral.interpreter.expression.Expression
import pattern.behavioral.interpreter.expression.SubExpression
import pattern.behavioral.interpreter.expression.ValueExpression
import java.util.*

class DSLParser {

    private val stack = Stack<Expression>()

    fun parse(expression: String): Expression {
        for (token in expression) {
            stack.push(convertExpression(token))
        }
        return stack.pop()
    }

    private fun convertExpression(token: Char): Expression = when (token) {
        '+' -> {
            require(isExistTwoOperand()) {}
            AddExpression(stack.pop(), stack.pop())
        }
        '-' -> {
            require(isExistTwoOperand()) {}
            val right = stack.pop()
            val left = stack.pop()
            SubExpression(left, right)
        }
        else -> ValueExpression(token)
    }

    private fun isExistTwoOperand(): Boolean = !stack.isEmpty() && stack.size >= 2
}
