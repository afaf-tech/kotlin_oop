package program

import annotations.Fancy

@Fancy("Fikri")
class MyApplication (val name:String, val version:Int){

    fun info():String = "Application $name -$version"
}