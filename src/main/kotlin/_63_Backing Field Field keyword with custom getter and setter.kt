package main.kotlin

/*
Now, from the basic of kotlin we know that for every property which we create
    inside a class a default getter and setter is internally created.
    So, we don't have to explicitly declare its getter and setter.
    But if you want to customize its getter and setter then you need to declare
    them and write code within them.
 */
fun main() {

    val human:Human = Human()
    human.age = 40  // call set(40) method.
    println(human.age) // call get() method.
}

class Human{
    var age = 20

//    custom getter:
get(){
    // println("Age is : $age") // throws StackOverflow exception.Because in kotlin,
// within your getter or setter you cannot access the property by using the property
//    name itself. For here above you cannot use 'age' property within its own
//    getter. If you use it this way, then this $age will execute its own getter
//    over here and our code will enter into infinite recursion resulting in
//    StackOverFlow exception.

//    to avoid this exception for this purpose, we make use of 'Backing Field' in
//    kotlin. So instead using here 'age' you just need to replace it by 'field'
//    keyword.

    println("Aage is $field") // 'field' keyword stores the value of 'age' property in memory.
//    so this 'field' is known as 'Backing field' in kotlin.
    return  field // returns the value of age property.
}

// Same principle apply for custom setters as well.:
set(value){
    field = value; // assign the value to age property.
//    age = value  // throws stackOverflew exception.
}

//    Backing field ('field') cannot be used within another function. It can only use in getter and setter.
}