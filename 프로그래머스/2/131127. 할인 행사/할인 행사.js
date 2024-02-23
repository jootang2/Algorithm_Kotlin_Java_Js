function solution(want, number, discount) {
    let wantNumber = [];
    let result = 0;
    for(let i = 0; i < want.length; i ++){
        for(let j = 0 ; j < number[i]; j ++){
            wantNumber.push(want[i]);    
        }
    }
    for(let i = 0; i <= discount.length - 10; i ++){
        const discount10Day = discount.slice(i, i + 10);    
        const _wantNumber = [...wantNumber]
        const wantNumberLength = _wantNumber.length;
        for(const item of discount10Day){
            const index = _wantNumber.indexOf(item);
            if(index !== -1) _wantNumber.splice(index, 1);
        }
        // for(let j = 0 ; j < wantNumberLength; j ++){
        //     for(let k = 0 ; k < discount10Day.length; k ++){
        //         if(_wantNumber[j] === discount10Day[k]){
        //             _wantNumber.splice(j,1);
        //             discount10Day.splice(k,1);
        //         }
        //     }
        // }
        if(_wantNumber.length === 0) result ++;
    }
    
    return result;
}