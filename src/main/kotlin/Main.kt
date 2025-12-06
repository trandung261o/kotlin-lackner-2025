import org.w3c.dom.css.Rect
import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(width = 5f, height = 7f)
    val rect2 = Rectangle(width = 6f, height = 8f)
    val rect3 = rect1


    val rect4 = RectangleData(width = 4f, height = 5f)
    val rect5 = RectangleData(width = 4f, height = 5f)
    val rect6 = rect5.copy(
        height = 10f       //copy tat ca ngoai tru height = 10f
    )

    println(rect1.width)
    println(rect1.height)

    println("The diagonal of rect1 is: ${rect1.diagonal}. The area is: ${rect1.area}")
    println("The diagonal of rect2 is: ${rect2.diagonal}. The area is: ${rect2.area}")

    println("The max area is: ${maxArea(rect1, rect2)}")

    println(rect1 == rect2)     // false => khong phai data class
    println(rect3 == rect1)     // true

    println(rect4 == rect5)     // true => data class

    println("Data of rect4 is: ${rect4}")              //user readable

    println("Data of rect6 is: ${rect6}")

    val circle = Circle(radius = 5f)

    println("Circle area: ${circle.area}")
}

fun maxArea(rect1: Rectangle, rect2: Rectangle): Float {
    val area1 = rect1.area
    val area2 = rect2.area

    return maxOf(area1, area2)
}

class Rectangle (val width: Float, val height: Float) {
    val diagonal = sqrt(width * width + height * height)

    val area = width * height
}


data class RectangleData (val width: Float, val height: Float) {

}

data class Circle (val radius: Float) {
    val area = radius * radius * PI

    val diameter = 2 * radius
}