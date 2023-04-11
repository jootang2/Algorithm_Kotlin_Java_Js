/**
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val S = sc.next()
    val ASCII = S[0].toChar().toInt()

    println(ASCII)
}