package data

class User(val username: String, val password: String) {

    override fun toString(): String {
        return "User with username=$username"
    }
}