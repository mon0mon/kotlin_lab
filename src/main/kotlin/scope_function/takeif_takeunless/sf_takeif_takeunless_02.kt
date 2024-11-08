package scope_function.takeif_takeunless

import kotlin.random.*

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#takeif-and-takeunless">Kotlin Official Docs</a>
 */
fun main() {
    val str = "Hello"
    val caps = str.takeIf { it.isNotEmpty() }?.uppercase()
    //val caps = str.takeIf { it.isNotEmpty() }.uppercase() //compilation error
    println(caps)
}
