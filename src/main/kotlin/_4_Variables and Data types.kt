import javax.xml.stream.events.Characters

fun main(args: Array<String>)
{
    /*
    to create variables in kotlin we have two ways:
    1) to make constant we use 'val' keyword. means you cannot change its value
    2) when we use 'var' keyword then we can change its value.

    in short : val is same as final in java
     */
//    var:
    var score = 5;
    println(score)
//    reassigning var value:
    score = 8;
//    but remember if you have first assigning it as integer then you can reassign only by integer not string or any other data type:
//    score = 34.55 // show error because in kotlin the value of type you have assign first it take it as that data type only.
    println(score)

//    val:
    val ok = true;
    println(ok)
//    ok = 8  // show error, as we have used val keyword

//    Data type in kotlin is same as java:
    /*
    Integer: (Byte,Short,Int,Long)
    Floating Point: (Float,Double)
    Boolean: (Boolean)
    Character: (Char,String)
     */
//    define variable explicitly:
    var mynum : Int = 5
    var temp: Double = 44.5
    var isRain: Boolean = true;
    var alpha : Char = 'A';
    var name : String = "Aditya"

//    to convert integer to float we use toFloat() method:
    var myfno : Float = mynum.toFloat()
    println(myfno)
    /*
    also we have:
    toString(),toDouble(),toInt(),toLong() etc.
     */




}