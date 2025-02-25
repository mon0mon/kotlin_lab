package library.standard.read_standard_input

/**
 * @see <a href="https://kotlinlang.org/docs/read-standard-input.html#handle-standard-input-safely">kotlin docs</a>
 */
fun main() {
    // Returns null if the input is invalid. For example: Hello!
    val wrongInt = readln().toIntOrNull()
    println(wrongInt)

    // Converts a valid input from a string to an integer. For example: 13
    val correctInt = readln().toIntOrNull()
    println(correctInt)
}
