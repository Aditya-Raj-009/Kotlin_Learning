package main.kotlin

fun main() {

//    var student:Student = Student()
//
//    println(student.hasPassed(45.9))
//    println(student.isScholar(86.9))


//    before coming to next , please understand above code first.^
    val str1:String = "Hello"
    val str2:String = "World"
    var str3:String = "Hey"

//    now to append these 3 string we can do:
//    str3+=str1+str2;

//    or we can create our own extension method of String class
//    that can add these 3 together.

//    by using our trioMethod:
    str3 = str3.addTrio(str1,str2)

    println("After concatenation : $str3")


//    another example of extension function:

    val a:Int = 7
    val b:Int = 28

    val sum:Int = a.add(b)

    println("Sum of $a and $b is $sum")



}

fun String.addTrio(str1:String, str2:String):String
{
    return "$this $str1 $str2";
}

fun Int.add(other:Int):Int = this + other;
/**

/* by using class name followed by '.' , we can make the behave like a method of that class.

means the below given method now behave like a simple method of Student class.
we can call this method by the object of Student class. And you cannot call
this method directly like we call normal function.

This how the extension function works.
 */

fun Student.isScholar(marks:Double):Boolean
{
    return marks>95.0
}
/*
class newStudent: Student()
{
//    below function is the function of newStudent class only:
    fun isScholar(marks: Double):Boolean
    {
        return marks>90.7
    }

}

 */
 **/