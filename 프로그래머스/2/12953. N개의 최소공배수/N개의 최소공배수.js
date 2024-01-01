/**
1. 배열의 제일 큰 수부터 1씩 증가하면서 모든 배열의 원소로 나누어지는 수를 반환
*/
function solution(arr) {
    var answer = 0;
    let max = Math.max(...arr);
    let flag = true;
    while(flag){
       for(let i = 0 ; i < arr.length; i ++) {
           if(max % arr[i] !== 0) {
               max ++;
               break;
           }
           if(i === arr.length - 1){
               flag = false;
           }
       }
    }
    console.log(max)
    return max;
}