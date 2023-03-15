/**
 * 글자와 단어 뒤집기
 */
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    var reverseInput= ""
    for(i in input.length-1 downTo 0) {
        reverseInput += input[i]
    }
    println(reverseInput)
}