package library.standard.read_standard_input

/**
 * @see <a href="https://kotlinlang.org/docs/read-standard-input.html">kotlin docs</a>
 */
fun main() {
    // Converts the input from a string to an integer value. For example: 12
    val myNumber = readln().toInt()
    println(myNumber)

    // Converts the input from a string to a double value. For example: 345
    val myDouble = readln().toDouble()
    println(myDouble)
    // Converts the input from a string to a boolean value. For example: true

    val myBoolean = readln().toBoolean()
    println(myBoolean)
}
