import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.next()

    var sum = Int.MAX_VALUE
    val splitM = input.split("-")

    for(i in 0 until splitM.size){
        var temp = 0

        val splitP = splitM[i].split("+")
        for(j in 0 until splitP.size){
            temp += splitP[j].toInt()
        }

        if(sum == Int.MAX_VALUE){
            sum = temp
        } else {
            sum -= temp
        }
    }

    println(sum)
}