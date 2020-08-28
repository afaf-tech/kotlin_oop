package data

class Person{
    var firsName : String = ""
    var middleName : String? = null
    var lastName :String = ""

    // var is mutable jadi aman


    // function
    fun sayHello(name: String){
        println("HEllo $name, MyName is $firsName")
    }

    // overloading function with different parameters
    fun sayHello(firstNameParam: String, lastNameParam: String){
        println("HEllo $firstNameParam $lastNameParam, MyName is $firsName")
    }

    fun run(){
        println("I'm running")
    }

    fun getFullName(): String{
        return "$firsName $middleName $lastName"
    }
}