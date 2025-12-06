fun main() {
    print("Enter a string: ")
    val input = readln().toInt()

    println(input + input.reversed())

    val reversed = input.reversed()

    println(reversed)

    if (input == reversed) {
        println("That's a palindrome!")
    }
}

fun String.reversed(): String {
    val finalString = buildString {
        for (i in this@reversed.lastIndex downTo 0) {    //for (i in lastIndex downTo 0) => cung chap nhan duoc
            append(this@reversed[i])
        }
    }

    return finalString
}

//fun reversed(string: String): String {
//    val finalString = buildString {
//        for (i in string.lastIndex downTo 0) {    //for (i in lastIndex downTo 0) => cung chap nhan duoc
//            append(string[i])
//        }
//    }
//
//    return finalString
//}

fun Int.reversed(): Int {
    return this.toString().reversed().toInt()
}

//fun reversed(number: Int): Int {
//    return number.toString().reversed().toInt()
//}