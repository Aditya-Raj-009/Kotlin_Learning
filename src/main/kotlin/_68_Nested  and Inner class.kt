package main.kotlin

fun main() {

    var outer:OuterClass = OuterClass()
    outer.i = 5;
    println(outer.i)

//    object of nested class:
//    var nested:OuterClass.Nested = OuterClass.Nested() // before adding 'inner' as prefix of nested class.

//    nested.test()

    // After adding 'inner' as prefix of nested class , we need to first create object of outer class then we can
//create object of nested class:
    var nested:OuterClass.Nested = OuterClass().Nested()

    nested.test()
    println(nested.valuOfIOfOuterClass())
}





class OuterClass{
    var i = 10;

//    If we want to access property of outer class, then we need to add
//    'inner' as prefix of nested class:
    inner class Nested{
        fun test()
        {
            println("I am in nested class.")
        }
    fun valuOfIOfOuterClass():Int = i
    }
}