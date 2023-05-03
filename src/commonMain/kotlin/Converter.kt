import kotlin.random.Random

val pricePerDoubloon = Random.nextDouble(.75, 1.5)

fun convertCurrency(){
    output("The current exchange rate is ${pricePerDoubloon.formatAsCurrency()} per doubloon")

    val input = getInput("How many doubloons do you want?")
    val numberOfDoubloons = input.toDoubleOrNull()

    if (numberOfDoubloons==null){
        output("Sorry, I don't know how many that is")
    } else{
        val cost = pricePerDoubloon*numberOfDoubloons
        output("$numberOfDoubloons doubloons will cost you ${cost.formatAsCurrency()}")
    }
}