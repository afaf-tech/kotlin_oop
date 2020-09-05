package app

import data.Employee
import data.Manager
import data.VicePrecident


// Polymorphism = Kemampuan berubah bentuk dari satu project ke project yg lain
fun main() {
    var employee: Employee = Employee("Fikri")
    employee.sayHello("Akmal")

    employee = Manager("Fikri")
    employee.sayHello("Fl")

    employee = VicePrecident("Fikri")
    employee.sayHello("Jefri")
}