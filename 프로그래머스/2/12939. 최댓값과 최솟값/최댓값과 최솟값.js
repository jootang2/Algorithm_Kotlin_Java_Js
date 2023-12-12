/**
1. 공백으로 문자열을 나눈다.
2. 나눈 문자열을 저장.
3. 저장한 데이터 중 최댓값과 최솟값을 출력한다.
*/
function solution(s) {
    let array = [];
    for(let i = 0 ; i < s.split(" ").length; i ++){
        array.push(parseInt(s.split(" ")[i]));
    }
    const max = Math.max(...array)
    const min = Math.min(...array)
    
    
    
    return `${min} ${max}`;
}