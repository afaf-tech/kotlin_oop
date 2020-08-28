package data

class Address {
    var street: String = ""
    var city: String = ""
    var country : String = "Indonesia"

    // primary constructor
    constructor(paramStreet:String, paramCity: String){
        street = paramStreet
        city = paramCity
    }

    //secondary constructor
    constructor(paramStreet: String, paramCity: String, paramCountry:String) : this(paramStreet, paramCity){
        country = paramCountry
    }
}