package pattern.creational.factoryMethod

class CheeseCake : Cake {

    override val calorie: Double
        get() = 0.0 // If it tastes good then it’s 0 calories ;D

    override val productId: String
        get() = "CK-00001"

    companion object : CakeFactory {

        override fun invoke() = CheeseCake()
    }
}
