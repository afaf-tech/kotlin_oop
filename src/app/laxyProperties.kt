package app

import data.Account

fun main() {
    val account = Account()
    // lazy dieksekusi ketika dipanggil
    println(account.name)
    println(account.name)
    println(account.name)
}