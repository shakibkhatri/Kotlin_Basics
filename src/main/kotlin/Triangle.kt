import kotlin.math.sqrt

class Triangle(
    val a:Double,
    val b:Double,
    val c:Double
): Shape("Triangle") {
    init {
        println("The $name is created with a = $a, b = $b and c = $c")
        println("The area of $name is ${area()} ")
        println("The perimeter of $name is ${perimeter()}\n")
    }

    fun perimeter() = a + b + c
    fun area() =  sqrt((perimeter()/2)*((perimeter()/2)-a)*((perimeter()/2)-b)*((perimeter()/2)-c))



}