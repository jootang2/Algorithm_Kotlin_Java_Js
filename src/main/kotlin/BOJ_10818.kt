/**
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val array = ArrayList<Int>()
    for(i in 0 until N) {
        val number = sc.nextInt()
        array.add(number)
    }

    val min = array.min()
    val max = array.max()

    println("$min $max")

}