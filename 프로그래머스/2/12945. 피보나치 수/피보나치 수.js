function solution(n) {
     //number-1
    let _prev = 1;
    //number-2
    let __prev = 0;
    let result;
    for(let i = 2; i <= n; i ++){
        result = (_prev + __prev) % 1234567;
        __prev = _prev;
        _prev = result;
    }
    
    return result;
}