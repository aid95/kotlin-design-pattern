package pattern.behavioral

import pattern.behavioral.observer.KakaoChatRoom
import pattern.behavioral.observer.Person
import kotlin.test.Test

class ObserverTest {

    @Test
    fun testRadioCentral() {
        val kakaoChatRoom = KakaoChatRoom()
        val javaProgrammer = Person()
        val KotlinProgrammer = Person()
        kakaoChatRoom.subscribe("java", javaProgrammer)
        kakaoChatRoom.subscribe("kotlin", KotlinProgrammer)

        kakaoChatRoom.notify("java")
        kakaoChatRoom.notify("kotlin")
    }
}
