/**
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    for (i in 1..N) {
        var star = ""
        var space = ""

        for(j in 1..(N-i)){
            space += " "
        }

        for(k in 1 .. i) {
            star += "*"
        }

        println(space+star)
    }
}