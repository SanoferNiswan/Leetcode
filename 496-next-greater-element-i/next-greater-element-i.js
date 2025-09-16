var nextGreaterElement = function (nums1, nums2) {
    let res = [];
    for (let i = 0; i < nums1.length; i++) {
        let j = 0;
        while (nums1[i] != nums2[j]) j++;
        j++;
        while(j<nums2.length){
            if(nums2[j]>nums1[i]){
                res.push(nums2[j]);
                break;
            }
            j++;
        }
        if(!res[i]) res.push(-1);
    }
    return res;
};