package pattern.behavioral.templateMethod

abstract class MegaStore constructor(private val label: String) {

    fun makeSomething(): String {
        return "$label ${make()}"
    }

    protected abstract fun make(): String
}
