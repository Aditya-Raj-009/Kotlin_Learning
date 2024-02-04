package main.Important

fun add(vararg v:Int):Int // can accept multiple value.
{
    return v.sum();
}

fun main() {
    println("Sum of 5,6,7,3,and 9 is ${add(5, 6, 7, 3, 9)}")

}