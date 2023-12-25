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

}

