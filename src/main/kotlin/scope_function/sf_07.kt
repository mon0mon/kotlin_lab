package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#context-object">Kotlin Official Docs</a>
 */

fun main() {
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()
    println(numberList)
}
