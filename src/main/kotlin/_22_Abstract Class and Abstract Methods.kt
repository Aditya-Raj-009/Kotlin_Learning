package main.kotlin

import kotlin.math.pow

fun main() {
    val circle:MCircle = MCircle(4.0);
    println(circle.area())
}

// by default abstract are open,so we don't need to define it explicitly.
abstract class Mshape{

    abstract var shapeName:String;
    abstract fun area():Double;

    fun display()
    {
        println("I am Mshape Class.")
    }
}

class MCircle(val radius:Double):Mshape()
{
    override var shapeName: String = "Circle"

    override fun area(): Double {
    return Math.PI*radius.pow(2);
    }

}