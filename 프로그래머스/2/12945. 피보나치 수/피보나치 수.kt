class Solution {
    fun solution(n: Int): Int {
        
        var first = 0
        var second = 1
        var target = 0
        
        for(i in 2 .. n){
            target = (first + second) % 1234567
            first = second
            second = target
        }
        return target
    }
}