/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    var sum = 0;
    for(let i=0;i<nums.length;i++){
        sum+=nums[i];
    }

    if(sum-nums[0]==0) return 0;
    var left = 0,right=0;
    for(let i = 1;i<nums.length-1;i++){
        left = left+nums[i-1];
        right = sum - left - nums[i];
        if(left == right) return i;
    }
    if(sum-nums[nums.length-1]==0) return nums.length-1;

    return -1;
};