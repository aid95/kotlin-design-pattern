package pattern.structural.composite

class ComboMenu constructor(productName: String, vararg menus: Product) : Product {

    private val productName: String
    private val menus: Array<out Product>

    init {
        this.productName = productName
        this.menus = menus
    }

    override val name: String
        get() = productName
    override val price: Int
        get() = menus.asSequence().map(Product::price).sum()
}
