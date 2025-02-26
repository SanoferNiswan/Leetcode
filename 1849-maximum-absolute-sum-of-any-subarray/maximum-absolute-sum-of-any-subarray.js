/**
 * @param {number[]} nums
 * @return {number}
 */
var maxAbsoluteSum = function(nums) {
    let currMax=0,currMin=0,max=0,min=0;
    for(let num of nums){
        currMax=Math.max(num,num+currMax);
        currMin=Math.min(num,num+currMin);
        max=Math.max(currMax,max);
        min=Math.min(currMin,min);
    }
    return Math.max(Math.abs(max),Math.abs(min));
};