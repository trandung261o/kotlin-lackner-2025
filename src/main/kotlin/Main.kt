fun main() {
    print("Amount of numbers: ")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var i = 0
    var sum = 0

    val numbers1 = mutableListOf<Int>()
    val numbers2 = mutableListOf<Int>()


    while (i < amountOfNumbers) {
        print("Number ${i+1}: ")
        val number = readln().toIntOrNull() ?: continue
        numbers1.add(number)
        sum += number
        i++
    }

    println("Loop with for case:")
    var j = 0
    for (j in 0 until amountOfNumbers) {
        print("Number ${j+1}: ")
        val number = readln().toIntOrNull() ?: continue
        numbers2.add(number)
    }

    println("Your sum is: $sum")
    println("Your numbers1 list is: $numbers1")

    println("Your numbers2 list is:");
    for (number in numbers2) {
        println(number)
    }

    print("Enter a string: ")
    val input = readln()

    for (character in input) {
        println(character)
    }

    val finalString = buildString {
        for (i in input.lastIndex downTo 0) {
            append(input[i])
        }
    }

    println(finalString)
}