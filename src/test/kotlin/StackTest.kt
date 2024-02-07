import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StackTest {
    @Test
    fun push() {
        /**
         * Testing the functionality of Last In First Out
         */
        val s = MyStack<String>()
        s.push("hello")
        s.push("world")
        assertEquals(s.peek(), "world")
        s.pop()
        assertEquals(s.peek(), "hello")
    }

    @Test
    fun pop() {
    }

    @Test
    fun peek() {
    }

    @Test
    fun isEmpty() {
        val s = MyStack<String>()
        assertTrue(s.isEmpty())
        s.push("hello")
        assertFalse(s.isEmpty())
        s.pop()
        assertTrue(s.isEmpty())
    }
}