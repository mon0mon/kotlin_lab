package generic.variance.covariant

/**
 * Covariant 공변
 * @see <a href="https://deep-dive-dev.tistory.com/39">Blog</a>
 */
open class Alcohol
class Soju : Alcohol()

interface Drinker<T> {
    fun drink()
}

fun varianceTest(input: Drinker<out Alcohol>) { // out keyword 추가
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

    val any: Drinker<Any> = object : Drinker<Any> {
        override fun drink() {
            println("Drink Any!")
        }
    }

    // Success
    println(varianceTest(alchol)) // Drink!

    // Success
    println(varianceTest(soju)) // Drink Soju!

    // Error
    //Type mismatch: inferred type is Drinker<Any> but Drinker<out Alcohol> was expected
//    println(varianceTest(any))

}
