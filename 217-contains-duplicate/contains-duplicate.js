/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const s = new Set(nums);
    if(nums.length!=s.size) return true;
    return false;
};