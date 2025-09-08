var moveZeroes = function(nums) {
    let left = 0 , right = 0;
    while(right<nums.length){
        if(nums[right]!=0){
            let temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
        }
        right++;
    }
};