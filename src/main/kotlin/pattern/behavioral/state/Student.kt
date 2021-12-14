package pattern.behavioral.state

class Student(private val name: String) {

    private val courses = HashSet<Course>()

    fun addCourse(course: Course) {
        courses.add(course)
    }

    fun myCourseNum(): Int = courses.size

    fun isAvailable(course: Course): Boolean = courses.contains(course)
}
