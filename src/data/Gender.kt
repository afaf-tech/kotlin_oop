package data

enum class Gender (val description:String){
    MALE("MALE"),
    FEMALE("FEMALE");

    fun showDescription(){
        println(description)
    }
}