package pattern.behavioral.visitor

class SnowWhite : Character {

    override fun check(guestBook: GuestBook) {
        guestBook.accept(this)
    }
}
