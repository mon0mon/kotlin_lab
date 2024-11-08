package scope_function.let

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#let">Kotlin Official Docs</a>
 */
fun processNonNullString(str: String) {}

fun main() {
    val str: String? = "Hello"
    //processNonNullString(str)       // compilation error: str can be null
    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }
}
