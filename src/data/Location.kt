package data

// kelas abstract tidak bisa dibuat objectnya
// cara membuatnya dengan membuat turunan classnya
// tanpa open keywoed karena sudah otomatis
abstract class Location(val name :String)

class City(name: String): Location(name)
class Country(name: String): Location(name)