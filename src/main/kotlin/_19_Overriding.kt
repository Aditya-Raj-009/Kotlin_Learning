fun main()
{
    val onePlus:OnePlus = OnePlus("SmartPhone");
    onePlus.display();
    onePlus.makeCall();
    val generalMobile = Mobile("General");
    generalMobile.display();

    println(onePlus.toString())
}

open class Mobile(val type:String)
{
    init {
        println("$type in Mobile")
    }
    //    use open keyword to allow override.

    open val name : String = ""
   open val size:Int = 5;
   open fun makeCall() = println("Calling from Mobile")
    fun powerOff() = println("Shutting down")
   open fun display() = println("Simple Mobile Display")

}

class OnePlus(typeParam:String): Mobile(typeParam) // passing parameter to constructor of parent.
{
    init {
        println("$typeParam in onePlus")
    }
@Override
override  fun display()= println("One Plus Display!")

    override val name: String = "One Plus 11 pro"

    override val size: Int = 7;


    @Override
    override fun makeCall() {
        super.makeCall()
        println("Now calling in OnePlus!")
    }

    // Any : Every Kotlin class has Any as a superclass
    /*
    Methods in Any class:
    equals()
    hasCode()
    toString()

    // And this all methods are open to override.
     */

// let override toString() method  of Any class:

    override fun toString(): String {
        return "I am OnePlus override toString() method. :)"
    }

}



