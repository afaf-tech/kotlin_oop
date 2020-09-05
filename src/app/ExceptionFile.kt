package app

import exception.ValidationException
import java.lang.NullPointerException

fun validateAndSayHi(name:String){
    if (name.isBlank()){
        throw ValidationException("name is blank")
    }else{
        println("Hello $name")
    }
}


fun main() {
   try {
       validateAndSayHi("Fikri")
       validateAndSayHi("") // ketika error disini maka program tidak
       // akan dilanjtkan
       println("Program")
   }catch (error: ValidationException){
       println("Terjadi Error ${error.message}")
   }catch (error: NullPointerException){
       println("Terjadi Null ${error.message}")
   }finally {
       println("Finally will always be executed.")
   }
}