import java.security.KeyStore
import java.security.KeyStore.Entry
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

/**
 * 문자열 배열을 길이 순으로 정렬
 */
fun sortBylength(array: ArrayList<String>): ArrayList<String> {
    var map = mutableMapOf<String, Int>()
    for(i in array){
        map[i] = i.length
    }
    map = map.toList().sortedByDescending { it.second }.toMap() as MutableMap
    val sortedList = arrayListOf<String>()
    for(i in map.keys){
        sortedList.add(i)
    }
    return sortedList
}

fun main() {
    val input = arrayListOf<String>("abc","abcd","a","sdfebxcf","asdfqwerxcvbx")
    val result = sortBylength(input)
    println(result)
}