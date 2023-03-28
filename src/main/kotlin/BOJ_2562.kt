/**
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다.
 * 주어지는 자연수는 100 보다 작다.
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val array = ArrayList<Int>()
    for(i in 0 until 9) {
        val number = sc.nextInt()
        array.add(number)
    }

    val max = array.max()
    val maxIndex = array.indexOf(max) + 1

    println("$max\n$maxIndex")

}