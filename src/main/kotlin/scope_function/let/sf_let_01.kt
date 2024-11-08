package scope_function.let

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#let">Kotlin Official Docs</a>
 */
fun main() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)
}
