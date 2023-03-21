/**
 * 모든 순열 생성
 */
import java.math.BigInteger
import java.util.Scanner

fun test(prefix: String, str: String) {
    val n = str.length

    if (n == 0) {
        println(prefix + " ")
    } else {
        for (i in 0 until n) {
            test(prefix + str[i], str.substring(i + 1, n) + str.substring(0, i))
        }
    }
}

fun main() {
    test("", "ABC")
}