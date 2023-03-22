/**
 * 주어진 문자 제거
 */

fun removeString(target:Char, str: String): String {
    val n = str.length
    var newStr = ""
    for(i in 0 until n){
        if(str[i] != target) {
            newStr += str[i]
        }
    }
    return newStr
}

fun main() {
    println(removeString('A', "BCDABCDSAASC"))
}