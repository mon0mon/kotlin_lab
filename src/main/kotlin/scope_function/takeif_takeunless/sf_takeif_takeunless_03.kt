package scope_function.takeif_takeunless

import kotlin.random.*

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#takeif-and-takeunless">Kotlin Official Docs</a>
 */
fun main() {
    fun displaySubstringPosition(input: String, sub: String) {
        input.indexOf(sub).takeIf { it >= 0 }?.let {
            println("The substring $sub is found in $input.")
            println("Its start position is $it.")
        }
    }

    displaySubstringPosition("010000011", "11")
    displaySubstringPosition("010000011", "12")
}
