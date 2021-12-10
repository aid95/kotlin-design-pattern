package pattern.behavioral

import pattern.behavioral.iterator.Bag
import pattern.behavioral.iterator.Item
import kotlin.test.Test
import kotlin.test.assertEquals

class IteratorTest {

    @Test
    fun testPrintBagItems() {
        val bag = Bag(arrayOf(Item("Macbook 2021"), Item("IPhone")))

        var result = ""
        for (item in bag.iterator()) {
            result += item
        }
       
        assertEquals("Macbook 2021IPhone", result)
    }
}
