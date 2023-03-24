import java.security.KeyStore
import java.security.KeyStore.Entry
import java.util.*
import java.util.regex.Pattern
import kotlin.Comparator
import kotlin.collections.ArrayList

/**
 * 문자열 내 부분 문자열 빈도수 세기
 * 경우 1: 111에 11은 1번 나온다.
 * 경우 2: 111에 11은 2번 나온다.
 */

fun countStringinSring(part: String, str: String): Int {
    val pattern = Pattern.compile(part)
    val matcher = pattern.matcher(str)

    var position = 0
    var count = 0

    while(matcher.find(position)) {
        position = matcher.start() +1
        count ++
    }

    return count
}


fun main() {
    println(countStringinSring("ABC", "ABCWERTSDF"))
}