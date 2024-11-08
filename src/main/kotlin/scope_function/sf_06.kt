package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#it">Kotlin Official Docs</a>
 */

import kotlin.random.Random

fun main() {
    fun getRandomInt(): Int {
        return Random.nextInt(100).also { value ->
            writeToLog("getRandomInt() generated value $value")
        }
    }

    val i = getRandomInt()
    println(i)
}
