import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val answer = StringBuilder()

    //듣도 못한 사람의 수
    val n = sc.nextInt()
    //보도 못한 사람의 수
    val m = sc.nextInt()
    //듣도 보도 못한 사람의 맵
    val map = mutableMapOf<String, Int>()
    //듣도 못한 사람의 이름
    for(i in 0 until n){
        val name1 = sc.next()
        increaseValueOfMap(map, name1)
    }
    //보도 못한 사람의 이름
    for(i in 0 until m){
        val name2 = sc.next()
        increaseValueOfMap(map, name2)
    }

    val filter = map.filter { it.value > 1 }
    answer.append(filter.size).append("\n")
    val list = mutableListOf<String>()
    for(key in filter.keys) list.add(key)
    list.sort()
    for (name in list) {
        answer.append(name).append("\n")
    }
    print(answer)
}

/**
 * map에 이미 key가 있는 경우에는 value + 1
 * map에 key가 없는 경우에는 1
 */
fun increaseValueOfMap(map:MutableMap<String, Int>, key:String){
    val value = map[key]
    if(value != null){
        map[key] = value + 1
    } else {
        map[key] = 1
    }
}