import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MyDoublyLinkedTest {

    @Test
    fun pushFront() {
        val s = MyDoublyLinked<Int>()
        s.pushFront(1)
        s.pushFront(2)
        s.pushFront(3)
        assert(s.peekFront() == 3)
        assert(s.peekBack() == 1)
    }

    @Test
    fun pushBack() {
        val s = MyDoublyLinked<String>()
        s.pushBack("I")
        s.pushBack("am")
        s.pushBack("Amanda")
        assert(s.peekFront() == "I")
        assert(s.peekBack() == "Amanda")

    }

    @Test
    fun popFront() {
        val s = MyDoublyLinked<Int>()
        s.pushFront(1)
        assert(s.peekBack() == 1)
        assert(s.peekFront() == 1)
        s.popFront()
        s.pushFront(1)
        s.pushFront(2)
        assert(s.peekFront() == 2)
        assert(s.popFront() == 2)
        assert(s.popFront() == 1)
        assert(s.peekBack() == null)
        s.popFront() // popping null list
        assert(s.isEmpty())

        val list = MyDoublyLinked<String>()
        list.pushBack("I'm")
        list.pushBack("someone")
        assert(list.peekFront() == "I'm")
        list.pushBack("named Amanda")
        list.popFront()
        assert(list.peekFront() == "someone") // making sure head is updating
        list.popFront()
        list.popFront()
        assert(list.isEmpty())
    }

    @Test
    fun popBack() {
        val s = MyDoublyLinked<Int>()
        s.pushFront(1)
        assert(s.peekBack() == 1)
        assert(s.peekFront() == 1)
        s.popBack()
        s.popBack() // Making sure that it can pop a null list
        assert(s.peekFront() == null)
        assert(s.peekBack() == null)
        assert(s.isEmpty())

        val list = MyDoublyLinked<String>()
        list.pushBack("named Amanda")
        list.pushFront("someone")
        assert(list.peekBack() == "named Amanda")
        list.pushFront("I'm")
        list.popBack()
        assert(list.peekBack() == "someone") // making sure tail is updating
        list.popBack()
        list.popBack()
        assert(list.isEmpty())
    }

    @Test
    fun peekFront() {
        val s = MyDoublyLinked<String> ()
        s.pushBack("String")
        assert(s.peekFront() == "String")
    }

    @Test
    fun peekBack() {
        val s = MyDoublyLinked<String> ()
        s.pushFront("String")
        assert(s.peekBack() == "String")
    }

    @Test
    fun isEmpty() {
        val s = MyDoublyLinked<Double> ()
        assert(s.isEmpty())
        s.pushBack(3.1415) // Checking a different data type
        assert(!s.isEmpty()) // Making sure it's no longer empty
    }
}