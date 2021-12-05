package pattern.structural.composite

class Menu constructor(private val productName: String, private val productPrice: Int) : Product {
   
    override val name: String
        get() = productName
    override val price: Int
        get() = productPrice
}
