package companion_object

/**
 * @see <a href="https://kotlinlang.org/docs/object-declarations.html#companion-objects">Kotlin Official Docs</a>
 */
class User4 {
    // Defines a named companion object
    companion object Named {
        fun show(): String = "User4's Named Companion Object"
    }
}

// References the companion object of User1 using the class name
val reference1 = User4

class User5 {
    // Defines an unnamed companion object
    companion object {
        fun show(): String = "User5's Companion Object"
    }
}

// References the companion object of User2 using the class name
val reference2 = User5

fun main() {
    // Calls the show() function from the companion object of User1
    println(reference1.show())
    // User1's Named Companion Object

    // Calls the show() function from the companion object of User2
    println(reference2.show())
    // User2's Companion Object
}
