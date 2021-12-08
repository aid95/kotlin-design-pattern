package pattern.behavioral.chainOfResponsibility

interface UserRepository {

    fun existsUser(id: Int): Boolean
}
