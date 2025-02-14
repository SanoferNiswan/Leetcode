/**
 * @param {number[]} nums
 * @return {number}
 */
var jump = function(nums) {
    let count = 0,curr = 0 , next = 0;
    for(let i=0;i<nums.length-1;i++){
        next = Math.max(next,(i+nums[i]));
        if(curr==i){
            count++;
            curr=next;
        }
    }
    return count;
};