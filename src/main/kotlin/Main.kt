fun main() {
    println("Please enter a number:")
    val input = readln()

    val inputAsInteger = input.toInt() // input == string => error

    val isEven = inputAsInteger % 2 == 0

    println("You've entered a number: $input")

    println("Is the number even? $isEven")
}