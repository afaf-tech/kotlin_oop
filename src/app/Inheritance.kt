package app

import data.Manager
import data.VicePrecident

fun main(args: Array<String>) {
    val manager = Manager("fikri")
    manager.sayHello("Budi")
    val vice = VicePrecident("Fatih")
    vice.sayHello("Budi")
}