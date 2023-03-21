/**
 * 문자열 회문 검사
 */
import java.math.BigInteger
import java.util.Scanner

fun palindrome(str: String): Boolean {
    return str.reversed() == str
}

fun main() {
    if(palindrome("ABCDCBA")){
        println("palindrome")
    } else {
        println("not palindrome")
    }
}