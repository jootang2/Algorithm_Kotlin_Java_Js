function solution(n) {
    let array = [];
    const stringN = n.toString();
    for(let i = stringN.length - 1; i >= 0; i --){
        array.push(parseInt(stringN[i]))

    }

    
    return array;
}