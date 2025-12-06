import org.w3c.dom.css.Rect
import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(width = 5f, height = 7f)
    val circle = Circle(radius = 5f)

    rect1.inc()

    println(rect1.counter)      //1
}

fun sumAreas (vararg shapes: Shape): Double {
    return shapes.sumOf {
        item -> item.area.toDouble()
    }
}

abstract class Shape {
    var counter = 0

    abstract val area: Float
    abstract val circumference: Float

    fun inc() {
        counter++
    }
}


//muốn một class có thể được kế thừa mà không phải là abstact class thì dùng open class (không ai dùng)
//open class Shape {
//    var counter = 0
//
//    open val area: Float = 0f
//    open val circumference: Float = 0f
//
//    fun inc() {
//        counter+=
//    }
//}


data class Rectangle (val width: Float, val height: Float): Shape() {
    val diagonal = sqrt(width * width + height * height)

    override val area = width * height

    override val circumference = 2 * width + 2 * height
}

data class Circle (val radius: Float): Shape() {
    override val area = radius * radius * PI.toFloat()

    override val circumference = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}