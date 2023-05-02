/**
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    for (i in 1..N) {
        val starNumber = i * 2 - 1
        val space = (N * 2 - 1) / 2
        for (j in space - i + 1 downTo 1) {
            print(" ")
        }
        for (j in 1..starNumber) {
            print("*")
        }
        println("")
    }
    for (i in N-1 downTo 1) {
        val starNumber = i * 2 - 1
        val space = (N * 2 - 1) / 2
        for (j in space - i + 1 downTo 1) {
            print(" ")
        }
        for (j in 1..starNumber) {
            print("*")
        }
        println("")
    }
}