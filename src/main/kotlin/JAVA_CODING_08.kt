/**
 * 문자열에서 여백 제거
 */
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    println(input.replace(" ", ""))
}