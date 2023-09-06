import java.util.*
import kotlin.math.pow

var number = 0
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val r = sc.nextInt()
    val c = sc.nextInt()
    val size = 2.0.pow(n).toInt()

    extracted(size, r, c)
    println(number)
}

private fun extracted(size: Int, r: Int, c: Int) {
    if(size == 1){
        return
    }
    /**3사분면*/
    if (r >= size / 2 && c < size / 2) {
        number += size * size / 4 * 2
        extracted(size / 2, r - size / 2, c)
    }
    /**2사분면*/
    else if (r < size / 2 && c < size / 2) {
        number += size * size / 4 * 0
        extracted(size / 2 , r , c)
    }
    /**1사분면*/
    else if (r < size / 2 && c >= size / 2) {
        number += size * size / 4 * 1
        extracted(size / 2, r, c - size / 2)
    }
    /**4사분면*/
    else {
        number += size * size / 4 * 3
        extracted(size / 2, r - size / 2, c - size / 2)
    }
}
