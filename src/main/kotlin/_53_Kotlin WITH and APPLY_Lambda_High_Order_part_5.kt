package main.kotlin


/**
 * with(person){}: It is a part of kotlin standard library.
 * person.apply(){}: It is also a part of kotlin standard library.
 * It returns a receiver. Here receiver is person. Apart from this apply has the
 * right to call the functions of person.
 *
 * with:
 * The context object is available as a receiver (this).
 * The return value is the lambda result.
 *
 * As "with" is not an extension function: the context object is passed as an argument, but inside the lambda, it's available as a receiver (this).
 *
 * We recommend using with for calling functions on the context object when you don't need to use the returned result.
 * In code, with can be read as "with this object, do the following."
 *
 * val numbers = mutableListOf("one", "two", "three")
 * with(numbers) {
 *     println("'with' is called with argument $this")
 *     println("It contains $size elements")
 * }
 *
 * You can also use with to introduce a helper object whose properties or functions are used for calculating a value.
 *
 * val numbers = mutableListOf("one", "two", "three")
 * val firstAndLast = with(numbers) {
 *     "The first element is ${first()}," +
 *     " the last element is ${last()}"
 * }
 * println(firstAndLast)
 *
 *
 * apply:
 * The context object is available as a receiver (this).
 *
 * The return value is the object itself.
 *
 * As apply returns the context object itself, we recommend that you use it for code blocks that don't return a value
 * and that mainly operate on the members of the receiver object. The most common use case for apply is for object configuration.
 * Such calls can be read as "apply the following assignments to the object."
 *
 * val adam = Person("Adam").apply {
 *     age = 32
 *     city = "London"
 * }
 * println(adam)
 */
fun main() {

    var person:Person = Person()

    with(person){
        name = "Aditya Raj"  // same as : this.name = "Aditya Raj"
        age = 23

    }
    person.apply {
        name  = "Prince"    // same as : this.name = "Prince"
        age = 24
    }.startRun()
    println(person.name)
    println(person.age)
}

class Person{
    var name : String = ""
    var age : Int = -1

    fun startRun()
    {
        println("Now I am ready to run")
    }
}