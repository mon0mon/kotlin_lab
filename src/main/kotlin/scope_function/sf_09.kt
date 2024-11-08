package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#lambda-result">Kotlin Official Docs</a>
 */

fun main() {
    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.")
}
