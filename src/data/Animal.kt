package data

abstract class Animal {
    abstract val name:String
    // abstract di prop atau function maka
    abstract fun run()
}

class Cat : Animal(){
    override val name: String = "Cat"
    override fun run(){
        println("Cat Run Out");
    }
}


class Dog : Animal(){
    override val name: String = "Dog"
    override fun run(){
        println("Dog Run Out");
    }
}