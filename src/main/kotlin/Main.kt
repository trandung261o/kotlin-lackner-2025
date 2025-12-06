fun main() {
    print("Enter a string: ")
    val input = readln()

    val favoriteNumbers = intArrayOf(1, 2, 3, 69)

    val evenNumbers = favoriteNumbers.filter {
        item -> item % 2 == 0       // it % 2 == 0: cung duoc
    }

    val squareNumbers = favoriteNumbers.map {
        item -> item * item
//        it * it
    }

    println(evenNumbers)

    println(squareNumbers)

    var lettersOnly = input.filter {
        item -> item.isLetter()
//        it.isLetter()
    }

    println(lettersOnly)

    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }

    println(input.filter(lambda))

    println(input.myFilter {
        it.isLetter()
    })
}

fun String.myFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@myFilter) {
            if (predicate(char)) {
                append(char)
            }
        }
    }
}