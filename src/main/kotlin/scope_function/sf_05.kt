package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#it">Kotlin Official Docs</a>
 */

import kotlin.random.Random

fun writeToLog(message: String) {
    println("INFO: $message")
}

fun main() {
    fun getRandomInt(): Int {
        return Random.nextInt(100).also {
            writeToLog("getRandomInt() generated value $it")
        }
    }

    val i = getRandomInt()
    println(i)
}
