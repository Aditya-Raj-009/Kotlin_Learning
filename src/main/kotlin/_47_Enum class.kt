package main.kotlin


enum class CreditType{
    SILVER, // 0 : by default indices
    GOLD, // 1: by default indices
    PLATINUM // 2: by default indices

//    These indices can be accessed by using predefine property "ordinal".
//    Similar to ordinal there is also a property known as "name"
}
fun main() {

    println(CreditType.GOLD)    // they all are type CreditType. They all are object of CreditType.
    println(CreditType.SILVER)
    println(CreditType.PLATINUM)

    println("By using ordinal property: ")
    println(CreditType.GOLD.ordinal)
    println(CreditType.SILVER.ordinal)
    println(CreditType.PLATINUM.ordinal)

    println("By using name property: ")
//    output will same as default case(without using "name" property):
    println(CreditType.GOLD.name)
    println(CreditType.SILVER.name)
    println(CreditType.PLATINUM.name)

    /*Each enum object has to two methods: values() and valueOf()*/

    println("\nvalues() and valueOf(): ")
    val MyConst= CreditType.values()

    MyConst.forEach {
        println(it)
    }

    val cards:CreditType = CreditType.SILVER
    when(cards)
    {
        CreditType.GOLD -> println("Gold member")
        CreditType.SILVER -> println("Silver Member")
        CreditType.PLATINUM -> println("Platinum Member")
        else-> println("Wrong Type")
    }

    println("\nEnum Car: ")
    println(Car.AUDI.color) // green
    println(Car.MARUTI.origin) // white
    println(Car.MUSTANG.origin) // Red
    println(Car.valueOf("AUDI")) // AUDI

    println("\nEnum Audi")

    Audi.AUDI_003.vehicleType()
    Audi.AUDI_009.wheel()


    println("\nAnonymous class in enum:")
    println(ProtocolState.TALKING.signal())
    println(ProtocolState.WAITING.signal())

}

// If you want to add more enum properties, we use enum class constructor:

enum class Car(val color: String, val origin:String = "India")
{
// these all constants are object of this enum, so we have to pass the color to all of these constants constructors:

    MARUTI("White"),
    AUDI("Green","USA"),
    MUSTANG("Red","Germany")

}

// You can also implement interface in enum:

interface CarProperty
{
    fun wheel():Unit

    fun vehicleType()
    {
        println("Car")
    }
}

enum class Audi:CarProperty
{
    AUDI_003{   // for every constant object we have to implement this interface method:
        override fun wheel() {
           println("Car name: AUDI_003")
        }


    },
    AUDI_009{
        override fun wheel() {
            println("Car name: AUDI_009")
        }

    }
}

// Enum Constant as Anonymous class by using Abstract methods:

enum class ProtocolState {
    WAITING {
         override fun signal() = WAITING
    },

    TALKING {
        override fun signal() = TALKING
    };
    abstract fun signal(): ProtocolState

}
