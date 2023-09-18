import java.util.*

var n = 0
var m = 0
var v = 0
var visited = Array(1001) {false}
var array = Array(1001) {Array(1001) {false} }

fun main() {
    val sc = Scanner(System.`in`)
    n = sc.nextInt()
    m = sc.nextInt()
    v = sc.nextInt()

    for (i in 0 until m) {
        val x = sc.nextInt()
        val y = sc.nextInt()
        array[x][y] = true
        array[y][x] = true
    }
    dfs(v)
    println()
    visited = Array(1001) {false}
    bfs()
}

fun dfs(v: Int) {
    visited[v] = true
    print("${v} ")

    for (i in 1 .. n) {
        if (!visited[i] && array[v][i]) {
            dfs(i)
        }
    }
}

fun bfs() {
    val queue: Queue<Int> = LinkedList()
    queue.offer(v)
    visited[v] = true
    print("${v} ")
    while (queue.isNotEmpty()) {
        val temp = queue.poll()
        for (i in 1 .. n) {
            if (!visited[i] && array[temp][i]) {
                queue.offer(i)
                visited[i] = true
                print("${i} ")
            }
        }
    }
}
