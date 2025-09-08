/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let left=0;
    for(let right=1;right<=nums.length;right++){
        if(nums[left]!=nums[right]){
            nums[++left]=nums[right]
        }
    }
    return left;
};