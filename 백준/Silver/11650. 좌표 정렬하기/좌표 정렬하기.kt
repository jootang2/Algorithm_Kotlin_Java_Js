import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val arrayX = IntArray(N)
    val arrayY = IntArray(N)
    for(i in 0 until N){
        val x = sc.nextInt()
        val y = sc.nextInt()
        arrayX[i] = x
        arrayY[i] = y
    }
    val arrayXY = arrayX.zip(arrayY)

    val result = arrayXY.sortedWith(compareBy({ it.first }, { it.second }))

    for (row in result) {
        print("${row.first} ${row.second}")
        println()
    }
}