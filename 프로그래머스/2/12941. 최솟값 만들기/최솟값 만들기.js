/**
1. A배열에서 가장 작은 수 선택 후
2. B 배열에서 가장 큰 수 선택
3. 서로를 곱하고 answer에 저장
4. 1 ~ 3 배열의 길이만큼 반복
*/
function solution(A,B){
    var answer = 0
    
    A.sort((a,b) => a - b);
    B.sort((a,b) => b - a);
    
    for(let i = 0 ; i < A.length; i ++){
        answer += A[i] * B[i]
    }
    
    return answer;
}