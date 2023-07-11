import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val array = arrayOfNulls<String>(n)

    for(i in 0 until n){
        array[i] = sc.next()
    }

    val distinctArray = array.distinct()

    val sortedArray = distinctArray.sortedWith(compareBy({it?.length}, { it?.lowercase() }))

    for (s in sortedArray) {
        println(s)
    }
    
}