package data

class Applications (val name:String){

    companion object {
        fun toUpper(name:String):String{
            return name.toUpperCase()
        }
    }
}