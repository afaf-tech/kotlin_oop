package data

class Person{
    var firsName : String = ""
    var middleName : String? = null
    var lastName :String = ""

    // var is mutable jadi aman


    // function
    fun sayHello(name: String){
        println("HEllo $name, MyName is $this.firsName")
    }

    // overloading function with different parameters
    fun sayHello(firstName: String, lastNameParam: String){
        println("HEllo $firstName $lastNameParam, MyName is $this.firsName")
    }

    fun run(){
        println("I'm running")
    }

    fun getFullName(): String{
        return "$firsName $middleName $lastName"
    }
}