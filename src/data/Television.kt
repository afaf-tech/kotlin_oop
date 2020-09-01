package data

class Television {
    lateinit var brand:String // lateinit allow membuat object tanpa mnyertakan
    // properties brand diawal tapi jika memanggil properties tanpa mengisi dulu
    // maka akan error di RUn TIme

    fun initTelevision(brand: String){
        this.brand = brand
    }
}