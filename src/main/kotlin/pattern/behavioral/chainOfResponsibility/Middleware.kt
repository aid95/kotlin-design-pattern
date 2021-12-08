package pattern.behavioral.chainOfResponsibility

abstract class Middleware {

    private var next: Middleware? = null

    abstract fun check(orderRequest: OrderRequest): Boolean

    protected fun checkNext(orderRequest: OrderRequest): Boolean = next?.check(orderRequest) ?: true

    fun and(next: Middleware): Middleware {
        this.next = next
        return next
    }
}
