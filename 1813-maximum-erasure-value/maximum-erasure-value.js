/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumUniqueSubarray = function(nums) {
    const set = new Set();
    let left=0,right=0,res=0,currSum=0;
    while(right<nums.length){
        while(set.has(nums[right])){
            currSum-=nums[left];
            set.delete(nums[left++]);
        }
        currSum+=nums[right];
        set.add(nums[right++]);
        res=Math.max(res,currSum);
    }
    return res;
};