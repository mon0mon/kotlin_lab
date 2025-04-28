package coroutine.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.*

/**
 * [Official Docs Channels](https://kotlinlang.org/docs/coroutines-and-channels.html#channels)
 */
fun main() = runBlocking<Unit> {
    val channel = Channel<String>()
    launch {
        channel.send("A1")
        channel.send("A2")
        log("A done")
    }
    launch {
        channel.send("B1")
        log("B done")
    }
    launch {
        repeat(3) {
            val x = channel.receive()
            log(x)
        }
    }
}

fun log(message: Any?) {
    println("[${Thread.currentThread().name}] $message")
}
