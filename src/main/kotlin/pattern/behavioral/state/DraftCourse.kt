package pattern.behavioral.state

class DraftCourse constructor(private val course: Course) : State {

    override fun addStudent(student: Student) {
        throw UnsupportedOperationException("아직 개설되지 않은 강의에 수강생을 추가할 수 없습니다.")
    }

    override fun addReview(student: Student, review: String) {
        throw UnsupportedOperationException("아직 개설되지 않은 강의에 수강생을 추가할 수 없습니다.")
    }
}
