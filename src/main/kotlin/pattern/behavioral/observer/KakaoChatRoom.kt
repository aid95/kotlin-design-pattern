package pattern.behavioral.observer

import java.util.*

class KakaoChatRoom {

    private val subscribers: MutableMap<String, Vector<Listener>> = HashMap()

    fun subscribe(keyword: String, user: Listener) {
        (this.subscribers[keyword] ?: Vector<Listener>().also {
            this.subscribers[keyword] = it
        }).add(user)
    }

    fun unsubscribe(keyword: String, user: Listener) {
        this.subscribers[keyword]?.remove(user)
    }

    fun notify(keyword: String) {
        this.subscribers[keyword]?.forEach { it.update() }
    }
}
