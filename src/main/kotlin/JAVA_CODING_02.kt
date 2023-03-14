/**
 * 반복되지 않는 첫 번째 문자 찾기
 */
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.next()
    val map = HashMap<Char, Int>()
    for(i in 0..N.length-1){
        val ch = N[i]
        map.merge(ch, 1) {key, value -> value+1}
    }

    map.forEach{
        (key, value) -> if (value == 1) return println(key)
    }
}