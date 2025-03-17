/**
 * @param {number[]} nums
 * @return {boolean}
 */
var divideArray = function(nums) {
    nums.sort();
    console.log(nums);
    for(let i=0;i<nums.length-1;i=i+2){
        console.log(i,":",nums[i],":",i+1,":",nums[i+1])
        if((nums[i+1]!==nums[i])){
            return false;
        };
    }
    return true;
};