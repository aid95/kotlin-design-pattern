package pattern.behavioral.chainOfResponsibility

class OrderMiddleware : Middleware() {

    override fun check(orderRequest: OrderRequest): Boolean {
        if (3000 <= orderRequest.price) {
            return checkNext(orderRequest)
        }
        return false
    }
}
