import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt() // 테스트 케이스
    repeat(t) {
        val row = sc.nextInt() // 가로
        val col = sc.nextInt() // 세로
        val array = Array(row) { Array(col) { 0 } }
        val quantity = sc.nextInt() // 배추의 수
        repeat(quantity) {
            val x = sc.nextInt() // 배추의 x 좌표
            val y = sc.nextInt() // 배추의 y 좌표
            array[x][y] = 1
        }

        var result = 0
        for (i in 0 until row) {
            for (j in 0 until col) {
                if (array[i][j] == 1) {
                    dfs(array, i, j) // 배추가 있는 곳이면 dfs 실행
                    result++
                }
            }
        }
        println(result)
    }
}

val dx = arrayOf(-1, 1, 0, 0)
val dy = arrayOf(0, 0, -1, 1)

fun dfs(array: Array<Array<Int>>, x: Int, y: Int){
    array[x][y] = 0
    for(i in 0 until 4){
        val nx = x + dx[i]
        val ny = y + dy[i]
        if(nx in array.indices && ny in array[0].indices && array[nx][ny] == 1){
            dfs(array, nx, ny)
        }
    }
}