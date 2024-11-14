package oop.casting

open class SuperClass {
    open fun act() {
        println("SuperClass")
    }
}

class SubClass : SuperClass() {
    override fun act() {
        println("SubClass")
    }
}

fun doAct(cls: SuperClass) {
    cls.act()
}

fun main() {
    val sup = SuperClass()
    val sub = SubClass()

    doAct(sup)
    doAct(sub)
}