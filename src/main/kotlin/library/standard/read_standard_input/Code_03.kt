package library.standard.read_standard_input

/**
 * @see <a href="https://kotlinlang.org/docs/read-standard-input.html">kotlin docs</a>
 */
fun main() {
    // Reads the input, assuming the elements are separated by spaces, and converts them into integers. For example: 1 2 3
    val numbers = readln().split(' ').map { it.toInt() }
    println(numbers)

    // Reads the input, assuming the elements are separated by commas, and converts them into doubles. For example: 4,5,6
    val doubles = readln().split(',').map { it.toDouble() }
    println(doubles)
}
