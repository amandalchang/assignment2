interface Queue<T> {
    /**
     * Add [data] to the end of the queue.
     */
    fun enqueue(data: T)
    /**
     * Remove the element at the front of the queue.  If the queue is empty, it remains unchanged.
     * @return the value at the front of the queue or nil if none exists
     */
    fun dequeue(): T?
    /**
     * @return the value at the front of the queue or nil if none exists
     */
    fun peek(): T?
    /**
     * @return true if the queue is empty and false otherwise
     */
    fun isEmpty(): Boolean
}

class MyQueue<T>: Queue<T> {
    private val queue = MyDoublyLinked<T>()

    /**
     * Add [data] to the end of the queue.
     */
    override fun enqueue(data: T) {
        return queue.pushBack(data)
    }
    /**
     * Remove the element at the front of the queue.  If the queue is empty, it remains unchanged.
     * @return the value at the front of the queue or nil if none exists
     */
    override fun dequeue(): T? {
        return queue.popFront()
    }
    /**
     * @return the value at the front of the queue or nil if none exists
     */
    override fun peek(): T? {
        return queue.peekFront()
    }
    /**
     * @return true if the queue is empty and false otherwise
     */
    override fun isEmpty(): Boolean {
        return queue.isEmpty()

    }
}