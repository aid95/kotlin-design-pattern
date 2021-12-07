package pattern.structural.proxy

class DefaultMeal : Meal {

    override fun eat(): Calorie {
        return 300.0
    }
}
