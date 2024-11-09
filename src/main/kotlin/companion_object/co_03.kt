package companion_object

/**
 * @see <a href="https://kotlinlang.org/docs/object-declarations.html#companion-objects">Kotlin Official Docs</a>
 */
class User2(val name: String) {
    // Defines a companion object without a name
    companion object { }
}

// Accesses the companion object
val companionUser = User2.Companion
