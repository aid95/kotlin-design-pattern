package pattern.creational

import pattern.creational.singleton.CompanionObjectSingleton
import pattern.creational.singleton.MySingleton
import pattern.creational.singleton.ObjectSingleton
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SingletonTest {

    @Test
    fun alwaysSameInstance() {
        val instance1 = ObjectSingleton
        val instance2 = ObjectSingleton

        assertEquals(instance1, instance2)
    }

    @Test
    fun companionObjectSingleton() {
        val instance1 = CompanionObjectSingleton
        val instance2 = CompanionObjectSingleton

        assertEquals(instance1, instance2)
    }

    @Test
    fun singletonHolder() {
        val instance1 = MySingleton.getInstance(10)
        val instance2 = MySingleton.getInstance(99)

        assertEquals(instance1, instance2)
        assertEquals(instance1.getBaseScore(), instance2.getBaseScore())
    }
}
