import java.util.Scanner

/**
 * 도현이가 선택한 바구니의 범위가 begin, end이고, 기준이 되는 바구니를 mid라고 했을 때,
 * begin, begin+1, ..., mid-1, mid, mid+1, ..., end-1, end 순서로 되어있는 바구니의 순서를
 * mid, mid+1, ..., end-1, end, begin, begin+1, ..., mid-1로 바꾸게 된다.
 *
 *
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 * 둘째 줄부터 M개의 줄에는 바구니의 순서를 바꾸는 만드는 방법이 주어진다.
 * 방법은 i, j, k로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 회전시키는데,
 * 그 때 기준 바구니는 k번째 바구니라는 뜻이다. (1 ≤ i ≤ k ≤ j ≤ N)
 * 도현이는 입력으로 주어진 순서대로 바구니의 순서를 회전시킨다.
 *
 * 모든 순서를 회전시킨 다음에,
 * 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
 * 1 2 3 4 5 6 7 8 9 10
 * 1 6 4 -> begin : 1 ~ end : 6 : mid : 4
 * 4 5 6 1 2 3 7 8 9 10
 * 3 9 8
 *  4 5 8 9 6 1 2 3 7 10
 *  2 10 5
 *  4 6 1 2 3 7 10 5 8 9
 *  1 3 3
 *  1 4 6 2 3 7 10 5 8 9
 *  2 6 2
 *
 *  1. 바구니들의 배열 초기화
 *  2. begin ~ mid-1 까지의 값을 mid ~ end 까지의 값 할당, 기존의 값들은 따로 저장
 *  3. mid ~ end 까지의 값을 따로 저장한 begin ~ mid-1 값 할당
 *  4. basketStorage 리셋
 *  5. 1 ~ 4번 반복
 */

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt() // 바구니 갯수
    val M = sc.nextInt() // 순서를 바꾸는 횟수
    var basket = arrayOfNulls<Int>(N) // 바구니들의 배열
    var basketStorage1 = arrayListOf<Int>() // begin-1 ~ mid-1 값 저장 배열
    var basketStorage2 = arrayListOf<Int>() // mid-1 ~ end-1 값 저장 배열
    for (i in 0 until N) {
        basket[i] = i + 1
    } // 바구니들의 배열 초기화
    for (i in 0 until M) {
        var begin = sc.nextInt() // begin : 시작값
        var end = sc.nextInt() // end : 끝값
        var mid = sc.nextInt() // mid : 기준값

        for(m in mid-1 until end){
            basketStorage2.add(basket[m]!!)
        } // mid-1 ~ end-1 값 저장

        for(m in begin-1 until mid-1){
            basketStorage1.add(basket[m]!!)
        } // begin-1 ~ mid-1 값 저장

        for(m in basketStorage2.indices){
            basket[begin-1] = basketStorage2[m];
            begin ++
        } // basket mid-1 ~ end-1 값을 begin부터 저장

        for(m in basketStorage1.indices){
            basket[begin-1] = basketStorage1[m]
            begin ++
        }

        basketStorage1.clear()
        basketStorage2.clear()
    }


    for (i in basket) {
        print("$i ")
    }
}