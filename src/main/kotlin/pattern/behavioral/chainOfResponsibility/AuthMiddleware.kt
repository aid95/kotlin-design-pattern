package pattern.behavioral.chainOfResponsibility

class AuthMiddleware constructor(private val userRepository: UserRepository) : Middleware() {

    override fun check(orderRequest: OrderRequest): Boolean {
        if (validUser(orderRequest.userId)) {
            return checkNext(orderRequest)
        }
        return false
    }

    private fun validUser(id: Int) = userRepository.existsUser(id)
}
