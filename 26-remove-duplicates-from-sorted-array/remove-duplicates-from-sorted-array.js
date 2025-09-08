/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let unique = 0;
    let left=0,right=1;
    for(right=1;right<=nums.length;right++){
        if(nums[left]!=nums[right]){
            nums[++left]=nums[right]
        }
    }
    return left;
};