package main.kotlin


/**
 * with(person){}: It is a part of kotlin standard library.
 * person.apply(){}: It is also a part of kotlin standard library.
 * It returns a receiver. Here receiver is person. Apart from this apply has the
 * right to call the functions of person.
 *
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