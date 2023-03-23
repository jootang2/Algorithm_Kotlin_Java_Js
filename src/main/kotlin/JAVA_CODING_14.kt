import java.security.KeyStore
import java.security.KeyStore.Entry
import java.util.*
import kotlin.Comparator

/**
 * 빈도 수가 가장 높은 문자 찾기
 */

fun findMostFrequency(str: String): Char {
    val map = mutableMapOf<Char, Int>()
    for (i in str.indices) {
        map.merge(str[i], 1){ value, _ -> value + 1}
    }
    var maxKey = str[0]
    for(key in map.keys) {
        if(map[key]!! > map[maxKey]!!) {
            maxKey = key
        }
    }
    return maxKey
}

fun main() {
    println(findMostFrequency("AABBBCCCCDDDDD"))
}