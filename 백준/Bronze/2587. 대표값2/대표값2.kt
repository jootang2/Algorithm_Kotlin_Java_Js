import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val array = arrayOfNulls<Int>(5)
    for (i in 0 until 5) {
        array[i] = sc.nextInt()
    }
    var sum = 0
    for (i in 0 until 5) {
        sum += array[i]!!
    }
    //평균 값 
    val average = sum / 5
    //배열 정렬
    array.sort()
    println("$average ${array[2]}")
}