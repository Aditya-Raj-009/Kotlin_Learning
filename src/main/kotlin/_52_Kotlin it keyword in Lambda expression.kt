package main.kotlin

/**
 * it : implicit name of single parameter.
 *
 * when we have only parameter in lambda expression, we can replace that parameter
 * with 'it' keyword.
 * for eg:
 * {s->s.reversed()}
 * by replacing with it keyword:
 * {it.reversed()}
 */

fun main() {
    val program = Program4()
    program.reverseAndDisplay("Hello",{it.reversed()}) // reversed(): predefined method of string.
}

class Program4{

    fun reverseAndDisplay(str:String,reverse:(String)->String) // High level function with lambda as parameter.
    {

        var result = reverse(str)
        println(result)
    }
}