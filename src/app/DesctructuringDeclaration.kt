package app

import data.Game
import data.Login
import data.MinMax
import kotlin.math.log

fun minmax(val1:Int, val2:Int): MinMax{
    return when{
        val1 >val2 -> MinMax(val2, val2)
        else -> MinMax(val1, val2)
    }
}

fun login (login:Login, callback:(Login)-> Boolean):Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Game POP", 1000000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game
    println(name)
    println(price)


    // for function

//    val result = minmax(10,1000)
//    val min = result.min
//    val max = result.max

    // disingkat
    // _ (uderscore) untuk value yang tidk dipakai
    val (min, _max) = minmax(10,1000)
    println(min)
//    println(max)

    val login = Login("eko", "rahasia")
//    login(login){login->
//        login.username =="eko" && login.password == "rahasia"
//    } // konvensional

    // destructuring lambda
    val a =login(login){ (username, password)->
        username== "eko" && password == "rahasia"
    }

    println(a)

}