/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumCount = function(nums) {
    let max = 0,p=0,n=0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]<0) n++;
        else if(nums[i]>0) p++;
        max=Math.max(n,p)
    }
    return max;
};