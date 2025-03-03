/**
 * @param {number[]} nums
 * @param {number} pivot
 * @return {number[]}
 */
var pivotArray = function(nums, pivot) {
    let left=[],right=[];
    for(let i = 0 ; i < nums.length ; i++){
        if(nums[i] < pivot){
            left.push(nums[i]);
        }else if(nums[i]>pivot){
            right.push(nums[i])
        }else right.unshift(nums[i]);
    }

    let res = [];
    for(let i of left) res.push(i);
    for(let i of right) res.push(i);
    return res;
};