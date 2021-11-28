package pattern.creational.prototype

class StrawberryCake constructor(val ProductId: String = "Unknown", var calorie: Double = 0.0) :
    Cloneable {

    public override fun clone(): Any {
        return super.clone()
    }
}
