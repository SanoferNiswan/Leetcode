var pivotIndex = function(nums) {
    var sum = 0;
    for(num of nums) sum+=num

    var left = 0;
    for(let i = 0;i<nums.length;i++){
        if(left == sum-left-nums[i]) return i;
        left+=nums[i];
    }

    return -1;
};