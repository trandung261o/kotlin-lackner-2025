fun main() {
    println("Please enter a number:")
    val input = readln()

    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
//        val output = when {
//            inputAsInteger % 2 == 0 -> "The number is even!"
//            inputAsInteger < 10 -> "The number is odd and less than 10"
//            else -> "The number is odd and at least 11"
//        }

        val output = when (inputAsInteger) {
            null -> "Dude, enter a valid number!"
            3 -> "The number is three!"
            5 -> "The number is five!"
            in 10..20 -> "The number is between 10 and 20"
            else -> "I have no idea what to print"
        }

        println(output)

    } else {
        println("Dude, enter a valid number!")
    }

}