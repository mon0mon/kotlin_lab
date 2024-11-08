package scope_function.with

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#with">Kotlin Official Docs</a>
 */
fun main() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
}
