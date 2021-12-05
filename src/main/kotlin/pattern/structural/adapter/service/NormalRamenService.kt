package pattern.structural.adapter.service

class NormalRamenService : RamenService {

    override fun serveRamen() {
        println("Yummy~!")
    }
}
