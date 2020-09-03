package data

interface Interaction {
    val name:String
    fun sayHello(name: String) {
        println("Hloo $name, my name is ${this.name}")
    }
}
// interface tidak punya constructor
// child dari inteface bisa mempunyai multiple inheritance
// ada inheritance antar interface
// tapi interface cannot inherit class
interface Go: Interaction{
    fun go(){
        println("Go!");
    }
}

open class Contoh

interface MoveA{

    fun move() = println("movea")
}

interface MoveB{

    fun move() = println("moveb")
}


class Human (override val name:String):Contoh() , Go, MoveA, MoveB{
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }
}