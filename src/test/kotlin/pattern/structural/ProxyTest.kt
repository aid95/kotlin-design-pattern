package pattern.structural

import pattern.structural.proxy.Dinner
import kotlin.test.Test
import kotlin.test.assertEquals

class ProxyTest {

    @Test
    fun testDefaultDinnerProxy() {
        // Given
        val dinner = Dinner()

        // When
        val result = dinner.eat()

        // Then
        assertEquals(300.0, result)
    }

    @Test
    fun testTooLate() {
    }
}
