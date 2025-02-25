package library.standard.read_standard_input

/**
 * @see <a href="https://kotlinlang.org/docs/read-standard-input.html">kotlin docs</a>
 */
fun main() {
    // Reads and stores the user input in a variable. For example: Hi there!
    val myInput = readln()

    println(myInput)

    // Reads and prints the user input without storing it in a variable. For example: Hi, Kotlin!
    println(readln())
}
