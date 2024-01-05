/**
1. 주어진 배열의 두개인 배열을 생성
2. 확장된 배열을 slice()함수를 이용해서 부분배열 생성
3. reduce()함수를 이용해서 부분배열의 합을 구함
4. 부분배열의 합을 배열로 합침
5. set으로 변환해서 set의 길이를 구함
*/
function solution(elements) {
    const extendArray = [...elements, ...elements]
    const answer = [];
    for(let i = 0 ; i < extendArray.length; i ++){
        if(i < elements.length){
            for(let j = 0 ; j < elements.length; j ++){
                const sliceArray = extendArray.slice(j, j+1+i);
                answer.push(sliceArray.reduce((acc, curr) => acc + curr, 0))
            }
        }
    }
    const set = new Set(answer)
    return set.size;
}