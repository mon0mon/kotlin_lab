package scope_function

import kotlin.random.Random

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#context-object">Kotlin Official Docs</a>
 */
fun main() {
    fun getRandomInt(): Int {
        return Random.nextInt(100).also {
            writeToLog("getRandomInt() generated value $it")
        }
    }

    val i = getRandomInt()
}
