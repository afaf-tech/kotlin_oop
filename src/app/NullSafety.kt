package app

data class Friend(val name:String)

fun sayHello(friend: Friend?){
//    if(friend != null) println("Hello ${friend?.name}") // cek null biasa
//    println("Hello $friend.name")

//    val name = friend?.name ?: "" // elvis operator ?:
//    println("Hello $name")
        val name = friend!!.name // akan diexception jika null
        println("Hello $name")

}

fun main() {
    sayHello(Friend("Fikri"))
//    sayHello(null) // akan error jika ada !!
}