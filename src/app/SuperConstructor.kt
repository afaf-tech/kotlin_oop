package app

import data.Customer
import data.ExecutiveCustomer
import data.PremiumCustomer

fun main(args: Array<String>) {
    val Customer = Customer("Arya", "Biasa", 30000)
    //
    val premiumCustomer =PremiumCustomer("Fikri", 2200000)
    println(premiumCustomer.name)
    println(premiumCustomer.balance)

    val executiveCustomer = ExecutiveCustomer("Fikria", 1000000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}