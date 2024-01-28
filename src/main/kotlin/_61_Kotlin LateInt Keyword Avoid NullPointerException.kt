package main.kotlin

/** Lateinit Keyword:
 * Only able to use with mutable data type (var).
 * we cannot use it with val.
 *And can only use with non-nullable data.
 * And lateinit data must be initialized before use it.
 *
 * It is a promise to compiler that the value will be initialized in the future.
 * Note: If you try to access lateinit variable without initializing it then it
 * throws uninitializedPropertyAccessException.
 */

fun main() {

    val country:Country = Country()
//    country.name = "India"
//    println(country.name)
    country.setUp()
}

class Country
{
    lateinit var name:String // if you want to assign the value later.

    fun setUp()
    {
        name = "USA"
        println("The name of country is $name")
    }
}