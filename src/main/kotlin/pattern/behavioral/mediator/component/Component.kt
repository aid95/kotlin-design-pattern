package pattern.behavioral.mediator.component

import pattern.behavioral.mediator.WoowahanMediator

open class Component constructor(protected var mediator: WoowahanMediator? = null) {

    fun changeMediator(mediator: WoowahanMediator) {
        this.mediator = mediator
    }
}
