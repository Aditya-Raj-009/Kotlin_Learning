package main.kotlin

/*
Infix Function: It can be member function or Extension function.
They have single parameter. They have a prefix of "infix".
All infix function are extension function but not vice versa.

Advantage of using infix function:
we can call function without using '.' (dot) operator and parenthesis "()".
 */

fun main() {
    var str1: String = "Hey"
    val str2: String = "Hello"
    var str3: String = "World"

    str1 = str1.addTriSep(str2,str3,"-")
    println(str1)

    val a:Int = 8
    val b:Int = 7

//    val sub:Int = a.sub(b)

//    since we have used 'infix' keyword as prefix of sub() method, so we can do this: "
    val sub : Int = a sub b // (Notice: we haven't used '.' and '()' .
    println(sub)


}

// we cannot make addTetra as infix as it not of single parameter:
fun String.addTriSep(str1:String,str2:String, separator:String = " "):String
{
    return "$this$separator$str1$separator$str2"
}

// we can make sub as infix as it is using single parameter:
infix fun Int.sub(a:Int):Int
{
    return this-a
}