package main.kotlin

import kotlin.math.pow


/*
note:
Any is a super class of all classes in Kotlin.


 */
fun main() {

    val circle:Shape = Circle(4.0)
    val square:Shape = Square(7.0)

//    println(circle.area())
//    println(square.area())

    val shapes:Array<Shape> = arrayOf(Circle(5.0),Square(4.0),
        Circle(3.3),Square(6.2), Triangle(4.6,5.6))

    calculateAreas(shapes)
}
fun calculateAreas(shapes:Array<Shape>) // we cannot use var or val in function parameter.
{
    for(s in shapes)
    {
        println(s.area())
    }
}
open class Shape{
   open fun area():Double
    {
        return 0.0;
    }
}

class Circle:Shape
{
    private var radius:Double

    constructor(radius:Double)
    {
        this.radius = radius
    }

    override fun area(): Double {
        return Math.PI* radius.pow(2.0)
    }

    fun circleClass() = println("I am Circle")

}

class Square(private val side:Double):Shape()
{


    override fun area(): Double {
        return side.pow(2.0)
    }
    fun squareClass() = println("I am Square")

}

class Triangle(private val base:Double,private val height:Double):Shape()
{
    override fun area(): Double {
        return 0.5*(base*height)
    }
    fun triangleClass() = println("I am Triangle")
}