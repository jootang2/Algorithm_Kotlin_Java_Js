/**
 * 숫자만 포함하는 문자열인지 검사
 */
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    for(i in input.indices){
        if(!Character.isDigit(input[i])){
            return println("숫자이외의 다른 문자가 포함된 문자열입니다.")
        }
    }
    println("숫자만 포함하는 문자열입니다.")

}