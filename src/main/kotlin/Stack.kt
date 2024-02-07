/**
 * An implementation of a LIFO structure called Stack
 * @param T data stored in the stack
 */
interface Stack<T> {
    fun isEmpty(): Boolean
    fun push(data: T)
    fun pop(): T?
    fun peek(): T?
}

class MyStack<T>: Stack<T> {
    private val list = MyDoublyLinked<T>()
    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }
    /**
     * Push [data] onto the Stack
     * @param data The new value to put onto the stack
     */
    override fun push(data: T) {
        list.pushFront(data)
    }

     /**
     * Pop the top element off the stack
     * @return the top element if it's not empty, else return null
     */
    override fun pop(): T? {
        return list.popFront()
    }
    /**
     * @return the top element if it's not empty, else return null
     */
    override fun peek(): T? {
        return list.peekFront()
    }
}

// In-class implementation:
//class MyStack<T>: Stack<T> {
//    var top: StackNode<T>? = null
//
//    /**
//     * Push [data] onto the Stack
//     * @param data The new value to put onto the stack
//     */
//    override fun push(data: T)
//    {
//        val n = StackNode(data, top)
//        top = n
//    }
//
//    /**
//     * Pop the top element off the stack
//     * @return the top element if it's not empty, else return null
//     */
//    override fun pop(): T?
//    {
//        val tmp = peek()
//        top = top?.next
//        return tmp
//    }
//    /**
//     * @return the top element if it's not empty, else return null
//     */
//    override fun peek(): T?
//    {
//        return top?.data
//    }
//
//    /**
//     * @return true if the stack is empty, else return false
//     */
//    override fun isEmpty(): Boolean
//    {
//        return top == null
//    }
//}
//
///**
// * Stores the value within the stack and the location of the next value
// * @param T the type of data to store
// * @property data the string data associated the node
// * @property next the next node in our Stack
// */
//class StackNode<T> (val data: T, var next: StackNode<T>?)