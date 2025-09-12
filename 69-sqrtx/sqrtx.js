var mySqrt = function(x) {
    if(x==1 || x==0) return x;
    let left = 1, right = x/2,ans;
    while(left<=right){
        mid = Math.floor((left+right)/2);
        if(mid*mid==x) return mid;
        else if(mid*mid < x){
            left=mid+1;
            ans=mid;
        }
        else right = mid-1;
    }
    return ans;
};