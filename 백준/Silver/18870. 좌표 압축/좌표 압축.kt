import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val array = IntArray(n)
    val sortedArray = IntArray(n)

    for (i in 0 until n) {
        array[i] = sc.nextInt()
        sortedArray[i] = array[i]
    }

    sortedArray.sort()

    val compressedMap = mutableMapOf<Int, Int>()
    var compressedValue = 0

    for (i in 0 until n) {
        if (i > 0 && sortedArray[i] == sortedArray[i - 1])
            continue

        compressedMap[sortedArray[i]] = compressedValue
        compressedValue++
    }

    val result = StringBuilder()
    for (num in array) {
        result.append(compressedMap[num]).append(" ")
    }

    println(result)
}
