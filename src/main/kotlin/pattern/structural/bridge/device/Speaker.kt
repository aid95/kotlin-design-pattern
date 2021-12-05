package pattern.structural.bridge.device

class Speaker : Device {

    override fun connectSignal() {
        println("Connect speaker")
    }

    override fun disconnectSignal() {
        println("Disconnect speaker")
    }
}
