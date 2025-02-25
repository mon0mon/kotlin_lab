package library.official.coroutines.c01_bascis

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * @see <a href="https://kotlinlang.org/docs/coroutines-basics.html#your-first-coroutine">kotlin docs</a>
 */

fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1.toDuration(DurationUnit.SECONDS))   // non-blocking delay for 1 second (default time unit is ms)
        println("World!")   // print after delay
    }
    println("Hello")    // main coroutine continues while a previous one is delayed
}
