package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Eko", 10)
    student.sayHello("Akil")
    println(student.upperName)
}