package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#lambda-result">Kotlin Official Docs</a>
 */

fun main() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }
}
