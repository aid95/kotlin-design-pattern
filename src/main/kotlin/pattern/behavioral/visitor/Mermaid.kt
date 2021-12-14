package pattern.behavioral.visitor

class Mermaid : Character {

    override fun check(guestBook: GuestBook) {
        guestBook.accept(this)
    }
}
