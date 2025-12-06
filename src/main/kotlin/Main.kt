fun main() {
    println("Please enter a number:")
    val input = readln()

//    throw Exception("Dude, wtf did you pass there?!")

    val inputAsInteger = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        0
    }

    val output = when (inputAsInteger) {
        null -> "Dude, enter a valid number!"
        3 -> "The number is three!"
        5 -> "The number is five!"
        in 10..20 -> "The number is between 10 and 20"
        else -> "I have no idea what to print!"
    }

    println(output)
}