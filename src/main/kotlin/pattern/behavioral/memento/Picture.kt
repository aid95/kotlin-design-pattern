package pattern.behavioral.memento

import java.time.LocalDateTime

data class Picture(
    val date: LocalDateTime,
    val address: String,
    val people: List<String>
)
