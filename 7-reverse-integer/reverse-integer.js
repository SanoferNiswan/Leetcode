var reverse = function(x) {
    let reverse=0,xCopy = x;
    x = Math.abs(x);
    while(x>0){
        let r = x%10;
        reverse = reverse*10+r;
        x=Math.floor(x/10);
    }

    if(reverse>2**31-1) return 0;
    return xCopy<0 ? -reverse : reverse;
};