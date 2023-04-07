/**
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 * 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
 * 방법은 i j로 나타내고,
 * 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다.
 * 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
 *
 * 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val M = sc.nextInt()
    val array = arrayOfNulls<Int>(N)
    for(i in array.indices){
        array[i] = i+1
    }
    for(i in 0 until M){
        val startNumber = sc.nextInt()
        val endNumber = sc.nextInt()
        array.reverse(startNumber-1, endNumber)
    }
    for (i in array) {
        println(i)
    }
}