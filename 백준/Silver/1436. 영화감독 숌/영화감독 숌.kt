import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    var count = 0
    var init = "665"
    while(count != N){
        init = (init.toInt() + 1).toString()
        if(init.contains("666")){
            count ++
        }
    }
    println(init)
}