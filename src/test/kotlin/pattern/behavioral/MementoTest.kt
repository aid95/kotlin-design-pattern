package pattern.behavioral

import pattern.behavioral.memento.Camera
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertEquals

class MementoTest {

    @Test
    fun testTakePicture() {
        // Given
        val timeMachineCamera = Camera("Seoul", LocalDateTime.now(), listOf("a", "b", "c"))
        val savePointPicture = timeMachineCamera.click()

        // When
        timeMachineCamera.address = "Tokyo"
        timeMachineCamera.load(savePointPicture)

        // Then
        assertEquals("Seoul", timeMachineCamera.address)
    }
}
