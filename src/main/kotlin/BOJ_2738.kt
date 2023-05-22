import java.util.Scanner

/**
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다.
 * 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
 * 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
 * N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 */
fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt() //N*N 2차원 배열 생성
    val M = sc.nextInt()
    val arrayA = Array(N) { arrayOfNulls<Int>(M) }
    val arrayB = Array(N) { arrayOfNulls<Int>(M) }
    val arrayC = Array(N) { arrayOfNulls<Int>(M) }
    for (i in 0 until N) {
        for (j in 0 until M) {
            val elementA = sc.nextInt()
            arrayA[i][j] = elementA
        }
    }

    for (i in 0 until N) {
        for (j in 0 until M) {
            val elementB = sc.nextInt()
            arrayB[i][j] = elementB
        }
    }

    for (i in 0 until N) {
        for (j in 0 until M) {
            arrayC[i][j] = arrayA[i][j]!! + arrayB[i][j]!!
        }
    }

    for (i in 0 until N) {
        for (j in 0 until M) {
            print("${arrayC[i][j]} ")
        }
        println()
    }
}