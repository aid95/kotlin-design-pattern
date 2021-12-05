package pattern.structural.bridge.connect

import pattern.structural.bridge.device.Device

class Bluetooth constructor(device: Device) : Connect(device) {

    override fun connect() {
        print("Bluetooth >> ")
        device.connectSignal()
    }

    override fun disconnect() {
        print("Bluetooth >> ")
        device.disconnectSignal()
    }
}
