fun main() {
    val favoriteNumbers = intArrayOf(1, 2, 3, 69)

    favoriteNumbers[2] = 26

    println(favoriteNumbers[0])
    println(favoriteNumbers[1])
    println(favoriteNumbers[2])
    println(favoriteNumbers[3])
    println(favoriteNumbers.getOrNull(4))

    println("Enter your index: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null && inputAsInteger in 0..favoriteNumbers.lastIndex) {
        println("Your number is ${favoriteNumbers[inputAsInteger]}")
    } else {
        println("That index doesn't exist")
    }

}