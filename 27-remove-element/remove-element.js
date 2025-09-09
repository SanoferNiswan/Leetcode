/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let right = 0 , left = 0 ;
    for(right = 0; right < nums.length ;right++){
        if(nums[right]!=val){
            let temp = nums[left];
            nums[left++] = nums[right];
            nums[right] = temp;
        }
    }
    console.log(nums);
    return left;
};