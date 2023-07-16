import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    //집합 A의 원소의 개수
    val n = sc.nextInt()
    //집합 B의 원소의 개수
    val m = sc.nextInt()
    val mapA = mutableMapOf<Int, Int>()
    val mapB = mutableMapOf<Int, Int>()
    //집합 A의 원소
    for (i in 0 until n) {
        val elementA = sc.nextInt()
        mapA[elementA] = 1
    }
    //집합 B의 원소
    for (i in 0 until m) {
        val elementB = sc.nextInt()
        mapB[elementB] = 1
    }
    //A-B의 원소의 개수
    val AexceptB = sizeOfMapAExceptB(mapA, mapB)
    //B-A의 원소의 개수
    val BexceptA = sizeOfMapAExceptB(mapB, mapA)

    println(AexceptB + BexceptA)


}

fun sizeOfMapAExceptB(mapA: MutableMap<Int, Int>, mapB: MutableMap<Int, Int>): Int {
    var size = 0
    for(key in mapB.keys){
        val valueA = mapA[key]
        if(valueA == null){
            size++
        }
    }
    return size
}