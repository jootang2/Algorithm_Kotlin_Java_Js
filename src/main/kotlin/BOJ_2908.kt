/**
 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
 * 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
 * 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
 * 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 * 첫째 줄에 상수의 대답(크기가 큰 수)을 출력한다.
 */
import java.util.Scanner;
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val number1 = sc.next()
    val number2 = sc.next()
    var reverseNumber1 = ""
    var reverseNumber2 = ""
    for (i in number1.length - 1 downTo 0) {
        reverseNumber1 += number1[i]
    }
    for (i in number2.length - 1 downTo 0){
        reverseNumber2 += number2[i]
    }
    val newNumber1 = reverseNumber1.toInt()
    val newNumber2 = reverseNumber2.toInt()

    println(max(newNumber1, newNumber2))
}