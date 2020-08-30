package app

import data.Company

fun main() {
    val company1 = Company("Bukapalak")
    val company2 = Company("Shope")


    // ada override equal di Company
    println(company1 == company1)
}