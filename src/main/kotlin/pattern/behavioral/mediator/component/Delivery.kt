package pattern.behavioral.mediator.component

import pattern.behavioral.mediator.WoowahanMediator

class Delivery constructor(mediator: WoowahanMediator? = null) : Component(mediator) {

    private val deliveryHistory = ArrayList<String>()

    fun startShipping(orderId: Int, deliveryAddress: String) {
        deliveryHistory.add("$orderId-$deliveryAddress")
    }

    fun completeShipping(amount: Int) {
        mediator?.completeDeliveryNotify(amount);
    }
}
