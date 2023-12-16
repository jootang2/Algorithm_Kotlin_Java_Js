/**
1. 1부터 순차적을 더해서 n이 되는 숫자가 있나 확인
1-1. n이 넘어가는 경우 2번으로 넘어감
2. 없으면 2부터 시작
3. ... n까지 반복
*/

function solution(n) {
    var answer = 0;
    
    
    for(let j = 1 ; j <= n ; j ++){
        let sum = 0;
        for(let i = j; i <= n + 1; i ++){
            
            if(sum === n){
                answer ++;
                break;
            }
            
            else if(sum > n) {
                break;
            }
            
            sum += i
        }
        
    }
        
    
    
    return answer;
}