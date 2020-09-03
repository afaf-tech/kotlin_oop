package data

interface Base {
    fun sayLi(name:String)
}

class MyBase : Base{
    override fun sayLi(name: String) {
        println("Hello $name")
    }
}

// Delegasi Manual
//class MyBaseDelegate(val base: Base): Base{
//    override fun sayLi(name: String) {
//        base.sayLi(name)
//    }
//}

// Delegasi Otomatis Kotlin

class MyBaseDelegate(val base :Base) :Base by base
