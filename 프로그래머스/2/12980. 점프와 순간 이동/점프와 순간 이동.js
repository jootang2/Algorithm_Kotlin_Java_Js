/**
K 칸을 앞으로 점프 or
현재까지 온 거리 x 2 위치로 순간이동
건전지 사용
K칸을 앞으로 점프하면 K만큼 건전지 사용
순간이동을 많이 해야 좋음
이동하려는 거리 N
건전지 사용량의 최솟값

1. n 이 짝수이면 2로 나눈다 (에너지 x)
2. n이 홀수이면 1을 뺀다 (에너지 1)
3. 1,2 과정을 0일 될 때 까지 반복 : 에너지 총 사용량은 1을 뺀 횟수
*/
function solution(n)
{
    let number = n;
    let flag = true;
    let count = 0;

    while(flag){
        if(number % 2 === 0){
            number = number / 2;
        }
        
        else {
            count ++;
            number-- ;
        }
        
        if(number === 0){
            flag = false
        }
    }
    
    return count;
}