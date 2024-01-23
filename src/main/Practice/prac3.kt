import main.kotlin.*

fun main() {
//    var a:Int = 28
//    var b:Int = 49
//    var c:Int = 38
//
//    println("Greatest number among $a , $b and $c is ${if(a>b && a>c){
//        a
//
//    } else if (b>a && b>c){
//        b
//    }
//        else{
//            c
//    }
//    }")
//
//    println("${when(a){
//        49-> "Hello I am number 49"
//        38-> "Hello I am number 38"
//        else-> "Hello I am number 28"
//
//    }    }")

//
//    var arr:Array<Int> = arrayOf<Int>(9,4,62,4,6,3,5)
//    var arr2:Array<String> = arrayOf("Hey","Hello","How", "Are","You","?")
//
//    for (i in 0 until arr.size)
//    {
//        println(arr[i])
//    }
//    for ((i:Int,j:String) in arr2.withIndex())
//    {
//        println("$i th element is $j")
//    }
//  for(i in arr.size-1 downTo 0)
//  {
//      print(arr.get(i))
//  }
//    println(arr.contentToString())

//    println(add(5,7,8,9))
//    println(substract(13,4))
//    println(substract(13,4,c=9))
//        var smrt:Phone2 = SmartPhone2("SmartPhone","5G","WIFI_Bluetooth")
//
//    smrt.wifiType = "Wifi6"
//    smrt.MobileType()
//    smrt.NetworkType()
//    smrt.WifiType()


//    var ad:(Int,Int)->Int = ::add
//    println(ad(5,6))
//
//    var car:Maruti = Maruti("Car",4)
//
//    car.vehicleName("Maruti")
//
//    var truck:Vehicle = Maruti("Truck",12)
//    truck.vehicleName("Truck")

//    var obj:clone = Object()
//    obj.cloneObject("Repo")
//
//    var obj2:drag = Object()
//    obj2.dragObject("Player")
//    var char:Char ='A'
//    var ascci:Int = char as Int
//    println(ascci)

    var arr:Array<Shape> = arrayOf(Circle(6.5),Triangle(5.6,2.9),Square(5.6))

    for (i:Shape in arr)
    {
        if(i is Circle)
        {
            println(i.area())
        }
        else if (i is Square)
        {
            i.squareClass()
        }
        else{
            (i as Triangle).triangleClass()
        }
    }

    if(arr[0] !is Triangle)
    {
        println("I am not a triangle")
    }
}





fun add(vararg a:Int):Int
{
    var sum = 0
    for(i in 0 until a.size)
    {
        sum+=a.get(i)
    }
    return sum
}
//fun substract(a:Int,b:Int,c:Int = 1):Int = a-b+c;
//




//open class Phone2(var phnType:String ,   var networkType:String,wirelessType:String)
//{
//
//    var WLType:String
//    open var wifiType: String? = null
//
//    init {
//
//        WLType = wirelessType
//       println("This is Phone2 class")
//    }
//
//    constructor(phnType: String):this(phnType,"2G","BluetoothOnly")
//    {
//        println("This is secondary constructor of Phone2")
//    }
//    open fun wirelessType():Unit
//    {
//        println("Wireless type of this phone is $WLType")
//
//    }
//   open fun NetworkType()
//    {
//        println("Network Type of mobile is $networkType")
//    }
//    open fun MobileType():Unit = println("Mobile type is $phnType")
//
//   open fun WifiType():Unit = println("Wifi type is ${wifiType}")
//
//
//
//}
//
//class SmartPhone2(phnType:String,  networkType:String, wirelessType:String)
//    :Phone2(phnType,networkType,wirelessType)
//{
//        init {
//            println("This is Smartphone class")
//        }
//
//
//    override var wifiType: String? = null
//        get() = field
//        set(value) {
//            field = value
//        }
//   override fun wirelessType():Unit
//    {
//        println("Wireless type of this smartphone is $WLType")
//
//    }
//
//    override fun NetworkType() {
//        println("Network type of this smart phone is $networkType")
//    }
//
//  override  fun MobileType():Unit = println("SmartPhone type is $phnType")
//
//    override fun WifiType():Unit = println("Wifi type is ${wifiType}")
//
//
//}

//abstract class Vehicle(var vehicleType:String,var noOfWheel:Int)
//{
//    init {
//        println("I am abstract class.")
//
//    }
//
//    abstract fun vehicleName(vehicleName:String):Unit
//
//
//
//
//}
//
//class Maruti(vehicleType: String,noOfWheel: Int):Vehicle(vehicleType,noOfWheel)
//{
//    override fun vehicleName(vehicleName:String) {
//        println("$vehicleName $noOfWheel")
//    }
//}

//interface drag
//{
//var dragSpeed:Int
//fun AvgSpeed()
//{
//    println("Average Drag speed is $dragSpeed m/s")
//}
//    fun dragObject(name:String)
//
//
//}
//
//interface clone
//{
//    var cloneSpeed:Int
//
//    fun cloneObject(name:String)
//
//    fun AvgSpeed()
//    {
//        println("Average cloning speed is $cloneSpeed m/s")
//    }
//}
//
//class Object:clone,drag
//{
//    override var cloneSpeed: Int = 6
//    override var dragSpeed: Int = 8
//    override fun AvgSpeed() {
//       super<clone>.AvgSpeed()
//    }
//
//
//    override fun cloneObject(name: String) {
//        println("$name is cloning..")
//        super<clone>.AvgSpeed()
//
//    }
//
//
//    override fun dragObject(name:String) {
//        println("$name is dragging..")
//        super<drag>.AvgSpeed()
//    }
//
//
//}