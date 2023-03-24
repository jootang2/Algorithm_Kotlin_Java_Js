import java.security.KeyStore
import java.security.KeyStore.Entry
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

/**
 * 문자열이 부분 문자열을 포함하는지 검사
 */
fun isContain (part:String, str:String) : Boolean {
    return str.contains(part)
}

fun main() {
    println(isContain("ABC", "ABCWERTSDF"))
}