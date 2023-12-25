package main.Practice



fun main(arg: Array<String>)
{

    var Demo:demo = demo("Aditya Raj",18);
    println("Name : ${Demo.get_Name()}\n Age: ${Demo.get_Age()}")

   println(
       when( demo2("Aditya",18).canVote())
       {
           true -> "Yes"
           false-> "No"
       }
   )

    var d:demo3 = demo3("Prince",23,5.9,"prince@0806");
    d.details();

    var d2:demo2 = demo3("Aditya",23,5.3,"sksdk");
    println(d2.canVote())
}
class demo(
    var name:String,var age:Int
)
{
    fun get_Name():String
    {
        return name;
    }
    fun get_Age():Int = age;
}
open class demo2(
  open  var name:String,open protected var age:Int = 18
)
{
    fun canVote():Boolean = age>=18;
}

class demo3(override var name:String,
            override var age:Int, height:Double,
            protected  var pass:String,  isPublic : Boolean):demo2(name)
{

    init {
        println("Welcome $name")
    }
    init {
        println("height is $height")
    }
    constructor(name:String, age:Int, height: Double,pass:String):this(name,age,height,pass,true) {
        println("Welcome aain $name")

    }
    var isCheck:Boolean = isPublic;
    var height = height;
    fun details()
    {
        println("Name: $name\nAge: $age\nHeight: $height\npassword: $pass\nIs this account public : ${this.isCheck}")
    }

    }

