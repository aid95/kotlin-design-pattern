package pattern.creational

import pattern.creational.builder.CustomCake
import kotlin.test.Test
import kotlin.test.assertEquals

class BuilderTest {

    @Test
    fun testOrderCustomCake() {
        val customCake = CustomCake.Builder().productId("CK-00001").calorie(10.0).build()

        assertEquals("CK-00001", customCake.productId)
        assertEquals(10.0, customCake.calorie)
    }

    @Test
    fun testDefaultCustomCake() {
        val defaultCustomCake = CustomCake.Builder().build()

        assertEquals("Unknown", defaultCustomCake.productId)
        assertEquals(0.0, defaultCustomCake.calorie)
    }
}
