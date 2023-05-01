class Rectangle(
    val a:Double,
    val b:Double
):Shape("Rectangle") {
    init {
        println("The $name is created with the $a and $b")
        println("The area of the $name ${area()}")
        println("The perimeter of the $name is ${perimeter()} \n")
    }

    fun area() = a * b
    fun perimeter() = 2 *(a + b)
}