/**
1. x의 모든 0을 제거 : string, 제거된 0의 개수 : countZero
2. string의 길이 : c
3. c를 2진법으로 변환
4. c가 1이 될 때 까지 반복 , 반복 횟수 : countRepeat
*/
class Solution {
    fun solution(s: String): IntArray {
        var flag = true
        var countZero = 0
        var countRepeat = 0
        var string = s
        while(flag){
            countRepeat ++
            var _string = ""
            for(i in string){
                if(i == '0') countZero ++
                else _string += i
            }
            val c = _string.length
            val binaryC = c.toString(2)
            
            if(binaryC == "1") flag = false
            else string = binaryC
            
        }
        println("countRepeat : $countRepeat , countZero : $countZero")
        var answer: IntArray = intArrayOf(countRepeat, countZero)
        return answer
    }
}