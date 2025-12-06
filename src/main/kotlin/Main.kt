fun main() {
    val x = 11
    val y = 9

    println(x == y)     // false
    println(x > y)      // true
    println(x >= y)     // true

    val areNumbersTheSame = x == y
    println(areNumbersTheSame)

    println(x % 2 == 0)         // false

    println("Is y an even number? ${y % 2 == 0}")       //  false
}