fun main()
{
    var car = Automobile("Car",4,5);
    var per = person();
    println(per.name)
    println(per.age)

//    var per2 = person2("Aditya" , 22)
//    println(per2.name)
//    print(per2.age)

    var c1 = Car("Mustang",4,7,false)

    var hum = Human("Aditya",12); // since you have secondary constructor you don't have to pass all value. you pass only those which are not define there.

}

//class with constructor:
class Automobile (val name:String,val tyres:Int,val maxSeating:Int)
{
    fun drive()
    {}
    fun applyBrackes()
    {}
}

//class without constructor:
class Empty
{
    fun name()
    {}
}

//another variation to define constructor :
class person() // empty constructor.
{
    val name:String = ""
    val age:Int = 0
}

// Initialise parameter through constructor:
class person2( nameparam:String ,  Myage:Int)  // unless and until you not use val or var keyword property will not define.
// Without either keyword the parameter is only a parameter, and thus only accessible during initialization..
{
//    we use parameter to define properties:
    val name:String = nameparam;
    val age:Int = Myage;
}

//initializer block: after define property initializer block will execute:

class Car( name:String,val tyres: Int,val maxSeating: Int, hasAirBag:Boolean)
{
//    as like java, constructor call automatically . In Kotlin if there is 'init' then it will call automatically.
    init {
        println("$name is created")
    }
    init {
        println("Second initializer block")
    }
    var airBag = hasAirBag;

    fun drive(){
        println(airBag)
    }
    fun applyBracke(){}

}

// secondary constructor:
class Human(val name:String ,val age:Int,val dob:String, gender:String)
{
     var gen:String
    init {
        println("Gender is $gender")
        this.gen = gender
    }
    init {
        println("Dob is $dob")
    }

/*    secondary constructor: there is a rule in kotlin that whenever you
   create a secondary constructor then you have to call primary constructor also if present.
   In secondary constructor we cannot declare variable as property of the class.i.e. we
   cannot use var or val keyword with parameter in secondary constructor.
 */
    constructor(nameParam:String, age:Int):this(nameParam,age,"02-10-2004","M") // it will call primary constructor.
    {
//        the body of secondary constructor will call after the init block.
        println("Hello jaan")
    }

    fun printDetails()
    {
        println("Name : $name\nAge: $age\nDOB: $dob\nGender: $gen")
    }
}