package app

import data.Person

fun main() {
    val eko = Person()
    val joko = Person()
    val budi = Person()
    // dari satu class bisa membuat banyak object
    eko.firsName = "Fatih"
    println(eko.firsName)
    println(joko)
    println(budi)
}