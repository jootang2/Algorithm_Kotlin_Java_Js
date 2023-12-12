function solution(n)
{
    const nToString = n.toString();
    let sum = 0;
    
    for(let i = 0 ; i < nToString.length; i ++){
        sum += parseInt(nToString[i])
    }
    
    console.log(parseInt(nToString))
    console.log(sum)

    return sum;
}