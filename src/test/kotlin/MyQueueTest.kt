import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MyQueueTest {

    @Test
    fun enqueue() {
        val queue = MyQueue<String>()
        queue.enqueue("I")
        queue.enqueue("am")
        queue.enqueue("a")
        queue.enqueue("queue")
        assert(queue.peek() == "I")
    }

    @Test
    fun dequeue() {
//        val queue = MyQueue<String>()
//        queue.enqueue("dequeue")
//        queue.enqueue("me")
//        queue.dequeue()
//        assert(queue.peek() == "me")
        val emptyQueue = MyQueue<String>()
        assert(emptyQueue.peek() == null)
        emptyQueue.dequeue()
        assert(emptyQueue.peek() == null)

        val queue = MyQueue<String>()
        queue.enqueue("I'm")
        queue.enqueue("someone")
        queue.enqueue("named amanda")
        queue.dequeue()
        assert(queue.peek() == "someone") // should return "someone"
        assert(!queue.isEmpty())
        queue.dequeue()
        queue.dequeue()
        assert(queue.isEmpty()) // should return true

    }

    @Test
    fun peek() {
        val queue = MyQueue<Int>()
        assert(queue.peek() == null)
        queue.enqueue(0)
        queue.enqueue(2)
        assert(queue.peek() == 0)
    }

    @Test
    fun isEmpty() {
        val queue = MyQueue<Double>()
        queue.enqueue(0.32)
        queue.enqueue(2.2)
        queue.dequeue()
        assert(!queue.isEmpty())
        queue.dequeue()
        assert(queue.isEmpty())

    }
}