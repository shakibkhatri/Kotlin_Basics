
import java.util.Scanner
import kotlin.math.max
import kotlin.math.min


fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)
    //  var var1:String = Scanner.nextLine()
//    var a:Int = 7
//    var b:Int = 5
//    // var sum: String = var1.reversed()
//    //println(sum)
//
//    var x :Int = 2
//    var y :Int = 8
//    println( a == b || x != y)

    // Palindrom string

//    val str: String = Scanner.nextLine()
//
//    if(str.reversed() == str){
//        println("The String is palindrom")
//    }else{
//        println("It is not a palindrom string")
//    }

//    println("Enter your Age ")
//    val age:Int = Scanner.nextInt()
//
//    if(age < 18){
//        print("You are not an adult yet!")
//    }else if (age >= 18 && age <=55 ){
//        println("You are an adult")
//    }else(println("You are too old"))


//    var arr = arrayOf("shakib", "akib", "riyaz")
//    var arrlength = arr.size
//
//    var i = 0
//    while (arrlength > i ){
//        println(arr[i])
//        i++
//    }

//    println("Enter a number")
//    var num = Scanner.nextInt()
//
//    while (num >= 0){
//        println(num)
//        num--
//    }

//    println("Enter first number")
//    var num1 = Scanner.nextInt()
//    println("Enter second number")
//    var num2 = Scanner.nextInt()
//
//    var num = num2
//    var pwr = 1
//    while (num2 != 0) {
//        pwr = pwr * num1
//        num2--
//    }
//    println("Power of $num1 and $num is $pwr")

//    var arr = arrayOf(1, 4, 5, 6, 7, 10, 5, 3)
//    var max = arr[0]
//
//    for (i in arr){
//        if (i > max)
//            max = i
//    }
//    println(max)

//    var arr = arrayOf(1, 4, 5, 6)
//    var sum = 0
//
//    for (i in arr){
//       sum = sum + i
//    }
//    println(sum)

//    println("Enter 5 numbers")
//    var nums =5
//    var sum =0
//    var avr =0
//
//    for (i in 1..nums){
//        var nums = Scanner.nextInt()
//        sum += nums
//    }
//
//    avr = sum/5
//    println("Average of value is $avr")

//    // Sum of first 10 natural numbers
//    var sum = 0
//    for(i in 1..10){
//        sum += i
//    }
//    println(sum)

    // Multiplication of a number
//    var num:Int
//    println("Write a number to get the table")
//     num = Scanner.nextInt()
//    for (i in 1..10){
//        var tbl = num * i
//        println( tbl )
//    }

//    //Factorial
//    var facto:Int =1
//    println("Write a number to get the factorial")
//      var num:Int = Scanner.nextInt()
//
//    for(i in num downTo 1){
//        facto = facto * i
//    }
//    println(facto)

    //Power of a number using for loop
//    var pwr:Int = 1
//    println("Write first number")
//      var num1:Int = Scanner.nextInt()
//    println("Write Second number")
//      var num2:Int = Scanner.nextInt()
//
//    for (i in num2 downTo 1){
//        pwr = pwr * num1
//    }
//    println(pwr)

    //sum of even and odd integers
//    var evensum:Int=0
//    var oddsum:Int=0
//    var choice:Char
//    do {
//        println("Write numbers")
//        var num:Int = Scanner.nextInt()
//
//        if (num%2 == 0){
//            evensum += num
//        }else{
//            oddsum += num
//        }
//        println("Do you want to continue press y/n")
//         choice = Scanner.next().single()
//    }while (choice == 'y' || choice == 'Y')
//    println("Sum of even numbers is $evensum")
//    println("sum of odd numbers is $oddsum")

    //Prime number
//    println("Write numbers")
//        var num:Int = Scanner.nextInt()
//    if (num % 2 != 0){
//        println("$num is a prime number")
//    }else{
//        println("$num is not a prime number")
//    }

    //shows positive negative zeros and max min
//    var pst:Int=0
//    var ngt:Int=0
//    var zro:Int=0
//    var lrgt:Int= Int.MIN_VALUE
//    var smlt:Int= Int.MAX_VALUE
//    var num:Int
//    var choice:Char
//    do {
//        println("Enter a number")
//        num = Scanner.nextInt()
//        if (num > 0){
//            pst++
//        }else if (num < 0){
//            ngt++
//        }else{
//            zro++
//        }
//
//            if (num > lrgt){
//                lrgt = num
//            }else if(num < smlt){
//                smlt = num
//            }
//
//        println("do you want to continue y/n")
//        choice = Scanner.next().single()
//    }while (choice == 'y' || choice == 'Y')
//    println(" positive numbers: $pst ")
//    println(" negative numbers: $ngt ")
//    println(" zeros: $zro ")
//    println(" largest number: $lrgt")
//    println(" smallest number: $smlt")


    // Fibonacci number
//    var a:Int=0
//    var b:Int=1
//    var c:Int
//    println("Enter the number to get the fibonacci number")
//    var num = Scanner.nextInt()
//    print("$b ")
//    for (i in num downTo 2){
//        c = a + b
//        print("$c ")
//        a = b
//        b = c
//    }

//    var num = mutableListOf<Int>()
//    var res:Int = 0
//    println("Write 5 numbers")
//    for (i in 1..5){
//        res = Scanner.nextInt()
//         num.add(res)
//    }
//    num.reverse()
//    println("The numbers in reverse order are $num")

    // Fibonacci series
//    var list = mutableListOf<Int>(0, 1)
//    println("Write numbers greater than 1 to get fibonacci series")
//    var num = Scanner.nextInt()
//    for (i in 2..num-1 ){
//        list.add(list[i-2] + list[i-1])
//    }
//    println(list)

    //WHEN

    //Greetings in different countries

//    println("Where are you From!")
//    var cou:String = Scanner.nextLine()
//
//    when(cou){
//        "India" -> println("Namaste")
//        "Russia" -> println("Privet")
//        "USA" -> println("Hello")
//        "Germany" -> println("Hallo")
//        else -> println("I don't know this country")
//
//    }

    // Functions

    //sum of 1 to n numbers
//    sum(1,5)
//}
//fun sum(firstnum: Int, lastnum:Int){
//    var res:Int = 0
//    for (i in firstnum..lastnum ){
//        res += i
//    }
//    println("The sum of the values from $firstnum to $lastnum is $res")
//}

    //index of the numbers
//    val list = listOf(2, 4, 5, 6, 8, 3, 1, 9)
//    println("The list looks like the following $list")
//    println("Search for this number")
//    var lis = Scanner.nextInt()
//    println("The index of $lis is ${showList(list,lis)}")
//
//
//}
//
//fun showList(list: List<Int>, value:Int):Int{
//    for (i in 0..list.size-1){
//        if (list[i] == value){
//            return i
//        }
//    }
//    return -1

    // Alternative sum using vararg function
//    var res = alternatingSum(3, 5 ,4, 7, 8, 6, 10, 2)
//    println("The alternating Sum is $res")
//
//}
//
//fun alternatingSum(vararg numbers :Int):Int{
//    var res:Int=0
//    var flag = true
//    for (i in numbers){
//        if (flag){
//            res += i
//        }else{
//            res -= i
//        }
//        flag = !flag
//    }
//    return res

    // product of the integers using EXTENSION FUNCTION

    var num = listOf(2, 3, 5, 6, 3, 6)
    println("The product of $num is ${num.productof()}")


}

fun List<Int>.productof():Int{
    var res:Int = 1
    for (i in this){
        res *= i
    }
    return res
}