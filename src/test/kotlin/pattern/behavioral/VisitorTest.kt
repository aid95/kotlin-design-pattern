package pattern.behavioral

import org.junit.Test
import pattern.behavioral.visitor.DisneyParty
import pattern.behavioral.visitor.Eric
import pattern.behavioral.visitor.Mermaid
import pattern.behavioral.visitor.SnowWhite

class VisitorTest {

    @Test(expected = UnsupportedOperationException::class)
    fun testEnterCharacters() {
        val mermaid = Mermaid()
        val snowWhite = SnowWhite()
        val eric = Eric()
        val disneyParty = DisneyParty()

        disneyParty.accept(mermaid)
        disneyParty.accept(snowWhite)
        disneyParty.accept(eric)
    }
}
