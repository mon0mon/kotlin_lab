package scope_function.with

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#with">Kotlin Official Docs</a>
 */
fun main() {
    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)
}
