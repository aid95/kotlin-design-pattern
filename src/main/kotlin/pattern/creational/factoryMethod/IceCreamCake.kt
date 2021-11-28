package pattern.creational.factoryMethod

class IceCreamCake : Cake {

    override val productId: String
        get() = "CK-00002"

    override val calorie: Double
        get() = 100000000000000000.0

    companion object : CakeFactory {

        override fun invoke(): Cake = IceCreamCake()
    }
}
