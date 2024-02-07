
interface DoublyLinked<T> {
    fun pushFront(data: T)
    fun pushBack(data: T)
    fun popFront(): T?
    fun popBack(): T?
    fun peekFront(): T?
    fun peekBack(): T?
    fun isEmpty(): Boolean
}
class MyDoublyLinked<T>: DoublyLinked<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size: Int = 0
    /**
     * Adds the element [data] to the front of the linked list.
     */
    override fun pushFront(data: T) {
        val newNode = Node(null, data, head)
        head?.prev = newNode // need to make old head point to new head
        head = newNode // head becomes new head
        size++
        if (size == 1) {
            tail = head // if the list is one item long head = tail
        }
    }

    /**
     * Adds the element [data] to the back of the linked list.
     */
    override fun pushBack(data: T) {
        val newNode = Node(tail, data, null)
        tail?.next = newNode // need to make old tail point to new tail
        tail = newNode // tail becomes new tail
        size++
        if (size == 1) {
            head = tail // if the list is one item long head = tail
        }
    }

    /**
     * Removes an element from the front of the list. If the list is empty, it is unchanged.
     * @return the value at the front of the list or nil if none exists
     */
    override fun popFront(): T? {
        val oldHead = head?.data
        head = head?.next
        head?.prev = null // clearing out old head
        shrink()
        return oldHead
    }

    /**
     * Removes an element from the back of the list. If the list is empty, it is unchanged.
     * @return the value at the back of the list or nil if none exists
     */
    override fun popBack(): T? {
        val oldTail = tail?.data
        tail = tail?.prev
        tail?.next = null // clearing out old tail
        shrink()
        return oldTail
    }

    /**
     * Reduces size of the list. If list size is one or fewer elements, sets size to
     * zero and sets both head and tail to null
     */
    private fun shrink() {
        if (size > 1) {
            size--;
            println(size)
        } else {
            size = 0;
            head = null;
            tail = null
            println("I set size to 0")
        }
    }
    /**
     * @return the value at the front of the list or nil if none exists
     */
    override fun peekFront(): T? {
        return head?.data
    }

    /**
     * @return the value at the back of the list or nil if none exists
     */
    override fun peekBack(): T? {
        return tail?.data
    }

    /**
     * @return true if the list is empty and false otherwise
     */
    override fun isEmpty(): Boolean {
        return (size == 0)
    }
}

/**
 * Stores the value within the stack and the location of the next value
 * @param T the type of data to store
 * @property prev the previous node in our Doubly Linked List
 * @property data the string data associated the node
 * @property next the next node in our Doubly Linked List
 */
class Node<T> (var prev: Node<T>?, val data: T, var next: Node<T>?)