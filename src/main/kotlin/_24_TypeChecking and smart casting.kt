package main.kotlin

fun main() {
    val circle:Circle = Circle(4.0)
    val triangle:Triangle = Triangle(4.5,6.2)
    val square:Square = Square(5.7);
    val player:Player = Player("Aditya Raj")
    val array:Array<Shape> = arrayOf(circle,triangle,square);

//    type checking:

    if(circle is Circle) // same like 'instanceOf' in java
    {
        println("This is Circle")
    }

//    smart casting:

    for(obj:Shape in array)
    {
        if(obj is Triangle)
        {
/*
this is smart casting ,means it automatically suggest the method of that class of which
    the obj could be.
 */
            obj.triangleClass();
        }

        else if (obj is Circle)
        {
            obj.circleClass()
        }
        else {
            (obj as Square).squareClass()    // type casting.
        }

    }

    type(array[0])


//    "Unsafe" cast operator":
    /*
    Usually, the cast operator throws an exception if the cast isn't possible.
    Thus, it's called unsafe. The unsafe cast in Kotlin is done by the infix operator as.

    Note that null cannot be cast to String, as this type is not nullable.
    If y is null, the code below throws an exception:
     */

    var y:Int? = null
//    var x:String = y as String  // throw an exception

    /*
    To make code like this correct for null values,
    use the nullable type on the right-hand side of the cast:
     */
    val x: String? = y as String?   // now it will not throw exception
    println(x)



//    "Safe" (nullable) cast operator":
//    To avoid exceptions, use the safe cast operator as?, which returns null on failure:

    val x2: String? = y as? String
    println(x2)



}

fun type(s:Shape)
{
    if(s !is Triangle) // Same as: !(s is String)
    {
        println("Given shape is not a triangle")
        return
    }
    println("Area of triangle is ${s.area()}")
}

