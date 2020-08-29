package app

import data.Rectangle

fun main(args: Array<String>) {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")
    rectangle.printName()
}