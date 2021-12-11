package pattern.behavioral.mediator.component

import pattern.behavioral.mediator.WoowahanMediator

class Shop constructor(mediator: WoowahanMediator? = null) : Component(mediator) {

    var amount = 0
        private set

    fun completeOrder(orderId: Int, deliveryAddress: String) {
        mediator?.requestDelivery(orderId, deliveryAddress)
    }

    fun pay(amount: Int) {
        this.amount += amount
    }
}
