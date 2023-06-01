import java.lang.Exception
import java.util.Scanner

/**
 *  어떤 자연수 N이 있을 때,
 *  그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
 *  어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
 *  예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
 *  물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다.
 *  반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 *
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 *
 * 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 *
 * 풀이
 * 1. 1부터 N까지의 수를 돈다.
 * 2. 돌면서 각각의 수 마다 분해합을 한다.
 * 3. 분해합의 결과가 N과 일치하는지 검사한다.
 * 4. 결과가 일치하면 리스트에 담는다.
 * 5. 리스트가 비어있다면 0 출력
 * 6. 리스트가 비어있지 않다면 리스트의 최솟값 출력
 */

fun splitSum(i: Int): Int {
    val transform = i.toString()
    var transformSum = 0
    for (j in transform.indices) {
        transformSum += Character.getNumericValue(transform[j])
    }
    val result = i + transformSum
    return result
}

fun main() {
    val sc = Scanner(System.`in`)

    val N = sc.nextInt()
    val array = arrayListOf<Int>()
    // 1. 1부터 N까지의 수를 돈다
    for (i in 1..N) {
        // 2. 각각의 수 마다 분해합을 한다.
        // 3. 분해합의 결과가 N과 일치하는지 검사한다.
        if (splitSum(i) == N) {
            // 4. 결과가 일치하면 리스트에 담는다.
            array.add(i)
        }
    }
    // 5. 리스트가 비어있다면 0 출력
    if(array.isEmpty()){
        println(0)
    }
    // 6. 리스트가 비어있지 않다면 리스트의 최솟값 출력
    else {
        println("${array.min()}")
    }
}