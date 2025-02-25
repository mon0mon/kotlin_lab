package library.official.coroutines.c01_bascis

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * @see <a href="https://kotlinlang.org/docs/coroutines-basics.html#extract-function-refactoring">kotlin docs</a>
 */

fun main() = runBlocking {
    launch { doWorld() }
    println("Hello")
}

//  this is your first suspending function
private suspend fun doWorld() {
    delay(1.toDuration(DurationUnit.SECONDS))
    println("World!")
}
