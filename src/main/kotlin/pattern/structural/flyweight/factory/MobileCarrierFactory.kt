package pattern.structural.flyweight.factory

object MobileCarrierFactory {

    private val cache: HashMap<String, MobileCarrier> = HashMap()

    // TODO 통신사 식별을 위한 name 을 enum 또는 sealed 타입으로 변경하기
    fun of(name: String): MobileCarrier = cache.getOrPut(name) { MobileCarrier(name) }
}
