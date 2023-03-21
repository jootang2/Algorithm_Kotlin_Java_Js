/**
 * 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
 * 둘째 줄에는 정수가 공백으로 구분되어져있다.
 * 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
 * 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 * 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`) // 입력받을수 있게하는 함수 Scanner
    val N = sc.nextInt() // 정수의 개수
    val numberList = ArrayList<Int>() // 정수를 보관할 배열
    var count = 0 // 배열에서 v의 개수
    for (i in 0 until N) {
        val number = sc.nextInt() // 정수
        numberList.add(number) // 배열에 정수 추가
    }
    val V = sc.nextInt() // 찾고자 하는 정수

    for (i in 0 until numberList.size) {
        if (V == numberList[i]) {
            count++ // v가 배열에 존재하면 count ++
        }
    }

    println(count)
}