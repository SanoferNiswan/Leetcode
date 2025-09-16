var arrayPairSum = function(nums) {
    nums.sort((a,b)=>a-b);
    let count = 0;
    for(let i=0;i<nums.length;i+=2){
        count+=Math.min(nums[i],nums[i+1]);
    }
    return count;
};