package app

import data.Boss
import data.Employee

fun main() {
    val boss = Boss("Fikri")
    val employee = boss.Employee("Akmal")
    employee.hi()
}