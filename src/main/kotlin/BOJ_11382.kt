import java.util.Scanner

/**
 * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.
 * A+B+C의 값을 출력한다.
 */
fun main() {
    val sc = Scanner(System.`in`)

    val input1= sc.nextLong()
    val input2 = sc.nextLong()
    val input3 = sc.nextLong()

    println(input1 + input2 + input3)
}