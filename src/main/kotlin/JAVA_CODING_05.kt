/**
 * 모음과 자음 세기
 */
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    var vowel = 0
    var consonant = 0
    for(i in input.indices){
        if(input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
            vowel++
        } else if(Character.isLowerCase(input[i])) consonant++
    }

    println("vowel: $vowel \nconsonant: $consonant")

}