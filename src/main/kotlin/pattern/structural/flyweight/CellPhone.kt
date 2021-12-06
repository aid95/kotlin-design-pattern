package pattern.structural.flyweight

import pattern.structural.flyweight.factory.MobileCarrier

data class CellPhone constructor(
    val phoneNumber: String,
    val mobileCarrier: MobileCarrier
)
