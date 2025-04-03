/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumTripletValue = function(nums) {
    let n = nums.length,max=0;
    for(let i = 0 ; i < nums.length-2 ; i++){
        for(let j=i+1;j<nums.length-1;j++){
            for(let k=j+1;k<nums.length;k++){
                let value = (nums[i]-nums[j])*nums[k];
                max = Math.max(max,value);
            }
        }
    }
    return max;
};