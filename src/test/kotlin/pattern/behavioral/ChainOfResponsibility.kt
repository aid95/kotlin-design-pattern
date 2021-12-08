package pattern.behavioral

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import pattern.behavioral.chainOfResponsibility.*
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ChainOfResponsibility {

    lateinit var mockUserRepository: UserRepository
    lateinit var middleware: Middleware

    @BeforeTest
    fun init() {
        mockUserRepository = mockk()

        val authMiddleware = AuthMiddleware(mockUserRepository)
        authMiddleware.and(OrderMiddleware())
        middleware = authMiddleware
    }

    @Test
    fun testOrderChaining() {
        // Given
        every { mockUserRepository.existsUser(1) } returns true
        val order = OrderRequest(1, "CK-0001", 10000)

        // When
        val result = middleware.check(order)

        // Then
        verify { mockUserRepository.existsUser(1) }
        assertTrue(result)
    }

    @Test
    fun testInvalidUserOrder() {
        // Given
        every { mockUserRepository.existsUser(2) } returns false
        val order = OrderRequest(2, "CK-0001", 10000)

        // When
        val result = middleware.check(order)

        // Then
        verify { mockUserRepository.existsUser(2) }
        assertFalse(result)
    }
}
