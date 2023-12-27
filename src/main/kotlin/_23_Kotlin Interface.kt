package main.kotlin

fun main() {
val player: Player = Player("Aditya Raj");
    player.dragSpeed = 8
    println(player.dragSpeed)
    player.drag()
    player.clone();
    player.onTouch()

}

interface Draggable{

    // In kotlin all interface member are public and open by default NOT FINAL.
    var dragSpeed:Int
    fun drag();

//    Interface can contain both normal as wel as abstract methods:
    fun onTouch()
    {
        println("Touched in Draggable..")
    }
}
interface Cloneable{
    fun clone();
    fun onTouch()
    {
        println("Touched in Cloneable..")
    }
}
class Player(val name:String):Draggable,Cloneable{
    override  var dragSpeed: Int=0
        get() = field; // getting value of dragSpeed variable.
        set(value){    // setting value to dragSpeed variable.
            field = value
        }

    override fun drag() {
        println("Hello dragging...")
    }



    override fun clone() {
        println("Cloning....")
    }

//    If both the interface have same function then we have to implement it:
    override fun onTouch() {
        super<Draggable>.onTouch() // we have to explicitly pass the parent name because both have
//     same function so the compiler get confused.
        println("Touched in Player..")
    }
}