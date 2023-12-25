fun main()
{
    var i:Int = 10;

//    using function of integer data type:
    println(i.plus(30))
    println(i.toFloat())

//    creating object of person class:
    val p1:Person = Person("Aditya",27);
    val p2:Person = Person("Rahul",14);
   val s:Boolean = p1.canVote();
   val s2:Boolean =  p2.canVote();
    println(
        if(s&&s2)
        {

            "${p1.name} and ${p2.name} both can vote";
        }
        else if(s2)
        {
            "${p2.name} can vote";
        }
        else if(s)
        {
            "${p1.name} can vote";
        }
        else{
            "No one cane vote!";
        }
    )
}

class Person constructor(val name:String, var age:Int ) // constructor keyword is option here.
{
    fun canVote():Boolean
    {
        return age>18;
    }
}