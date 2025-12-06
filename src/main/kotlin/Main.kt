import org.w3c.dom.css.Rect
import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(width = 5f, height = 7f)
    val circle = Circle(radius = 5f)

    println(greetMe(Country.GERMANY))
    println(greetMe(Country.FRANCE))
    println(greetMe(Country.USA))

    for (country in Country.entries) {
        println(country.code)
    }
}

fun sumAreas (vararg shapes: Shape): Double {
    return shapes.sumOf {
        item -> item.area.toDouble()
    }
}

enum class Country (val code: String) {
    GERMANY("DE"), FRANCE("FR"), USA("US")
}

fun greetMe (country: Country): String {
    return when (country) {
        Country.GERMANY -> "Guten Tag!"
        Country.FRANCE -> "Bonjour!"
        Country.USA -> "Hello"
    }
}

sealed interface Shape {
    val area: Float
    val circumference: Float
}

fun printShapes(vararg shapes: Shape) {
    for (shape in shapes) {
        val output = when (shape) {
            is Circle -> "Yo that's a circle!"
            is Rectangle -> "That's a rect!"
//            else -> null      // sealed class => compiler biet chinh xac co bao nhieu TH con => khong can thiet
        }
        println(output)
    }
}

data class Rectangle (val width: Float, val height: Float): Shape {
    val diagonal = sqrt(width * width + height * height)

    override val area = width * height

    override val circumference = 2 * width + 2 * height
}

data class Circle (val radius: Float): Shape {
    override val area = radius * radius * PI.toFloat()

    override val circumference = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}