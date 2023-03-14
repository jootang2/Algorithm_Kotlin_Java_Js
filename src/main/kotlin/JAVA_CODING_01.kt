/**
 * 문자 개수 세기
 */
import java.util.HashMap
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.next()
    val map = HashMap<Char, Int>()
    for(i in 0..N.length-1){
        val ch = N[i]
        map.merge(ch, 1) {key, value -> value+1}
    }
    println(map)
}