import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    //상근이가 가지고 있는 숫자 카드의 개수
    val n = sc.nextInt()
    val map = mutableMapOf<Int, Int>()
    val answer = StringBuilder()
    //숫자 카드
    for (i in 0 until n) {
        val card = sc.nextInt()
        increaseValueOfMap(map, card)
    }

    //구해야 하는 카드의 개수
    val m = sc.nextInt()
    for (i in 0 until m) {
        val questionCard = sc.nextInt()
        val value = map[questionCard]
        if(value != null){
            answer.append("${map[questionCard]} ")
        } else {
            answer.append("0 ")
        }
    }
    
    print(answer)


}

fun increaseValueOfMap(map: MutableMap<Int, Int>, key: Int) {
    val value = map[key]
    if (value != null) {
        map[key] = value + 1
    } else {
        map[key] = 1
    }
}