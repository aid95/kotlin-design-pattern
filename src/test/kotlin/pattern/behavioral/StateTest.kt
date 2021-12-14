package pattern.behavioral

import pattern.behavioral.state.Course
import pattern.behavioral.state.Student
import kotlin.test.Test
import kotlin.test.assertEquals

class StateTest {

    @Test
    fun testCreateStudent() {
        val student = Student("bitcake0")

        student.addCourse(Course("Kotlin in Action"))

        assertEquals(1, student.myCourseNum())
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testDefaultStateCourse() {
        val course = Course("Hacker's secret")

        course.addStudent(Student("123"))
    }

    @Test
    fun testPublicCourse() {
        val student = Student("bitcake0")
        val course = Course("Modern Javascript")

        course.changeState(Course.CourseState.PUBLIC)
        student.addCourse(course)

        course.addReview(student, "123")

        assertEquals(1, course.reviews.size)
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testUnSubscribeStudent() {
        val student = Student("123")
        val course = Course("123")
        course.changeState(Course.CourseState.PUBLIC)

        course.addReview(student, "asdfasdf")
    }
}
