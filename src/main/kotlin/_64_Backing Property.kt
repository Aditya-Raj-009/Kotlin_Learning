package main.kotlin

/** Backing Field != Backing Property:
 *
 *Backing property is used to encapsulate the data from outside the world.
 */

class Human_2{
    var age:Int = 0  // as here age is by default public in nature so any one can change
//    the value of age from outside the class and can access it.
}

// Alternative safe code using Backing Property:
class Human_3{
    private var _age:Int = 0  // here _age private field is actually act as Backing field in kotlin.
//    it holds actual 'age' property data.
    var age:Int // here 'age' is backing property. exposed outside the world.
        get(){
            return _age
        }
        set(value)
        {
            _age = value
        }

/*    Within this class, we always use '_age' field to access the property.
    But outside this class Human, we use 'age' to access the property.

 */
}

// Above both human class are same for outside the class and behave similarly.But
//only difference is that human_3 class is more encapsulated (protected) then Human2 class.
fun main() {

    var h1: Human_2 = Human_2()
    h1.age = 45
    println("Age is ${h1.age}")

    var h2 : Human_3 = Human_3()

    h2.age = 55
    println("Age is ${h2.age}")


// Understand by practical eg:
    var student:Student = Student()
    student.addHobby("Cricket")

//    Accidentally deletion of data:
    student.hobbies.remove("Cricket")

    //   So to avoid this, we use backing property:

    var student2:Student2 = Student2()
    student2.addHobby("Coding")
//    student2.hobbies.remove() // cannot call since hobbies is immutable and throw error.
    println(student2.hobbies.get(0))

}

// Let's understand by a practical example:
class Student{
    val hobbies = mutableListOf<String>()

    fun addHobby(hobbyName:String)
    {
        hobbies.add(hobbyName)
    }
}

// Alternative safe code using Backing Property:
class Student2{
    private val _hobbies = mutableListOf<String>() // backing field

    public val hobbies:List<String> // backing property immutable

        get() = _hobbies


    fun addHobby(hobbyName: String)
    {
        _hobbies.add(hobbyName)
    }
}