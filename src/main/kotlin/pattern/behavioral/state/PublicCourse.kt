package pattern.behavioral.state

class PublicCourse(private val course: Course) : State {

    override fun addStudent(student: Student) {
        course.students.add(student)
    }

    override fun addReview(student: Student, review: String) {
        if (!student.isAvailable(course)) {
            throw UnsupportedOperationException("수강하지 않은 학생은 리뷰를 작성할 수 없습니다.")
        }
        course.reviews.add(Pair(student, review))
    }
}
