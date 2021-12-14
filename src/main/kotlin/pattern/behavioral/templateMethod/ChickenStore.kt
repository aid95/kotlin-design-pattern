package pattern.behavioral.templateMethod

class ChickenStore constructor(label: String) : MegaStore(label) {

    override fun make(): String {
        return "Chicken"
    }
}
