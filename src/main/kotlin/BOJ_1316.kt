import java.util.Scanner

/**
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서,
 * 각 문자가 연속해서 나타나는 경우만을 말한다.
 *
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *
 * 첫째 줄에 단어의 개수 N이 들어온다.
 * N은 100보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에 단어가 들어온다.
 * 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 *
 * 첫째 줄에 그룹 단어의 개수를 출력한다.
 */

/**
 * 그룹단어판별 함수
 * 1. 중복되는 문자가 없는 경우 : true
 * 2. 중복되는 문자가 있지만, 연속인 경우 : true
 */
fun isGroupWord(word: String): Boolean {
    if(condition1(word) && condition2(word)) {
        return true
    } else return false
}

private fun condition2(word: String): Boolean {
    var isTrue = true
    val characterArray = arrayListOf<Char>()
    for (i in 0 .. word.length-2) {
        if (word[i] != word[i + 1]) {
            if (characterArray.contains(word[i])) isTrue = false
            characterArray.add(word[i])
        }
    }
    if (characterArray.contains(word.last())) {
        isTrue = false
    }

    return isTrue
}

private fun condition1(word: String): Boolean {
    var isTrue = false
    var count = 0
    for (i in word.indices) {
        if (word.contains(word[i])) {
            count++
        }
    }
    if (count == word.length) {
        isTrue = true
    }

    return isTrue
}

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt() //단어의 개수 N 입력
    var count = 0 // 그룹단어의 개수 초기화

    for (i in 0 until N) { // N개의 단어 입력
        val word = sc.next() // 단어 입력
        if (isGroupWord(word)) { //그룹단어이면 count ++
            count++
        }
    }
    println(count)
}