package pattern.structural

import pattern.structural.flyweight.CellPhone
import pattern.structural.flyweight.factory.MobileCarrierFactory
import kotlin.test.Test
import kotlin.test.assertSame

class FlyweightTest {

    @Test
    fun testCreateCellphone() {
        val cellPhone1 = CellPhone("010-1234-1234", MobileCarrierFactory.of("KT"))
        val cellPhone2 = CellPhone("010-1234-1234", MobileCarrierFactory.of("KT"))

        assertSame(cellPhone1.mobileCarrier, cellPhone2.mobileCarrier)
    }
}
