package pattern.behavioral.command.orderCommand

import pattern.behavioral.command.Chef
import pattern.behavioral.command.Command

class JapaneseFoodCommand constructor(private val chef: Chef) : Command {

    override fun execute() {
        chef.cookJapaneseFood()
    }
}
