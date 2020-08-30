package app

import data.SmartPhone

fun main(args: Array<String>) {
    val smartPhone = SmartPhone("Samsung s10", "Android")
    println(smartPhone.toString())
    println(smartPhone.hashCode())
}