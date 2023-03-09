/**
 * 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
 * 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
 *
 *  구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
 * 일치하지 않는다면 No를 출력한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val X = sc.nextInt()
    val N = sc.nextInt()
    var sum = 0

    for(i in 1..N){
        val a = sc.nextInt()
        val b = sc.nextInt()
        sum += a*b
    }

    if(X == sum) println("Yes") else println("No")

}