package pattern.behavioral

import pattern.behavioral.mediator.WoowahanMediator
import pattern.behavioral.mediator.component.Delivery
import pattern.behavioral.mediator.component.Shop
import kotlin.test.Test
import kotlin.test.assertEquals

class MediatorTest {

    @Test
    fun test() {
        val shop = Shop()
        val delivery = Delivery()
        WoowahanMediator(shop, delivery)

        shop.completeOrder(1, "Seoul")
        delivery.completeShipping(1000);

        assertEquals(1000, shop.amount)
    }
}
