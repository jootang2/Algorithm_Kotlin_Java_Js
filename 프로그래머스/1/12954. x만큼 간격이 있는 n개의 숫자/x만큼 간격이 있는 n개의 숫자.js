function solution(x, n) {
    let answer = [];
    
    let value = x;
    let flag = 0;
    while(flag < n){
        answer.push(value);
        value += x;
        flag ++;
    }
    
    return answer;
}