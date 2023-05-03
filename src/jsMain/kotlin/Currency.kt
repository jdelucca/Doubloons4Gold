private val userLocale: String
    get() = js("navigator.language") as String? ?: "en-US"

actual fun Double.formatAsCurrency(): String {
    val numberFormatter = Intl.NumberFormat(
        locale = userLocale,
        options = object {
            @JsName("style") val style = "currency"
            @JsName("currency") val currency = "USD"
        }.asDynamic()
    )

    return numberFormatter.format(this)
}