var intersection = function(nums1, nums2) {
    let s1 = new Set(nums1);
    let s2 = new Set(nums2);
    let result = [];

    for(let i of s1){
        if(s2.has(i)) result.push(i);
    }

    return result;
};