package scope_function.let

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#let">Kotlin Official Docs</a>
 */
fun main() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    //  method reference instead of the lambda argument
    numbers.map { it.length }.filter { it > 3 }.let(::println)
}
