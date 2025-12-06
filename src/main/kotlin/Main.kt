fun main() {
    val x = 12
    val y = 9

    val areBothEven = x % 2 == 0 && y % 2 == 0
    val atleastOneEven = x % 2 == 0 || y % 2 == 0



    println("Are both even? $areBothEven")
    println("Are atleast one even? $atleastOneEven")
}