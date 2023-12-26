// 1. 2진수로 변환하는 함수 생성
// 2. n부터 1씩 더해가면서 2진수로 변환했을 때, 1의 개수가 같은 지 확인 -> true인 경우 해당 숫자 반환
function dTob (n) {
        let flag = true;
        let num = n;
        let binary = '';
        if(n === 1){
            return '';
        }
        while(flag){
            //홀수인 경우
            if(num % 2 === 1) {
                binary = '1' + binary;
                num = (num - 1) / 2;
            } else {
                binary = '0' + binary;
                num = num / 2 ;
            }
            
            if(num === 1){
                binary = '1' + binary;
                flag = false;
            }
        }
        return binary;
    }
function solution(n) {
    let num = n;
    let flag = true;
    let numCount = 0;
    
    for(const i of dTob(num)){
        if(i === '1'){
            numCount ++;
        }
    }
    
    while(flag) {
        let count = 0;
        num ++;
        for(const i of dTob(num)){
            if(i === '1'){
                count ++;
            }
        }
        if(count === numCount){
            flag = false;
        }
    }
 
    var answer = 0;
    return num;
}