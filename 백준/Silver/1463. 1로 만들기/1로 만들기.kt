import java.util.*

var count = 0
fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()

    var dp = Array(input + 1) { 0 }

    for (i in 2..input) {
        dp[i] = dp[i - 1] + 1
        if (i % 2 == 0) {
            dp[i] = Math.min(dp[i], dp[i / 2] + 1)
        }
        if (i % 3 == 0) {
            dp[i] = Math.min(dp[i], dp[i / 3] + 1)
        }
    }

    println(dp[input])
}