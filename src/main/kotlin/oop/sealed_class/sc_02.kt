package oop.sealed_class

/**
 * @see <a href="https://kotlinlang.org/docs/sealed-classes.html#payment-method-handling">Kotlin Official Docs</>
 */
sealed class Payment {
    data class CreditCard(val number: String, val expiryDate: String) : Payment()
    data class PayPal(val email: String) : Payment()
    data object Cash : Payment()
}

fun processPayment(payment: Payment) {
    when (payment) {
        is Payment.CreditCard -> processCreditCardPayment(payment.number, payment.expiryDate)
        is Payment.PayPal -> processPayPalPayment(payment.email)
        is Payment.Cash -> processCashPayment()
    }
}
fun processCashPayment() {
    TODO("EXAMPLE")
}

fun processPayPalPayment(email: String) {
    TODO("EXAMPLE")
}

fun processCreditCardPayment(number: String, expiryDate: String) {
    TODO("EXAMPLE")
}
