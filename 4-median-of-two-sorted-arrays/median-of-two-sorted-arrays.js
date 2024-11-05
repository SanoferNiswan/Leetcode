/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(a, b) {
    res=[];
    let i=0,j=0;
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            res.push(a[i++]);
        }
        else{
            res.push(b[j++]);
        }
    }
    while(i<a.length){
        res.push(a[i++]);
    }
    while(j<b.length){
        res.push(b[j++]);
    }
    let n=res.length;
    if(n%2==0){
        return (res[n/2]+res[n/2-1])/2;
    }
    return res[Math.floor(n/2)];
};