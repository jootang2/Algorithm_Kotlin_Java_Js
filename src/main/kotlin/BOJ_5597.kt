/**
 * 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다.
 * 출석번호에 중복은 없다.
 *
 * 출력은 2줄이다.
 * 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고,
 * 2번째 줄에선 그 다음 출석번호를 출력한다.
 */
import java.util.Scanner;
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)
    val array = arrayOfNulls<Int>(30)
    var number1 = 0
    var number2 = 0
    for(i in array.indices){
        array[i] = i+1 // 배열 초기화 1 ~ 30
    }
    for(i in 0 until 28){
        val N = sc.nextInt()
        array[N-1] = 0
    }
    for(i in array){
        if(i != 0){
            number1 = i!!
        }
    }
    for(i in array){
        if(i !=0 && i != number1){
            number2 = i!!
        }
    }
    println(min(number1, number2))
    println(max(number1, number2))
}