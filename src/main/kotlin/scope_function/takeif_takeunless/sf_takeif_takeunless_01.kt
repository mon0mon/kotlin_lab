package scope_function.takeif_takeunless

import kotlin.random.*

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#takeif-and-takeunless">Kotlin Official Docs</a>
 */
fun main() {
    val number = Random.nextInt(100)

    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("even: $evenOrNull, odd: $oddOrNull")
}
