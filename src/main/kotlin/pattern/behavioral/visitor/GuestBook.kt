package pattern.behavioral.visitor

interface GuestBook {
    fun accept(snowWhite: SnowWhite)
    fun accept(mermaid: Mermaid)
    fun accept(eric: Eric)
}
