import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val board = Array(n) { CharArray(m) }

    for (i in 0 until n) {
        val row = scanner.next()
        for (j in 0 until m) {
            board[i][j] = row[j]
        }
    }

    var minCount = Int.MAX_VALUE

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            minCount = minOf(minCount, countRepaint(board, i, j))
        }
    }

    println(minCount)
}

fun countRepaint(board: Array<CharArray>, x: Int, y: Int): Int {
    val startColors = arrayOf('W', 'B')
    var count1 = 0
    var count2 = 0

    for (i in 0 until 8) {
        for (j in 0 until 8) {
            if (board[x + i][y + j] != startColors[(i + j) % 2])
                count1++
            if (board[x + i][y + j] != startColors[(i + j + 1) % 2])
                count2++
        }
    }

    return minOf(count1, count2)
}
