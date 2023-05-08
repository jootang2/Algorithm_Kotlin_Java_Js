import java.util.Scanner

/**
 * 첫째 줄에 단어가 주어진다.
 * 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
 * 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
 */

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.next()
    var postPalindrome = ""
    var prePalindrome = ""
    if(input.length%2 == 0) {
        val halfLength = input.length/2
        for(i in 0 until halfLength){
            postPalindrome += input[i]
        }
        for(i in input.length-1 downTo halfLength){
            prePalindrome += input[i]
        }
    } // 문자열의 길이가 짝수인 경우
    else {
        val halfLength = input.length/2
        for(i in 0 .. halfLength){
            postPalindrome += input[i]
        }
        for(i in input.length-1 downTo halfLength){
            prePalindrome += input[i]
        }
    }

    if(postPalindrome == prePalindrome){
        println(1)
    } else println(0)
}