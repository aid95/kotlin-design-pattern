package pattern.structural.proxy

import java.time.LocalTime

class Dinner constructor(private var meal: DefaultMeal? = null) : Meal {

    // TODO LocalTime mock 을 위한 리팩토링
    override fun eat(): Calorie {
        if (20 <= LocalTime.now().hour) {
            return 0.0
        }
        return (meal ?: DefaultMeal().also { meal = it }).eat()
    }
}
