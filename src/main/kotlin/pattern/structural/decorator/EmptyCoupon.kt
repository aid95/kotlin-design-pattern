package pattern.structural.decorator

class EmptyCoupon : Coupon {

    override fun calculateFee(amount: Double): Double {
        return amount
    }
}
