package pattern.structural.bridge.connect

import pattern.structural.bridge.device.Device

class Receiver constructor(device: Device) : Connect(device) {

    override fun connect() {
        print("Receiver >> ")
        device.connectSignal()
    }

    override fun disconnect() {
        print("Receiver >> ")
        device.disconnectSignal()
    }
}
