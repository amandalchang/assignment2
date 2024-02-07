// P3: How would you reverse the elements in a stack (i.e., put the elements
// at the top of the stack on the bottom and vice-versa)? You can use as
// many additional stacks and queues as temporary storage in your approach.

var flipMe = MyStack<String>()
val flipped = MyStack<String>()
fun main() {
    flipMe.push("D")
    flipMe.push("C")
    flipMe.push("B")
    flipMe.push("A")
    println(flipMe.peek() == "A")
    while (!flipMe.isEmpty()) {
        flipped.push(flipMe.pop()!!) // flipMe dies here
    }
    flipMe = flipped
    println(flipMe.peek() == "D") // flipMe has been flipped!
}
