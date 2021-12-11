package pattern.behavioral

import pattern.behavioral.command.Chef
import pattern.behavioral.command.Command
import pattern.behavioral.command.orderCommand.ChineseFoodCommand
import pattern.behavioral.command.orderCommand.JapaneseFoodCommand
import pattern.behavioral.command.orderCommand.KoreanFoodCommand
import kotlin.test.Test
import kotlin.test.assertEquals

class CommandTest {

    @Test
    fun testFiveStarChef() {
        val chef = Chef("Byeongju, Shin", 19)

        chef.cookKoreanFood()
        chef.cookChineseFood()
        chef.cookJapaneseFood()

        assertEquals(1, chef.expKoreanFood)
        assertEquals(1, chef.expChineseFood)
        assertEquals(1, chef.expJapaneseFood)
    }

    @Test
    fun testCommandOrder() {
        val chef = Chef("Master chef", 1)

        val commands =
            arrayOf(KoreanFoodCommand(chef), ChineseFoodCommand(chef), JapaneseFoodCommand(chef))
        commands.map(Command::execute)

        assertEquals(3, chef.totalExp)
    }
}
