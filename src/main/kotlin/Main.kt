fun main() {
    println("Please enter a number:")
    val input = readln()

    val inputAsInteger = input.toIntOrNull()?.rem(2)?.equals(0)
    // if not null => % 2 => not null => == 0 ?

    println("Is even: $inputAsInteger")
}