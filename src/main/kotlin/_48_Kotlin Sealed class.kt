package main.kotlin

import pow
import kotlin.math.PI


enum class Color(var color:String)
{
    RED("Light red"),
    GREEN("Dark green"),

    //    we cannot do this,because it can only contain constant value:
//    BLUE(val myBlueColor:String)
//    To overcome this problem, we have "sealed" class.

}

/**
 * Sealed Class: Sealed means restrictions.
 * Sealed class applies some kind of restriction to your class but of
 * course, it is more flexible than the enum class.
 * sealed class comes in between normal class and enum class:
 * class > sealed class > enum class
 *
 * Sealed class is by default an abstract class means you cannot make object of sealed class.
 * By default, the constructor of a sealed class is private and we cannot make it
 * as non-private.
 */

//  sealed class:

sealed class Shapes{

//    we can create its subclasses :

    //    you can also put these subclasses outside the sealed class.
    //    But subclasses cannot be outside this file and package
    //    and this was restriction we were talking about earlier.

//    Also subclasses can be regular class (Normal class),
    //    object as well as data class means we can have all type of subclasses inside sealed class.
   data class Circle(var radius:Double):Shapes()
    object NotShape:Shapes()
    class Triangle(var base:Float,var height:Float):Shapes()

//    Also we can have another sealed class and sealed interface.

    sealed class Line:Shapes()
    sealed interface Draw


}
fun main() {

    var circle = Shapes.Circle(3.0)
    var square = Shapes.Triangle(3.0f,5.7f)

    Area(circle)
    Area(square)


    val noShapes = Shapes.NotShape
    Area(noShapes)
}

fun Area(s:Shapes)
{
    when(s)
    {
        is Shapes.Circle -> println("Circle area is ${PI*pow(s.radius,2.0)}")
        is Shapes.Triangle -> println("Triangle area is ${0.5*s.base*s.height}")
        Shapes.NotShape -> println("No Shape found") // for singleton object we not use "is" keyword.
    }
}