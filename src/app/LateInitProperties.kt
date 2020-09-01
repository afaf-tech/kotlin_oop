package app

import data.Television

fun main(args: Array<String>) {
    val tv = Television()
    tv.initTelevision("Samsung")
    println(tv.brand)
}