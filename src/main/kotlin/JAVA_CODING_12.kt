/**
 * 중복 문자 제거
 */

fun removeDuplicate(str: String): String {
    var set = LinkedHashSet<Char>()
    var newStr = ""
    for (i in 0 until str.length - 1) {
        set.add(str[i])
    }
    var set1 = set.iterator()
    while (set1.hasNext()) {
        newStr += set1.next()
    }
    return newStr
}

fun main() {
    println(removeDuplicate("BXCVGLASDFIZXCJMFASDFBXCV"))
}