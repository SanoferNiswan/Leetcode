/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    let s = new Set();
    let res = [];
    for(let i=0;i<nums1.length;i++){
        for(let j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j] && !s.has(nums1[i])){
                s.add(nums1[i]);
                res.push(nums1[i]);
            }
        }
    }
    return res;
};