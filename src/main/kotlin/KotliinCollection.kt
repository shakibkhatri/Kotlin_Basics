//Class Kotlin Collection

    fun main(args: Array<String>){

            //hashMap
            //Hash maps are sort of like a list of pairs, where the first value acts as a key.

//            val map = hashMapOf("Shakib" to "khatri", "germany" to "Europe")
//            println(map.get("Shakib"))       // we can use [] instead of .get function
//            println(
//                map.getOrDefault(
//                    "kuch bhi",
//                    "no such thing in this map"
//                )
//            )  // If a key isn't in the map use this method
//            println(
//                map.getOrElse("germany", { "There is nothing like this" }) //use this function if you don't want to use default value

            //MutableHashMap
            //This similar to mutableList A mutable map lets you put and remove items.
            // Mutable just means able to change, immutable means unable to change.

            //    var mutmap = mutableMapOf("tank" to 1, "pipe" to 2)
            //    mutmap.put("tape", 3)
            //    println(mutmap.toString())
            //    mutmap.remove("tank", 1)
            //    println(mutmap.toString())

                                          //const vs. val

       // The value for const val is determined at compile time,
    // whereas the value for val is determined during program execution,
    // which means, val can be assigned by a function at run time.
    // That means val can be assigned a value from a function, but const val cannot.

        //FUNCTION OVERLOADING

        val list = listOf<Int>(1, 2, 3, 4, 5)
        val array = arrayOf(1, 2, 3, 4, 5)

        println("List: $list")
        overLoad(array)
    }

    fun overLoad(list: List<Int>){
        var i = 0
        var j = list.size-1
        var flag = true
        while (i >= j){
            if (flag){
                println(list[i])
                i++
            }else{
                println(list[j])
                j--
            }
            flag = !flag
        }

    }

    fun overLoad(array: Array<Int>){
        var i = 0
        var j = array.size-1
        var flag = true
        while (i <= j){
            if (flag){
                println(array[i])
                i++
            }else{
                println(array[j])
                j--
            }
            flag = !flag
        }

    }



