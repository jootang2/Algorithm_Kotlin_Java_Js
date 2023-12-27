/**
1. x의 모든 0을 제거 : string, 제거된 0의 개수 : countZero
2. string의 길이 : c
3. c를 2진법으로 변환
4. c가 1이 될 때 까지 반복 , 반복 횟수 : countRepeat
*/

function solution(s) {
    let countZero = 0;
    let countRepeat = 0;
    let flag = true;
    let _s = s;
    
    while(flag){
        countRepeat ++;
        let string = '';
    
        //1. x의 모든 0을 제거 : string, 제거된 0의 개수 : countZero
        for(let i = 0; i < _s.length; i ++){
            if(_s[i] !== '0'){
                string += _s[i];
            } else {
                countZero ++;
            }
        }

        // 2. x의 길이 : c
        const c = string.length;

        //3. c를 2진법으로 변환
        const binaryC = c.toString(2);
        
        _s = binaryC;
        
        if(binaryC === '1'){
            flag = false;
        }
    }
    
    
    console.log(countRepeat)
    console.log(countZero)
    const answer = [countRepeat, countZero]
    
    return answer;
}