fun main() {
    print("Enter a string: ")
    val input = readln()

    val reversed = reversed(stringToReverse = input)    // = reversed(input)

    println(reversed)

    if (input == reversed) {
        println("That's a palindrome!")
    }
}

fun reversed(stringToReverse: String = "hello world!"): String {
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }

    return finalString
}