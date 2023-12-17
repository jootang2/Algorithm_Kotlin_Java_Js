class Solution {
    fun solution(s: String): String {
        val stringArray = s.split(" ")
        val intArray = IntArray(stringArray.size)
        stringArray.indices.forEach{intArray[it] = stringArray[it].toInt()}
        intArray.sort()
        return "${intArray.first()} ${intArray.last()}"
    }
}