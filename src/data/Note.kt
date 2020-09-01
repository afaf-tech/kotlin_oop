package data

class Note (title: String){

    var title:String = title
        get() {
            println(" Call Getter Function")
            return field
        }
        set(value) {
            println(" Call setter Function")
            if(value.isNotBlank()){
                field = value
            }
        }
        //        get() = field
}

class BigNote(val title:String) {
    val bigTitle: String
        get() = title.toUpperCase()
}