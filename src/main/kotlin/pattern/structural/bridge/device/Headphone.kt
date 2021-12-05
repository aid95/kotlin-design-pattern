package pattern.structural.bridge.device

class Headphone : Device {

    override fun connectSignal() {
        println("Connect headphone")
    }

    override fun disconnectSignal() {
        println("Disconnect headphone")
    }
}
