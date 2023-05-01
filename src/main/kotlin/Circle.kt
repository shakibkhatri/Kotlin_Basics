class Circle(
    val radius:Double
):Shape("Circle") {
    val pi = 3.14
    init {
        println("The area of the $name is created with $radius")
        println("Radius of the $name is ${area()}")
        println("perimeter of the $name is ${perimeter()}\n")
    }

    fun area() = pi * radius * radius

    fun perimeter() = 2 * radius * pi
}