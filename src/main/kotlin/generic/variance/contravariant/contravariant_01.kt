package generic.variance.contravariant

/**
 * Contravariant 반공변
 * @see <a href="https://deep-dive-dev.tistory.com/39">Blog</a>
 */
open class Alcohol
class Soju : Alcohol()

interface Drinker<T> {
    fun drink()
}

fun varianceTest(input: Drinker<in Alcohol>){ // in keyword 추가
    input.drink()
}

fun main() {

    val alchol: Drinker<Alcohol> = object:Drinker<Alcohol>{
        override fun drink(){
            println("Drink!")
        }
    }

    val soju: Drinker<Soju> = object:Drinker<Soju>{
        override fun drink(){
            println("Drink Soju!")
        }
    }

    val any: Drinker<Any> = object:Drinker<Any>{
        override fun drink(){
            println("Drink Any!")
        }
    }

    // Success
    println(varianceTest(alchol)) // Drink!

    // Error
    // Type mismatch: inferred type is Drinker<Soju> but Drinker<in Alcohol> was expected
//    println(varianceTest(soju))

    // Success
    println(varianceTest(any)) // Drink Any!

}
