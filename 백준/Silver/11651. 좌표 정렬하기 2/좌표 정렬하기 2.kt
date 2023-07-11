import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val arrayX = IntArray(n)
    val arrayY = IntArray(n)

    for(i in 0 until n){
        val x = sc.nextInt()
        val y = sc.nextInt()
        arrayX[i] = x
        arrayY[i] = y
    }
    val arrayXY = arrayX.zip(arrayY)

    val result = arrayXY.sortedWith(compareBy({ it.second }, { it.first }))

    for (pair in result) {
        println("${pair.first} ${pair.second}")
    }


}