/**
 * @param {number[]} nums
 * @return {number}
 */
var longestSquareStreak = function(nums) {
    let s=new Set(nums);
    let result=-1;
    for(let i of s){
        let count=0;
        while(s.has(i)){
            count++;
            i=i*i;
        }
        if(count>1){
            result=Math.max(result,count);
        }
    }
    return result;
};