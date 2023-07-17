import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)
    val A = sc.nextLong()
    val B = sc.nextLong()
    println(findLeastCommonMultiple(A, B))
}
fun findLeastCommonMultiple(A:Long, B:Long) : Long{
    val min = min(A, B)
    for(i in min .. A*B step min){
        if((i % A).toInt() == 0 && (i % B).toInt() == 0){
            return i
        }
    }
    return 0
}