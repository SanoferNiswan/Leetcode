/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function(nums) {
    let x = [nums[0]],res=[];
    for(let i=1;i<=nums.length;i++){
        if(nums[i-1]!=nums[i]-1){
            res.push(`${x[0]}${x[x.length-1]!=x[0]?"->"+x[x.length-1]:""}`);
            x=[nums[i]];
        }
        else{
            x.push(nums[i]);
        }
    }
    return res;
};