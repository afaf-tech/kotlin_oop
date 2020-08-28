package app

import data.Person
/* Enkapsulasi adalah proses mengumpulkan function2 /
 property2 dalam suatu kelas dalam suatu kesamaan*/
fun main() {
    val fatih = Person()
    fatih.firsName = "Fatih"
    fatih.middleName = "Al"
    fatih.lastName = "Fikri"

    fatih.sayHello("Ahmad")
    fatih.run()

    val fullname = fatih.getFullName()
    println(fullname)
}