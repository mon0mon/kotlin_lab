package library.official.coroutines.c01_bascis

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * @see <a href="https://kotlinlang.org/docs/coroutines-basics.html#scope-builder-and-concurrency">kotlin docs</a>
 */

// Sequentially executes doWorld followed by "Done"
fun main() = runBlocking {
    doWorld()
    println("Done")
}

// Concurrently executes both sections
private suspend fun doWorld() = coroutineScope {
    launch {
        delay(2.toDuration(DurationUnit.SECONDS))
        println("World 2")
    }
    launch {
        delay(1.toDuration(DurationUnit.SECONDS))
        println("World 1")
    }
    println("Hello")
}

