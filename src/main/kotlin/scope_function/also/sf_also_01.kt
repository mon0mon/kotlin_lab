package scope_function.also

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#also">Kotlin Official Docs</a>
 */
fun main() {
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
}
