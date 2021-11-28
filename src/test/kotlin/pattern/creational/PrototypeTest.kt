package pattern.creational

import pattern.creational.prototype.StrawberryCake
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

class PrototypeTest {

    lateinit var obj1: StrawberryCake
    lateinit var obj2: StrawberryCake

    @BeforeTest()
    fun setUp() {
        obj1 = StrawberryCake()
        obj2 = obj1.clone() as StrawberryCake
    }

    @Test
    fun testIdenticalObjects() {
        assertNotSame(obj1, obj2)
    }

    @Test
    fun testEqualityObjects() {
        assertEquals(obj1.ProductId, obj2.ProductId)
        assertEquals(obj1.calorie, obj2.calorie)
    }
}
