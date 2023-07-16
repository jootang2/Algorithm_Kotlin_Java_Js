import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val word = sc.next()
    val set = mutableSetOf<String>()
    // 부분 문자열
    for (i in 0..word.length) {
        for (j in i + 1..word.length) {
            set.add(word.substring(i,j))
        }
    }
    println(set.size)
}