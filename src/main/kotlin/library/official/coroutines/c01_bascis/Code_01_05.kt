package library.official.coroutines.c01_bascis

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * @see <a href="https://kotlinlang.org/docs/coroutines-basics.html#an-explicit-job">kotlin docs</a>
 */

// Sequentially executes doWorld followed by "Done"
fun main() = runBlocking {
    val job = launch {
        delay(1.toDuration(DurationUnit.SECONDS))
        println("World!")
    }
    println("Hello")
    job.join()
    println("Done")
}

