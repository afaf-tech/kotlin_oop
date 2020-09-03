package data

class Boss (val bossName:String){
    inner class Employee(val name:String){
        fun hi(){
            println("Hi, im Employee $name, my boss is ${this@Boss.bossName}") //bossname = akses outer data
        }
    }
}