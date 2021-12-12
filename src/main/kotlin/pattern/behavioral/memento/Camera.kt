package pattern.behavioral.memento

import java.time.LocalDateTime

class Camera constructor(
    var address: String,
    var date: LocalDateTime,
    var people: List<String>
) {

    fun click(): Picture = Picture(date, address, people)

    fun load(picture: Picture) {
        this.address = picture.address
        this.date = picture.date
        this.people = picture.people
    }
}
