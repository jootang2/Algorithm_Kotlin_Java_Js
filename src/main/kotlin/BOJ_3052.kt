/**
 * 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다.
 *
 * 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val set = mutableSetOf<Int>()
    for (i in 0 until 10) {
        val number = sc.nextInt()
        set.add(number % 42)
    }
    println(set.size)
}