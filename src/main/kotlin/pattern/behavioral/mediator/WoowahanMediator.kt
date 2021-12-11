package pattern.behavioral.mediator

import pattern.behavioral.mediator.component.Delivery
import pattern.behavioral.mediator.component.Shop

class WoowahanMediator constructor(private val shop: Shop, private val delivery: Delivery) {

    fun requestDelivery(orderId: Int, deliveryAddress: String) {
        delivery.startShipping(orderId, deliveryAddress);
    }

    fun completeDeliveryNotify(amount: Int) {
        shop.pay(amount)
    }

    init {
        shop.changeMediator(this)
        delivery.changeMediator(this)
    }
}
