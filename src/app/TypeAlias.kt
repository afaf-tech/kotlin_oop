package app

import data.Applications
import data2.Application


typealias App = Applications
typealias Aplikasi = App

typealias lamdastring = ()-> String
fun sayHaloa(supplier: lamdastring){
    println("hello suplier ${supplier()}")
}

typealias App2 = Application
fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Php App")
    val app2 = App2("Nora 2")

    sayHaloa { "Fikri" }
}