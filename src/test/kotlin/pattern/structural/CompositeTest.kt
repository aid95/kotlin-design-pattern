package pattern.structural

import pattern.structural.composite.ComboMenu
import pattern.structural.composite.Menu
import pattern.structural.composite.Product
import kotlin.test.Test
import kotlin.test.assertEquals

class CompositeTest {

    @Test
    fun testOrderLinePrice() {
        // Given
        val orderLine = arrayOf(
            Menu("Ice americano", 10),
            ComboMenu(
                "Diet foods",
                Menu("Monterey Ranch Crispy Chicken Sandwich", 100),
                Menu("Dave’s Hot ‘N Juicy Triple", 200),
                Menu("Pepsi 1.5L", 10)
            )
        )

        // When
        val result = orderLine.asSequence().map(Product::price).sum()

        // Then
        assertEquals(320, result)
    }
}
