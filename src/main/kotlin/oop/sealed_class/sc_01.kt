package oop.sealed_class

/**
 * @see <a href="https://kotlinlang.org/docs/sealed-classes.html#state-management-in-ui-applications">Kotlin Official Docs</>
 */
sealed class UIState {
    data object Loading : UIState()
    data class Success(val data: String) : UIState()
    data class Error(val exception: Exception) : UIState()
}

fun updateUI(state: UIState) {
    when(state) {
        is UIState.Loading -> showLoadingIndicator()
        is UIState.Success -> showData(state.data)
        is UIState.Error -> showError(state.exception)
    }
}
fun showError(exception: Exception) {
    TODO("EXAMPLE")
}

fun showData(data: String) {
    TODO("EXAMPLE")
}

fun showLoadingIndicator() {
    TODO("EXAMPLE")
}
