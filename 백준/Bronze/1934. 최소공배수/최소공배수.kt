import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)
    val t= sc.nextInt()
    for(i in 0 until t){
        val A = sc.nextInt()
        val B = sc.nextInt()
        println(findLeastCommonMultiple(A, B))
    }
}
fun findLeastCommonMultiple(A:Int, B:Int) : Int{
    val min = min(A, B)
    for(i in min .. A*B step min){
        if(i % A == 0 && i % B == 0){
            return i
        }
    }
    return 0
}