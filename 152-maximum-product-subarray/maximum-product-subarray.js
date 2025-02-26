/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    let prefix = 1;
    let suffix = 1;
    let max1 = -Infinity,max2=-Infinity;
    let n = nums.length;
    for(let i = 0 ;i < n ; i++){
        prefix= prefix==0?1*nums[i]:prefix*nums[i];
        suffix= suffix==0?1*nums[n-1-i]:suffix*nums[n-1-i];
        max1=Math.max(prefix,max1);
        max2=Math.max(suffix,max2);
    }
    return Math.max(max1,max2);
};