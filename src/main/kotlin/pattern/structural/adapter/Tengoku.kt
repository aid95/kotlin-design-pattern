package pattern.structural.adapter

import pattern.structural.adapter.service.RamenService

// https://m.place.naver.com/restaurant/33461205/home
class Tengoku constructor(private val ramenService: RamenService) {

    fun cook() {
        ramenService.serveRamen()
    }
}
