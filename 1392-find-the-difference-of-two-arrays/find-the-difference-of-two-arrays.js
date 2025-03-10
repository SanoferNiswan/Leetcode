/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function(nums1, nums2) {
    let res=[[],[]]
    let s1=new Set(nums1);
    let s2=new Set(nums2);
    for(let num of s1){
        if(!s2.has(num)){
            res[0].push(num);
        }
    }

    for(let num of s2){
        if(!s1.has(num)){
            res[1].push(num);
        }
    }

    return res;

};