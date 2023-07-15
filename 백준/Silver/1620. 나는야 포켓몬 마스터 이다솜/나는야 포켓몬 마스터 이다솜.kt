import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    
    val inputNM = reader.readLine().split(" ")
    val n = inputNM[0].toInt()
    val m = inputNM[1].toInt()
    
    val nameToIndexMap = mutableMapOf<String, Int>()
    val indexToNameMap = mutableMapOf<Int, String>()
    
    for (i in 0 until n) {
        val pokemon = reader.readLine()
        nameToIndexMap[pokemon] = i + 1
        indexToNameMap[i + 1] = pokemon
    }
    
    for (i in 0 until m) {
        val question = reader.readLine()
        
        if (question.toIntOrNull() != null) {
            println(indexToNameMap[question.toInt()])
        } else {
            println(nameToIndexMap[question])
        }
    }
}
