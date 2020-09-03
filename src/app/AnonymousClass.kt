package app

import data.Action

fun fireAction(action:Action){
    action.action()
}

fun main() {
    fireAction(object : Action{
        override fun action() {
            println("Action1")
        }
    })

    fireAction(object : Action{
        override fun action() {
            println("Action2")
        }
    })
}