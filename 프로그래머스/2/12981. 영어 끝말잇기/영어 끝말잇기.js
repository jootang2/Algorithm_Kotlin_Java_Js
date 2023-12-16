/**
1. 틀린 단어가 있는 지 검사
1_1. 앞 요소의 마지막 영어소문자로 시작하는지?
1_2. 이미 앞에 나왔었던 단어인지?


*/

function solution(n, words) {
    var answer = [];
    let failIndex = 0;
    const usedWord = [];
    for(let i = 0; i < words.length; i ++){
        const value = words[i];
        const index = i;
         // 중복되는 단어인지 확인
        if(usedWord.includes(value)){
            failIndex = index;
            break;
        } 
        //첫 번째 요소를 제외하고, 앞 단어의 마지막 철자로 시작하는지 검사
        // 문제가 있으면 해당 요소의 인덱스를 failIndex에 할당;
        else {
            usedWord.push(value)
        
            if(index !== 0){
                const frontWord = words[index - 1];
                const finishedChar = frontWord.charAt(frontWord.length - 1);
                if(value.charAt(0) !== finishedChar){
                    failIndex = index;
                    break;
                }
            }
        }
        
    }

    let looseNumber = 0;
    let looseTurn = 0;
    
    // 실패한 경우
    if(failIndex !== 0){
        if((failIndex + 1) % n === 0){
            looseNumber = n;
            looseTurn = (failIndex + 1) / n;
        } else {
            looseNumber = (failIndex + 1) % n;
            looseTurn = Math.trunc(((failIndex + 1) / n)) + 1;
        }
    }
    console.log(looseTurn)
    answer = [looseNumber, looseTurn];
    return answer;
}