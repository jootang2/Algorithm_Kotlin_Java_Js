import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    val map = mutableMapOf<String, Int>()
    val array = arrayOfNulls<String>(m)
    var count = 0

    for(i in 0 until n){
        val input = sc.next()
        map[input] = 0
    }

    for(i in 0 until m){
        array[i] = sc.next()
    }


    for(i in array){
        if(map.containsKey(i)){
            count++
        }
    }

    print(count)


}