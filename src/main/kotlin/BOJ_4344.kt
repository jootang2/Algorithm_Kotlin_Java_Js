import java.util.Scanner

/**
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
 * 이어서 N명의 점수가 주어진다.
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */

fun main() {
    val sc = Scanner(System.`in`)

    val C = sc.nextInt() // 테스트 케이스의 개수
    val scoreList = arrayListOf<Int>() // 점수를 담을 리스트
    for(i in 0 until C){
        val N = sc.nextInt() // 학생의 수
        for(j in 0 until N){
            val score = sc.nextInt()
            scoreList.add(score)
        }
        var totalScore = 0 // 점수들의 총 합
        for (i in scoreList) {
            totalScore += i
        } // 점수리스트의 총 합
        val average = totalScore.toDouble()/scoreList.size // 점수리스트의 평균
        var count = 0 //평균을 넘는 학생들의 수
        for (i in scoreList) {
            if(i > average){
                count++
            }
        }
        val result = count.toDouble()/scoreList.size*100
        scoreList.clear()
        println("${String.format("%.3f", result)}%")
    }
}