package pattern.structural.decorator

open class CouponDecorator constructor(private val coupon: Coupon) : Coupon {

    override fun calculateFee(amount: Double): Double {
        return coupon.calculateFee(amount)
    }
}
