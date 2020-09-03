package data

// cuma satu properties di inline class
// keuntungan = si kotllin tidak akan membuat object dari kelas inline
// jadi lebih ringan
inline class Token(val value:String) {
    fun toLower():String = value.toLowerCase()
}