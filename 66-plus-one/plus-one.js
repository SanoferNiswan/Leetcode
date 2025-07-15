/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let s = "",res=[];
    for(let i of digits){
        s=s+i;
    }
    let sum = BigInt(s)+1n;
    while(sum!=0n){
        res.push(Number(sum%10n));
        sum=sum/10n;
    }
    return res.reverse();
};