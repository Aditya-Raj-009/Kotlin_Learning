package main.Practice


fun main() {
    val p1:Person = Person("Aditya Raj",19,45000)
    val p2:Person = Person("Prince Singh Rajput",121,78000)
    p1.personDetails()
    p2.personDetails()

    println(p2 isElderThan p1)


}

class Person(val name:String, var age:Int, var salary:Int)
{

    fun personDetails():Unit
    {

        println("Person Details:\n" +
                "Name: $name\n" +
                "Age: $age\n" +
                "Salary: $salary")
    }
}

infix fun Person.isElderThan(person: Person):Boolean
{
    return this.age>person.age
}