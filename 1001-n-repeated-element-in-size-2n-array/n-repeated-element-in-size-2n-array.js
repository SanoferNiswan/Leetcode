var repeatedNTimes = function(nums) {
    let n = nums.length/2;
    nums.sort();
    if(nums[n]==nums[n+1]) return nums[n];
    else return nums[n-1];
};