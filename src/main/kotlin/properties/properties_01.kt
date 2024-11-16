package properties

data class Address (
    var name: String = "Holmes, Sherlock",
    var street: String = "Baker",
    var city: String = "London",
    var state: String? = null,
    var zip: String = "123456",
)

fun Address.changeAddress() {
    name = "Gilldong Hong"
    street = "Somewhere"
    city = "Hanyang"
    state = "Chosun"
    zip = "Unkown"
}

fun main() {
    val addr = Address()
    println(addr)

    addr.changeAddress()
    println(addr)
}
