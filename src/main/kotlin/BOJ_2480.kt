/**
 * 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 *
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 *
 * 첫째 줄에 게임의 상금을 출력 한다.
 */
import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    val dice1 = sc.nextInt()
    val dice2 = sc.nextInt()
    val dice3 = sc.nextInt()
    var winnerPrize:Int = 0
    var sameDice:Int

    if(dice1 == dice2 && dice2 == dice3){
        sameDice = dice1
        winnerPrize = sameDice * 1000 + 10000
    } else if(dice1 == dice2 && dice1 != dice3) {
        sameDice = dice1
        winnerPrize = sameDice * 100 + 1000
    } else if(dice1 == dice3 && dice1 != dice2){
        sameDice = dice1
        winnerPrize = sameDice * 100 + 1000
    } else if(dice2 == dice3 && dice1 != dice2){
        sameDice = dice2
        winnerPrize = sameDice * 100 + 1000
    } else if (dice1 != dice2 && dice2 != dice3) {
        val diceNumberArrayList = arrayListOf(dice1, dice2, dice3)
        val maxDice = diceNumberArrayList.max()
        winnerPrize = maxDice * 100
    }

    println(winnerPrize)
}