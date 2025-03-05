/**
 * @param {number[]} nums
 * @return {number}
 */
var findGCD = function(nums) {
    let max = Math.max.apply(null,nums);
    let min = Math.min.apply(null,nums);
    return gcd(max,min);
};

var gcd = (max,min) => {
    if(min==0) return max;
    else return gcd(min,max%min);
}