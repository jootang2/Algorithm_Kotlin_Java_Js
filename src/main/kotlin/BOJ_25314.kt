/**
 * 첫 번째 줄에는 문제의 정수 N이 주어진다.
 * 4 <= N <= 1000 (N은 4의 배수)
 * 혜아가 N 바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    var stringLong = ""
    for (i in 1..N/4) {
        stringLong += "long "
    }
    println(stringLong + "int")

}