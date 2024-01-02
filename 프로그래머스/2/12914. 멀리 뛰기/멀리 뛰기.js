/**
1. 피보나치 활용
1칸 : 1
2칸 : 2
3칸 : 3
4칸 : 5
5칸 : 8
...
*/
function solution(n) {
    let firstValue = 1;
    let secondValue = 2;
    let result;
    
    if(n === 1) return 1;
    else if(n === 2) return 2
    else {
        for(let i = 3 ; i <= n ; i ++){
            result = (firstValue + secondValue) % 1234567;
            firstValue = secondValue;
            secondValue = result;
        }
        return result;
    }    
}