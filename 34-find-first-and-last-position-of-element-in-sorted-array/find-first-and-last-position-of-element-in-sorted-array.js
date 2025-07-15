/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let res = [-1,-1];
    for(let i=0;i<nums.length;i++){
        if(nums[i]==target && (i==0 || nums[i-1]!=nums[i])){
            res[0]=i;
        }
        if(nums[i]==target && (i==nums.length-1 || nums[i+1]!=nums[i])){
            res[1]=i;
        }
    }
    return res;
};