import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val N = br.readLine().toInt()
    val list = ArrayList<Int>()
    for(i in 0 until N){
        list.add(br.readLine().toInt())
    }
    list.sort()
    for (i in list) {
        sb.append(i).append("\n")
    }
    println(sb)
    
}