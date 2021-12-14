package pattern.behavioral.state


class Course constructor(
    private val title: String,
) {

    enum class CourseState {
        DRAFT, PUBLIC
    }

    private var state: State = DraftCourse(this)

    val students = HashSet<Student>()
    val reviews = HashSet<Pair<Student, String>>()

    fun changeState(state: CourseState) {
        this.state = when (state) {
            CourseState.DRAFT -> DraftCourse(this)
            CourseState.PUBLIC -> PublicCourse(this)
        }
    }

    fun addStudent(student: Student) {
        this.state.addStudent(student)
    }

    fun addReview(student: Student, review: String) {
        this.state.addReview(student, review)
    }

    override fun toString(): String {
        return title
    }
}
