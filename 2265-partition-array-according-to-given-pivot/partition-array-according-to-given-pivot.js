/**
 * @param {number[]} nums
 * @param {number} pivot
 * @return {number[]}
 */
var pivotArray = function(nums, pivot) {
    let result = new Array(nums.length).fill(0);
    let left = 0, right = nums.length-1;
    for(let i = 0,j=nums.length-1 ; i < nums.length ; i++,j--){
        if(nums[i]<pivot){
            result[left++]=nums[i];
        }
        if(nums[j]>pivot){
            result[right--]=nums[j];
        }
    }
    while(left<=right) result[left++]=pivot;
    return result;
};