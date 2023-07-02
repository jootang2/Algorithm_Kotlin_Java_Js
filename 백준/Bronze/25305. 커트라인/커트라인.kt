import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    //응시자 수
    val N = sc.nextInt()
    //상을 받는 사람의 수
    val k = sc.nextInt()
    //응시자들의 점수 배열
    val array = arrayOfNulls<Int>(N)
    //응시자들의 점수
    for(i in 0 until N){
        array[i] = sc.nextInt()
    }
    //오름차순으로 정렬
    array.sort()
    //내림차순으로 정렬
    array.reverse()
    //커트라인 출력
    println("${array[k-1]}")
}