/**
1. 입력값이 'p'를 포함하고 있지 않은 경우 && 'y'를 포함하고 있지 않은 경우 false 반환
0. 입력값을 소문자로 변환
2. 변환된 문자열에 있는 'p'의 개수
3. 변환된 문자열에 있는 'y'의 개수
4. 같으면 true, 다르면 false 반환
*/
function solution(s){
    
    s = s.toLowerCase();
    
    let p = 0;
    let y = 0;
    

    for(let i = 0 ; i < s.length; i ++){
        if(s[i]  === 'p') p ++;
        else if (s[i] === 'y') y++;
    }
    
    return p === y;
}