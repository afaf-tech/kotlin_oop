package app

import data.Minus
import data.Operation
import data.Plus
import data.Modulo


fun operation(value1: Int, value2:Int, operation: Operation): Int{
    return  when(operation){
        is Plus -> value1+ value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}
fun main() {
    println(operation(3232,31212,Plus()))
    println(operation(3232,31212,Minus()))
    println(operation(3213123,31212,Modulo()))

}