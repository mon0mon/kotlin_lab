package generic

open class Message(
    open val value: String,
    open val type: String = "Default",
)

class SMS(value: String) : Message(value, "SMS")

class MMS(value: String) : Message(value, "MMS")

fun <T : Message> printMessage(message: T) = println("[${message.type}] ${message.value}")

fun main() {
    val message = Message("TEST")
    val sms = SMS("Hello")
    val mms = MMS("World!")

    printMessage(message)
    printMessage(sms)
    printMessage(mms)
}