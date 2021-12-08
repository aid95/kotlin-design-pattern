package pattern.behavioral.command.orderCommand

import pattern.behavioral.command.Chef
import pattern.behavioral.command.Command

class KoreanFoodCommand constructor(private val chef: Chef) : Command {

    override fun execute() {
        chef.cookKoreanFood()
    }
}
