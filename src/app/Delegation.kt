package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayLi("Fikri")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayLi("Joko")
}