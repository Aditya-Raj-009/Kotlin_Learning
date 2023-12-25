fun main()
{
// creating object of class:
    val  c1 =  car("Mustang","Petrol",100) // passing argument in constructor.
    c1.aboutCar();
    c1.applyBracke();
    }

/*
In kotlin all classes are final by default.So you can't inherit them.
To inherit them you have to make class 'open'. open keyword is use before class to make
it inheritable.
eg: open class name()
{
}
 */
 class car(              // define property of car in bracket '()'. This is primary constructor
//                        in kotlin. you can use constructor keyword before bracket which is optional.
                        // there is also a secondary type of constructor. same java and other languages.
   private val name:String, protected val type:String,  var dis:Int
)
{
fun aboutCar()
{
    println("Car name is $name type is $type and distance covered $dis")
}
    fun applyBracke()
    {
        println("Applied Bracke!")
    }
}
