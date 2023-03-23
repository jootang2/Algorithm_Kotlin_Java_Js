import java.security.KeyStore
import java.security.KeyStore.Entry
import java.util.*
import kotlin.Comparator

/**
 * 주어진 문자 제거
 */

fun removeCharacter(str:String, char: String) : String {
    return  str.replace(char, "")
}

fun main() {
    println(removeCharacter("ABCDEFGABC", "A"))
}