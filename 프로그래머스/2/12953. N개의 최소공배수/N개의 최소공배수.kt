class Solution {
    fun solution(arr: IntArray): Int {
        var flag = true
        var max = 1
        while(flag){
            for(i in 0 until arr.size){
                if(max % arr[i] != 0){
                    max ++
                    break
                }
                if(i == arr.size - 1){
                    flag = false
                }
            }
        }
        
        return max
    }
}