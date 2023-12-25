fun main()
{
val basicPhone:BasicPhone = BasicPhone();
    val smrt:SmartPhone = SmartPhone();
    println(basicPhone.name)
    println(basicPhone.volume)
    println(smrt.getDeviceInfo())
}

/*
 In java, we use final keyword with class or method so that they cannot be inherited and override.
But Kotlin has a special features i.e. classes and methods are not open for extensions by default, which means they
are by default final class or final function. It means Open classes and methods in kotlin are equivalent to the opposite
of final in java, an open method is overridable and open class is extendable in kotlin.
 */
open class Phone{
    init {
        println("I am Parent (Phone class)")
    }
   open val name:String = "Basic"
   val type:String = "Basic 1100";
    val volume:Int = 10;

    fun makeCall(){}
    fun display(){}
    fun powerOff(){}
   open fun getDeviceInfo():String{
       return "I am Basic";
   }

}

// Inheritance: As like Java, Kotlin doesn't support multiple Inheritance.

class BasicPhone: Phone()
{
    init {
        println("I am child Basic phone")
    }
     override val name:String = "Nokia"
 fun getScreenInfo(){}
}

class SmartPhone: Phone(){
    init {
        println("I am child Smart phone")
    }
    override fun getDeviceInfo():String {
       return  "I am smartPhone";
    }
    fun playMovie(){}
    fun takePicture(){}
    fun getLocation(){}
}