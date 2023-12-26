// 1. 시작이 ')' 이면 false 반환
// 2. '('
function solution(s){
    let answer = true;
    const array = s.split("");
    const stack = [];
    
    for(let i = 0 ; i < array.length; i ++){
        // console.log(stack)
        if(array[i] === '('){
            stack.push('(');
        } else {
            if(stack.length === 0){
                return false;
            } else {
                stack.pop();    
            }
        }
    }
    
    answer = (stack.length === 0) ? true : false;

    return answer;
}