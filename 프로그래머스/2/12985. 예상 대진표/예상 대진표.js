/**
1. count 초기값 : 1
2. N을 2로 나눈다. -> 1라운드의 대진 수
3. A와 B가 각각 몇 번째 대진에 속해있는 지 구한다.
4. 다음 라운드에서의 번호를 구한다. count++
5. A와 B가 연속되는 (ex. 3, 4)가 되면 count를 반환
*/

function solution(n,a,b)
{
    let answer = 1;
    let N = n;
    let numberA = a;
    let numberB = b;
    let flag = true;
    
    while(flag){
        
        if(answer === 1 && Math.abs(numberA - numberB) === 1){
            if(Math.max(numberA, numberB) % 2 === 0) flag = false
            else {
            numberA = (numberA % 2 !== 0)? (numberA + 1) / 2 : numberA / 2;
            numberB = (numberB % 2 !== 0)? (numberB + 1) / 2 : numberB / 2;

            if(Math.abs(numberA - numberB) === 1){
                if(Math.max(numberA, numberB) % 2 === 0) flag = false
            }
            answer ++;
        }
        } else {
            numberA = (numberA % 2 !== 0)? (numberA + 1) / 2 : numberA / 2;
            numberB = (numberB % 2 !== 0)? (numberB + 1) / 2 : numberB / 2;

            if(Math.abs(numberA - numberB) === 1){
                if(Math.max(numberA, numberB) % 2 === 0) flag = false
            }
            answer ++;
        }

    }
    

    return answer;
}