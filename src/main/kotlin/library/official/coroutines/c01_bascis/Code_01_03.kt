package library.official.coroutines.c01_bascis

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * @see <a href="https://kotlinlang.org/docs/coroutines-basics.html#scope-builder">kotlin docs</a>
 */

fun main() = runBlocking {
    doWorld()
}

//  this is your first suspending function
private suspend fun doWorld() = coroutineScope {
    launch {
        delay(1.toDuration(DurationUnit.SECONDS))
        println("World!")
    }
    println("Hello")
}

