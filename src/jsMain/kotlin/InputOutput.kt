import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.dom.append
import kotlinx.html.*

actual fun output(message: String) {
    val body = checkNotNull(document.body){
        "could not locate the <body> tag"
    }
    body.append{
        p { +message}
    }
    println(message)
    window.alert(message)
}
actual fun getInput(prompt: String): String{
    val body = checkNotNull(document.body){
        "could not locate the <body> tag"
    }
    val input = window.prompt(message = prompt, default = "")?: ""
    body.append{
        p {
            em{ +prompt}
            + " "
            strong { +input }
        }
    }
    return input
}