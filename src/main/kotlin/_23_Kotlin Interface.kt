package main.kotlin

fun main() {
val player: Player = Player("Aditya Raj");
    player.dragSpeed = 8
    println(player.dragSpeed)
    player.drag()
    player.clone();
}

interface Draggable{
    var dragSpeed:Int
    fun drag();
}
interface Cloneable{
    fun clone();
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
}