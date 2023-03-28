import kotlin.collections.ArrayList

/**
 * 들여쓰기 적용
 */

fun indent(str: String, space:Int) : String{
    var blank = ""
    for(i in 0 until space) {
        blank += " "
    }
    return blank + str
}

fun main() {
    println(indent("TEST", 5))
    println("==================")
    val days = arrayOf("Mon","Tue","Wednesday","ThursDay","Friday","SaturDay")
    for(i in days.indices){
        println(indent(days[i], i))
    }
}