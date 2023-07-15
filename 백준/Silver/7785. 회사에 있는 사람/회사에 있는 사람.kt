import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val map = mutableMapOf<String, String>()
    val list = mutableListOf<String>()
    for(i in 0 until n){
        val name = sc.next()
        val status = sc.next()
        map[name] = status
    }
    val filter = map.filter { it.value == "enter" }
    for (entry in filter) {
        list.add(entry.key)
    }
    val reversedList = list.sorted().reversed()
    for (s in reversedList) {
        println(s)
    }

}