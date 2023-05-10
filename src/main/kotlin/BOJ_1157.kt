import java.util.Scanner

/**
 * 알파벳 대소문자로 된 단어가 주어지면,
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
 * 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 *
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */

fun main() {
    val sc = Scanner(System.`in`)

    val word = sc.next()
    val wordToUpperCase = word.uppercase()

    var map = mutableMapOf<Char, Int>()

    for (i in 65..90) {
        map[i.toChar()] = 0
    }

    for (i in wordToUpperCase.indices) {
        map.computeIfPresent(wordToUpperCase[i]) { _, value -> value + 1 }
    }

    val max = map.values.maxOrNull()
    val maxKeys = map.filterValues { it == max }.keys

    if (maxKeys.size > 1) {
        println("?")
    } else {
        println(maxKeys.firstOrNull())
    }

}