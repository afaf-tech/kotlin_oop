package data

class Student (val name:String, val age:Int)

fun Student.sayHello(name: String){
    println("Hello $name: My Name is ${this.name}")
}

val Student.upperName :String
    get() = this.name.toUpperCase()