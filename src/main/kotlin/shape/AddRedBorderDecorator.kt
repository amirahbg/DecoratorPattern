package shape

class AddRedBorderDecorator(
    private val shape: Shape
) : Shape by shape {

    override fun draw() {
        shape.draw()
        addRedBoarder()
    }

    private fun addRedBoarder() {
        println("Border Color: Red")
    }
}