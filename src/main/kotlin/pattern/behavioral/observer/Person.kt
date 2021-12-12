package pattern.behavioral.observer

class Person : Listener {

    override fun update() {
        println("$this: Wow~")
    }
}
