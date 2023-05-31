import java.lang.Exception
import java.util.Scanner

/**
 *  딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
 * 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다.
 * 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 *  N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
 *
 * 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
 * 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
 * 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
 * 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
 */
fun main() {
    val sc = Scanner(System.`in`)

    val N = sc.nextInt()
    val M = sc.nextInt()

    val array = arrayOfNulls<Int>(N)
    val arrayList = arrayListOf<Int>()

    for (i in 0 until N) {
        val card = sc.nextInt()
        array[i] = card
    }


    for (i in 0 until array.size-2) {
        for (j in i+1 until array.size) {
            for (k in j+1 until array.size) {
                val sum = array[i]!! + array[j]!! + array[k]!!
                if(sum <= M){
                    arrayList.add(sum)
                }
            }
        }
    }
    println("${arrayList.max()}")
}