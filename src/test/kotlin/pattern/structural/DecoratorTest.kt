package pattern.structural

import pattern.structural.decorator.EmptyCoupon
import pattern.structural.decorator.HalfDiscountCoupon
import kotlin.test.Test
import kotlin.test.assertEquals

class DecoratorTest {

    @Test
    fun testApplyHalfCoupon() {
        // Given
        val price = 100.0
        val coupons = HalfDiscountCoupon(HalfDiscountCoupon(EmptyCoupon()))

        // When
        val result = coupons.calculateFee(price)

        // Then
        assertEquals(25.0, result)
    }
}
