package pattern.behavioral.iterator

class Bag constructor(private val items: Array<Item>) {

    fun iterator(): Iterator<Item> = BagIterator(items)
}
