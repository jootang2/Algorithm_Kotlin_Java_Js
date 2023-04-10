/**
 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
 * 둘째 줄에 세준이의 현재 성적이 주어진다.
 * 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 * 첫째 줄에 새로운 평균을 출력한다.
 * 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-2 이하이면 정답이다.
 */
import java.util.Scanner;
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val array = arrayOfNulls<Float>(N)
    for (i in 0 until N) {
        val point = sc.nextInt()
        array[i] = point.toFloat()
    }
    array.sort()
    val max = array[array.size - 1]!!

    for (i in array.indices) {
        array[i] = array[i]!! / max * 100
    }
    var sum: Float = 0f
    for (i in array) {
        sum += i!!
    }

    println(sum / N)

}