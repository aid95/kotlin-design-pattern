package pattern.behavioral.iterator

class BagIterator constructor(private val items: Array<Item>) : Iterator<Item> {

    private var count = 0

    override fun hasNext(): Boolean = count < items.size

    override fun next(): Item = items[count++]
}
