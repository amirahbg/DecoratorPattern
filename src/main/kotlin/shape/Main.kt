package shape

fun main() {
    val circle = Circle()
    val rectangle = Rectangle()
    val redBorderedCircle = AddRedBorderDecorator(circle)
    val redBorderedRectangle = AddRedBorderDecorator(rectangle)

    circle.draw()
    redBorderedCircle.draw()
    rectangle.draw()
    redBorderedRectangle.draw()
}