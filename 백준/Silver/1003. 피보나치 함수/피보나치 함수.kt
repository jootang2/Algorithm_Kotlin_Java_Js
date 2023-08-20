import java.util.Scanner

val fibonacciMap = HashMap<Int,Int>()
val reverseFibonacciMap = HashMap<Int,Int>()
fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt() // 테스트 케이스의 수

    for (i in 0 until t) {
        val answer = StringBuilder()
        val input = sc.nextInt()
        answer.append(reverseFibonacci(input)).append(" ").append(fibonacci(input))
        println(answer)
    }
}

fun fibonacci(n: Int): Int {
    if (n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    }

    if(fibonacciMap.containsKey(n)){
        return fibonacciMap[n]!!
    }

    fibonacciMap[n] = fibonacci(n - 1) + fibonacci(n - 2)

    return fibonacciMap[n]!!

}

fun reverseFibonacci(n: Int): Int {
    if (n == 0) {
        return 1
    } else if (n == 1) {
        return 0
    }

    if(reverseFibonacciMap.containsKey(n)){
        return reverseFibonacciMap[n]!!
    }

    reverseFibonacciMap[n] = reverseFibonacci(n - 1) + reverseFibonacci(n - 2)

    return reverseFibonacciMap[n]!!

}

