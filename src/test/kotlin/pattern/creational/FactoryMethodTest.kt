package pattern.creational

import pattern.creational.factoryMethod.CakeFactory
import pattern.creational.factoryMethod.CheeseCake
import pattern.creational.factoryMethod.IceCreamCake
import kotlin.test.Test
import kotlin.test.assertEquals

class FactoryMethodTest {

    @Test
    fun orderCheeseCake() {
        val cheeseCake = makeCake(CheeseCake)

        assertEquals("CK-00001", cheeseCake.productId)
    }

    @Test
    fun orderIceCreamCake() {
        val iceCreamCake = makeCake(IceCreamCake)

        assertEquals("CK-00002", iceCreamCake.productId)
    }

    private fun makeCake(factory: CakeFactory) = factory()
}
