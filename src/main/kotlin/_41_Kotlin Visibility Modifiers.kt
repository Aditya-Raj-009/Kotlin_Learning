package main.kotlin

/**
 * Kotlin supports:
 * public   : by default all the classes and functions are public.
 * protected: you cannot assign protected to top level method and class.Can only be accessible by subclass.
 * internal: it will be visible everywhere in the same module.
 * private: Not accessible from outside this file.
 */
fun main() {

}

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}

