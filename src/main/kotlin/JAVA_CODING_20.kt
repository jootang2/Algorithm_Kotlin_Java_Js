import kotlin.collections.ArrayList

/**
 * 같은 문자열 n번 이어 붙이기
 */

fun repeatString(str: String, number: Int): String {
    var newStr = ""
    for (i in 0 until number){
        newStr += str
    }

    return newStr
}

fun main() {
    println(repeatString("ABC", 5))
}