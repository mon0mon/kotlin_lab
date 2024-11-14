package reactive_programming

import java.lang.Integer.sum
import java.util.concurrent.CompletableFuture

/**
 * @see <a href="https://velog.io/@ekxk1234/kotlin-reactive-programing">링크</a>
 */
fun main() {
    val completableFuture = CompletableFuture.supplyAsync {
        Thread.sleep(2000)
        sum(100, 200)
    }
    println("계산 시작")
    completableFuture.thenApplyAsync(::println) // 논블로킹으로 동작
    do {
        println("계산 결과를 집계 중입니다.")
        Thread.sleep(100)
    }
    while (!completableFuture.isDone)
    println("계산 종료")
}