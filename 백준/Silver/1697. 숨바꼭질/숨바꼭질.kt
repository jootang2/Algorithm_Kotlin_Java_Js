import java.util.*

val visited = Array<Int>(100001) { 0 }
var count = 0
var start = 0
var end = 0
fun main() {
    val sc = Scanner(System.`in`)
    val input = readLine()!! // 입력값

    start = input.split(" ")[0].toInt() //수빈의 위치
    end = input.split(" ")[1].toInt() //동생의 위치
    bfs(start)
    println(count)
}

fun bfs(start: Int) {
    val queue = LinkedList<Int>()
    queue.offer(start)
    visited[start] = 1
    while (queue.isNotEmpty()) {
        val temp = queue.poll()
        if (temp == end) {
            count = visited[temp] - 1
            return
        }
        if (temp - 1 >= 0 && visited[temp - 1] == 0) {
            visited[temp - 1] = visited[temp] + 1
            queue.offer(temp - 1)
        }
        if (temp + 1 <= 100000 && visited[temp + 1] == 0) {
            visited[temp + 1] = visited[temp] + 1
            queue.offer(temp + 1)
        }
        if (temp * 2 <= 100000 && visited[temp * 2] == 0){
            visited[temp * 2] = visited[temp] + 1
            queue.offer(temp * 2)
        }
    }
}
