/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var closestPrimes = function(left, right) {
    let prime=[];
    for(let i=Math.max(left,2);i<=right;i++){
        let flag = true;
        for(let j=2;j*j<=i;j++){
            if(i%j==0){
                flag=false;
                break;
            }
        }
        if(flag) prime.push(i);
    }
    
    if(prime.length<2) return [-1,-1];
    let res = [],min=Infinity;
    for(let i=1;i<prime.length;i++){
        if(prime[i]-prime[i-1]<min){
            res=[];
            min=prime[i]-prime[i-1];
            res.push(prime[i-1],prime[i]);
        }
    }
    return res;
};