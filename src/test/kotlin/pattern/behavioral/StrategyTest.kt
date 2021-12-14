package pattern.behavioral

import pattern.behavioral.strategy.FastEncryptModule
import pattern.behavioral.strategy.SecureTalk
import pattern.behavioral.strategy.StrongEncryptModule
import kotlin.test.Test
import kotlin.test.assertEquals

class StrategyTest {

    @Test
    fun testSendPlainTalk() {
        val sender = SecureTalk(FastEncryptModule())

        val result = sender.sendMessage("Hello")

        assertEquals("Hello", result)
    }

    @Test
    fun testSendEncryptMessage() {
        val sender = SecureTalk(StrongEncryptModule())

        val result = sender.sendMessage("Hello")

        assertEquals("olleH", result)
        assertEquals("Hello", sender.decryptMessage(result))
    }
}
