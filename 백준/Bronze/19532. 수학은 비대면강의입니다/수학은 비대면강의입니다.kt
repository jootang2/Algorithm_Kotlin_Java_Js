import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    val f = sc.nextInt()

    for (x in -999..999) {
        for (y in -999..999) {
            if (a * x + b * y == c && d * x + e * y == f) {
                println("$x $y")
            }
        }
    }
}