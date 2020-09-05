package app

import data.Student

fun main() {
    val student = Student("Akmal", 16)
    val result: String = student.let {
        println(it.name)
        println(it.age)
        "nama ${it.name}"
    }

    val result2: String = student.run{
        "Name ${this.name}, Age ${this.age}"
    }

    val result3: Student = student.apply{
        "Name ${this.name}, Age ${this.age}"
    }

    val result4: Student = student.also{
        "Name ${it.name}, Age ${it.age}"
    }

    val result5: String = with(student){
        "Name ${this.name}, Age ${this.age}"
    }



    println(result)
    print("result2  ")
    println(result2)
    print("result3  ")
    println(result3)
    print("result4  ")
    println(result4)

}