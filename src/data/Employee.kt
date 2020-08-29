package data


// open di class arti = boleh diwariskan
open public class Employee(val name:String) {

    // open di function arti = boleh dioverride di class turunan
    // header harus sama di descendant
    open fun sayHello(name:String){
        println("HEllo $name, nama saya ${this.name}")
    }
}


open class  Manager(name: String): Employee(name) {
    // defaultnya adalah open
    // untuk membuat tidak bisa dioverride lagi gunakan kata kunci final
    open override fun sayHello(name:String){
        println("HEllo $name, nama saya manager ${this.name}")
    }
}

class  SuperManager(name: String) : Manager(name){
    override fun sayHello(name: String){
        println("super Manager")
    }
}
class  VicePrecident(name: String): Employee(name){

    override fun sayHello(name:String){
        println("HEllo $name, nama saya Vice ${this.name}")
    }
}