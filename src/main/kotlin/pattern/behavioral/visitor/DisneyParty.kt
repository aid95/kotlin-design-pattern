package pattern.behavioral.visitor

class DisneyParty : GuestBook {

    val guests = HashSet<Character>()

    override fun accept(snowWhite: SnowWhite) {
        guests.add(snowWhite)
    }

    override fun accept(mermaid: Mermaid) {
        guests.add(mermaid)
    }

    override fun accept(eric: Eric) {
        throw UnsupportedOperationException()
    }
}
