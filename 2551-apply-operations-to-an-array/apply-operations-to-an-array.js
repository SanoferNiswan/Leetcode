/**
 * @param {number[]} nums
 * @return {number[]}
 */
var applyOperations = function(nums) {
    for(let i = 0 ; i < nums.length-1 ; i++){
        if(nums[i]!=nums[i+1]) continue;
        nums[i]=nums[i]*2;
        nums[i+1]=0;
        i++;
    }
    let left = 0;
    for(let right = 0 ; right < nums.length ; right++){
        if(nums[right]!=0){
            let temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
        }
    }
    return nums;
}