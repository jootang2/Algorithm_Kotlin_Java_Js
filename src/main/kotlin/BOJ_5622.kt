/**
 * 숫자 1을 걸려면 총 2초가 필요하다.
 * 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며,
 * 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
 * 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다.
 * 예를 들어, UNUCIC는 868242와 같다.
 * 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다.
 * 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 * 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 */
import java.util.Scanner;

fun stringToNumber(str: String): String {
    var number = '0'
    var newString = ""
    for (i in str.indices) {
        when (str[i]) {
            'A', 'B', 'C' -> number = '2'
            'D', 'E', 'F' -> number = '3'
            'G', 'H', 'I' -> number = '4'
            'J', 'K', 'L' -> number = '5'
            'M', 'N', 'O' -> number = '6'
            'P', 'Q', 'R', 'S' -> number = '7'
            'T', 'U', 'V' -> number = '8'
            'W', 'X', 'Y', 'Z' -> number = '9'
        }
        newString += number
    }
    return newString
}

fun dialTime(number: String): Int{
    var time = 0
    for(i in number.indices){
        time += Character.getNumericValue(number[i])+1
    }
    return time
}

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    println(dialTime(stringToNumber(input)))
}