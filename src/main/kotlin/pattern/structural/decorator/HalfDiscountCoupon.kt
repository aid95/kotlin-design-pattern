package pattern.structural.decorator

class HalfDiscountCoupon constructor(coupon: Coupon) : CouponDecorator(coupon) {

    override fun calculateFee(amount: Double): Double {
        return super.calculateFee(amount * 0.5)
    }
}
