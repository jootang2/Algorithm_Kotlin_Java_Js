/**
 * 문자 빈도수 세기
 */
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    val N = sc.next()
    val oldLength = input.length
    val newLength = input.replace(N,"").length

    println("N이 나온 횟수: ${oldLength - newLength}")
}