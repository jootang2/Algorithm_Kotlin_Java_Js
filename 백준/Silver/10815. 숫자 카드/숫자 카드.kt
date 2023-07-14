import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    // 맵
    val map = mutableMapOf<Int, Int>()
    val sb = StringBuilder()
    //상근이가 가지고 있는 숫자 카드의 개수
    val n = sc.nextInt()
    for (i in 0 until n) {
        val input = sc.nextInt()
        setValue(map, input)
    }
    //주어진 카드의 개수
    val m = sc.nextInt()
    for(i in 0 until m){
        val input = sc.nextInt()
        setValue(map, input)
        sb.append("${map[input]}").append(" ")
    }

    print(sb)

}

/**
 * map이 key를 가지고 있다면 value는 1
 * map이 key를 가지고 있지 않다면 0
 */
fun setValue(map: MutableMap<Int, Int>, key: Int) {
    if (map.containsKey(key)){
        map[key] = 1
    } else map[key] = 0
}