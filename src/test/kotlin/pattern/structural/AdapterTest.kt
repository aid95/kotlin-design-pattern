package pattern.structural

import pattern.structural.adapter.Tengoku
import pattern.structural.adapter.adapter.DeliveryRamenService
import pattern.structural.adapter.external.WoowahanDeliveryExternalAPI
import pattern.structural.adapter.service.NormalRamenService
import kotlin.test.Test

class AdapterTest {

    @Test
    fun testNormalRamenService() {
        val tengoku = Tengoku(NormalRamenService())
        tengoku.cook()
    }

    @Test
    fun testDeliveryRamenAPIService() {
        val tengoku = Tengoku(DeliveryRamenService(WoowahanDeliveryExternalAPI()))
        tengoku.cook()
    }
}
