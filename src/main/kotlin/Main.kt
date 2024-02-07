//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//fun addHelloWorld(s: Stack<String>) {
//    s.push("hello")
//    s.push("world")
//}
//fun main() {
//    val s = MyStack<String>()
//    addHelloWorld(s)
//    s.push("hello")
//    println(s.isEmpty())
//    println(s.pop())
//    println(s.pop())
//    println(s.isEmpty())
//}

fun addWords(s: DoublyLinked<String>) {
    s.pushFront("am")
    s.pushBack("Amanda")
    s.pushFront("I")
    s.pushBack("Chang")
    s.pushBack("hehe")
}
fun main() {
    val s = MyDoublyLinked<String>()
    addWords(s)
    println(s.peekFront() == "I")
    println(s.peekBack() == "hehe")
}