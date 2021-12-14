package pattern.behavioral.visitor

class Eric : Character {

    override fun check(guestBook: GuestBook) {
        guestBook.accept(this)
    }
}
