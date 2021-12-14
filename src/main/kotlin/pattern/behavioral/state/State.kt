package pattern.behavioral.state

interface State {
    fun addStudent(student: Student)
    fun addReview(student: Student, review: String)
}
