open class Shape(
    var name:String
) {
    init {
        println("Super Class")
    }
    fun changeName(newName: String){
        name = newName
    }
}