package pattern.behavioral

import org.junit.Test
import pattern.behavioral.templateMethod.ChickenStore
import kotlin.test.assertEquals

class TemplateMethodTest {

    @Test
    fun testMakeSomeThing() {
        val chickenStore = ChickenStore("BBQ")

        val result = chickenStore.makeSomething()

        assertEquals("BBQ Chicken", result)
    }
}
