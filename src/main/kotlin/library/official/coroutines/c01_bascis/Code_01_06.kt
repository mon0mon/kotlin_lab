package library.official.coroutines.c01_bascis

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * @see <a href="https://kotlinlang.org/docs/coroutines-basics.html#coroutines-are-light-weight">kotlin docs</a>
 */

fun main() = runBlocking {
    repeat(50_000) { // launch a lot of coroutines
        launch {
            delay(5.toDuration(DurationUnit.SECONDS))
            print(".")
        }
    }
}

