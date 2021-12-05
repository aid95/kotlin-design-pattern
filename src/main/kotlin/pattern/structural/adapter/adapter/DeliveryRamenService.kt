package pattern.structural.adapter.adapter

import pattern.structural.adapter.external.WoowahanDeliveryExternalAPI
import pattern.structural.adapter.service.RamenService

class DeliveryRamenService constructor(private val deliveryRamenService: WoowahanDeliveryExternalAPI) :
    RamenService {

    override fun serveRamen() {
        deliveryRamenService.complete()
    }
}
