package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any){
    if(any is Laptop){
        println("Laptop ${any.name}")
    }else if(any is HandPhone){
        println("Handphone is ${any.name}")
    }else{
        println(any)
    }
}

fun printString(any: Any){
    val value = any as? String // jika any tidak string maka akan error Exceptions
    // jika menggunakan ? maka jika ggal konversi akan menjadi null
    println(value)
}

fun printObjectWhen(any: Any){
    when (any) {
        is Laptop -> {
            println("Laptop ${any.name}")
        }
        is HandPhone -> println("Handphone is ${any.name}")
        else -> {
            println(any)
        }
    }
}
fun main(args: Array<String>) {
    printObjectWhen("Eko")
    printObjectWhen(1)
    printObjectWhen(Laptop("Apple Macbook"))
    printObjectWhen(HandPhone("Fujitsu"))

    printString("Err")
}