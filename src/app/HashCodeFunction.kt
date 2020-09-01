package app

import data.Company

fun main() {
    val company1 = Company("afaf")
    val company2 = Company("afaf")

    println(company1.hashCode())
    println(company2.hashCode())

    println(company1.hashCode()== company2.hashCode()) // true karena sudah mengeoverrida
    // hashcode menjadi return hashcodenya name di Object Company
}