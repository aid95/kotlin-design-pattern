package pattern.behavioral

import pattern.behavioral.interpreter.PostfixCalc
import kotlin.test.Test
import kotlin.test.assertEquals

class InterpreterTest {

    @Test
    fun testPostfixCalc() {
        val postfixExpression = "xyz+-"
        val context = mapOf('x' to 1, 'y' to 3, 'z' to 4)

        val result = PostfixCalc.calc(postfixExpression, context)

        assertEquals(-6, result)
    }
}
