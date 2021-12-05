package pattern.structural

import pattern.structural.bridge.connect.Bluetooth
import pattern.structural.bridge.connect.Receiver
import pattern.structural.bridge.device.Headphone
import pattern.structural.bridge.device.Speaker
import kotlin.test.Test

class BridgeTest {

    @Test
    fun testBluetoothSpeaker() {
        val bluetoothSpeaker = Bluetooth(Speaker())

        bluetoothSpeaker.connect()
        bluetoothSpeaker.disconnect()
    }

    @Test
    fun testReceiverHeadphone() {
        val receiverHeadphone = Receiver(Headphone())

        receiverHeadphone.connect()
        receiverHeadphone.disconnect()
    }
}
