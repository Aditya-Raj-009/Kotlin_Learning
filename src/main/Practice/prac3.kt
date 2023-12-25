package main.Practice

class prac3  constructor(name:String,age:Int,id:String,email_id:String)
{
    private val u_name = name
    private val age:Int = age;
    private val email_id : String = email_id
    private val id:String = id;
    fun name():Unit
    {
       println("Username is $u_name");
    }
    fun age():Unit = println("User age is $age")
    fun email():Unit = println("User email is $email_id")
    fun id():Unit = println("User id is $id")

    fun canVote():String = if(age>18) "Yes" else "No"

}

open class Animal (type:String = "Animal", color:String="Black",leg:Int=4,hand:Int=0,classType:String = "Animal")
{
   protected val type:String = type
    protected val cType: String = classType
    protected  val color:String = color
    protected val leg:Int = leg
    protected val hand:Int = hand


    init {
        println("I am $classType class of type $type, color $color with leg $leg and hand $hand")

    }


    constructor(type:String="Human",classType: String):this(type,"white",2,2,classType)
    {

        println("Nice to meet you! You are a $type , color $color with leg $leg and hand $hand\" ")
    }

   open fun type():Unit = println("Class Type: $cType\nAnimal type: $type\nColor: $color\nLeg: $leg\nHand: $hand")

    open fun className():Unit = println("Class Type: $cType")

    open fun greet():Unit = println("Hi! Animal")

    fun checkAnim() = println("Animal")
}

class Human(type: String,classType: String) : Animal(type,classType)
{
    override fun type():Unit = println("Class Type: $cType\nAnimal type: $type\nColor: $color\nLeg: $leg\nHand: $hand")
     override fun className():Unit = println("Class Type: $cType")


     override fun greet():Unit = println("Hi! Human")
    fun checkHum() = println("Human")
}

fun main() {
    val prac:prac3 = prac3(name = "Aditya Raj",18,"adit12333","adityaraj@gmail.com")

    prac.name()
    prac.age()
    prac.email()
    prac.id()

    println("Am I eligible to vote: ${prac.canVote()}")

    val animal:Animal = Animal()
    animal.type()

    val human:Animal = Human("Human","Human")
    human.className()
    human.greet()
    human.checkAnim()



}