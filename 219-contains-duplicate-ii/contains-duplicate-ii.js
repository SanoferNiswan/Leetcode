var containsNearbyDuplicate = function(nums, k) {
    let s = new Set();
    for(let i=0 ; i<nums.length ; i++){
        if(i>k){
            s.delete(nums[i-k-1]);
        }

        if(s.has(nums[i])) return true;

        s.add(nums[i])
    }
    return false;
};