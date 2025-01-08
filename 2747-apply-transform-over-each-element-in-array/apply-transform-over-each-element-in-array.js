/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    arr=arr.map((a,indx)=>fn(a,indx))
    return arr;
};