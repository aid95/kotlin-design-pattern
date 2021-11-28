package pattern.creational.singleton

class MySingleton private constructor(private val baseScore: Int) {

    fun getBaseScore() = baseScore

    companion object : SingletonHolder<MySingleton, Int>(::MySingleton)
}
