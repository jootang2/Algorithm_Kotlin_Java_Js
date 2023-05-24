import java.lang.Exception
import java.util.Scanner

/**
 *  한 줄의 단어는 글자들을 빈칸 없이 연속으로 나열해서 최대 15개의 글자들로 이루어진다.
 *  또한 만들어진 다섯 개의 단어들의 글자 개수는 서로 다를 수 있다.
 *
 *  칠판에 붙여진 단어들이 주어질 때,
 *  영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램을 작성하시오.
 */
fun main() {
    val sc = Scanner(System.`in`)

    val array = Array(5) { arrayOfNulls<Char>(15) }

    for (i in 0 until 5) {
        val input = sc.next()
        for (j in 0 until 15) {
            array[i][j] = input.getOrNull(j) ?: ' '
        }
    }

    var result = ""

    for (i in 0 until 15) {
        for(j in 0 until 5){
            try{
                result += array[j][i] ?: ' '
            } catch (e: Exception){

            }
        }
    }

    println(result.replace("\\s".toRegex(), ""))
}