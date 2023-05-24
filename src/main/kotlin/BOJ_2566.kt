import java.util.Scanner

/**
 *  9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
 *  이들 중 최댓값을 찾고
 *  그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 *
 *  첫째 줄에 최댓값을 출력하고,
 *  둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
 *  최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
 */
fun main() {
    val sc = Scanner(System.`in`)
    val array = Array (9) { arrayOfNulls<Int>(9) }

    for(i in 0 until 9){
        for (j in 0 until 9){
            val inputNumber = sc.nextInt()
            array[i][j] = inputNumber
        }
    }

    var max = 0
    var a = 0
    var b = 0

    for(i in 0 until 9){
        for (j in 0 until 9){
            if(array[i][j]!! > max!!){
                max = array[i][j]!!
                a = i
                b = j
            }
        }
    }

    println(max)
    print("${a+1} ${b+1}")
}