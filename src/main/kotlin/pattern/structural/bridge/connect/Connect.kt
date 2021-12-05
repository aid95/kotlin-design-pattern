package pattern.structural.bridge.connect

import pattern.structural.bridge.device.Device

abstract class Connect constructor(protected val device: Device) {

    abstract fun connect()
    abstract fun disconnect()
}
