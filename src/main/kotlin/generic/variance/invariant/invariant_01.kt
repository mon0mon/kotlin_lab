package generic.variance.invariant

/**
 * Invariant 무공변
 * 자바와 코틀린 제네릭의 기본 타입 시스템
 * Super type과 Sub type 간의 변성(variance)는 불가
 * @see <a href="https://deep-dive-dev.tistory.com/39">Blog</a>
 */
open class Alcohol
class Soju : Alcohol()

interface Drinker<T> {
    fun drink()
}

fun varianceTest(input: Drinker<Alcohol>) {
    input.drink()
}

fun main() {

    val alchol: Drinker<Alcohol> = object : Drinker<Alcohol> {
        override fun drink() {
            println("Drink!")
        }
    }

    val soju: Drinker<Soju> = object : Drinker<Soju> {
        override fun drink() {
            println("Drink Soju!")
        }
    }

    // Success
    println(varianceTest(alchol)) // Drink!

    // Error
    // Type mismatch: inferred type is Drinker<Soju> but Drinker<Alcohol> was expected
//    println(varianceTest(soju))

}
