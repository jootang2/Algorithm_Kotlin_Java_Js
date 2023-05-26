import java.lang.Exception
import java.util.Scanner

/**
 *  거스름돈의 액수가 주어지면 리암이 줘야할
 *  쿼터(Quarter, $0.25)의 개수,다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의
 *  개수를 구하는 프로그램을 작성하시오.
 *
 *  거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다.
 *
 *  예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
 *
 *  첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *  각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다.
 *  C의 단위는 센트이다. (1달러 = 100센트) (1<=C<=500)
 *
 *  각 테스트케이스에 대해 필요한 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수를 공백으로 구분하여 출력한다.
 */
fun main() {
    val sc = Scanner(System.`in`)

    // 쿼터 : 25, 다임 : 10, 니켈 : 5 , 페니 : 1
    val quarter = 25
    val dime = 10
    val nickel = 5
    val penny = 1

    val T = sc.nextInt() // Test case
    val array = arrayOfNulls<Int>(4)
    for(i in 0 until T){
        val change = sc.nextInt() // 거스름돈
        array[0] = change/quarter
        array[1] = change%quarter/dime
        array[2] = change%quarter%dime/nickel
        array[3] = change%quarter%dime%nickel/penny
        for (result in array) {
            print("$result ")
        }
    }
}