function solution(s) {
    let s1 = s.toLowerCase();
    let result = Array.from(s1.split(" "));
    
    let result2 = result.map((value) => {
        if(value.length > 0){
            value = value[0].toUpperCase() + value.slice(1);       
        }
        
        
        return value
    })
    
    return result2.join(" ")
}