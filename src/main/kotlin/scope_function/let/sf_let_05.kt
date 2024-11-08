package scope_function.let

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#let">Kotlin Official Docs</a>
 */
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!$firstItem!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")
}
