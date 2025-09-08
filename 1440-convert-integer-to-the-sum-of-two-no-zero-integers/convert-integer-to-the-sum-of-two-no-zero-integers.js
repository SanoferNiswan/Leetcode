const hasZero = (num) => {
    while(num!=0){
        let r = num%10;
        if(r==0) return true;
        num=Math.floor(num/10);
    }
    return false;
}

var getNoZeroIntegers = function(n) {
    for(let i=1;i<=n/2;i++){
        if(!hasZero(i) && !hasZero(n-i)){
            return [i,n-i];
        }
    }
    return [-1,-1];
};