import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val arrayAge = IntArray(n)
    val arrayName = arrayOfNulls<String>(n)

    for(i in 0 until n){
        arrayAge[i] = sc.nextInt()
        arrayName[i] = sc.next()
    }

    val result = arrayAge.zip(arrayName)
    val sortedResult = result.sortedBy { it.first }

    for (pair in sortedResult) {
        println("${pair.first} ${pair.second}")
    }
}