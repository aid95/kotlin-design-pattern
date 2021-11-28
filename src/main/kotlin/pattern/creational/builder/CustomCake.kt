package pattern.creational.builder

class CustomCake private constructor(
    val productId: String,
    val calorie: Double,
) {

    data class Builder(
        private var productId: String = "Unknown",
        private var calorie: Double = 0.0,
    ) {
        fun productId(id: String) = apply { this.productId = id }
        fun calorie(calorie: Double) = apply { this.calorie = calorie }
        fun build() = CustomCake(productId, calorie)
    }

    init {
        require(calorie >= 0) { "The calorie must be more than 0 calories" }
    }
}
