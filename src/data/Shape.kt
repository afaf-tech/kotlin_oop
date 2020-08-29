package data

open class Shape {
    open val corner : Int = -1 //default properties = final

    open fun printName(){
        println("This is a shape")
    }
}

class Rectangle: Shape(){
    override val corner : Int = 4
    val parentCorner: Int = super.corner // super hanya bisa mengakses satu class diatasnya

    override fun printName() {
        super.printName()
        println("THis is a rectangle")
    }
}

class Triangle: Shape(){
    override val corner: Int = 3
}