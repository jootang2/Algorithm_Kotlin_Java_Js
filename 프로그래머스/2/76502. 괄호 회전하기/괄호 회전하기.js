function isCorrectArray(array) {
    let isCorrectArray = true;
    const stack = [];
    const correctSet = {
        '}' : '{',
        ']' : '[',
        ')' : '('
    }
    for(let i = 0 ; i < array.length; i ++){
        if(array[i] === '(' || array[i] === '{' || array[i] == '['){
            stack.push(array[i])
        } else {
            if(stack.at(-1) === correctSet[array[i]]){
                stack.pop();
            } else {
                isCorrectArray = false;
            }
        }
    }
    return isCorrectArray && stack.length === 0
    
}
function solution(s) {
    const array = [];
    for(i of s){
        array.push(i)
    }
    let answer = 0
    
    for(let i=0;i<s.length;i++){
        const changedS = [...s.slice(i,s.length), ...s.slice(0,i)]
        if(isCorrectArray(changedS)) answer ++;
    }
    
    return answer;
}