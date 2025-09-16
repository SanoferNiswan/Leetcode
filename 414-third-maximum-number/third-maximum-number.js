var thirdMax = function(nums) {
    let s = new Set(nums);
    nums=[];
    for(let i of s){
        nums.push(i);
    }
    nums.sort((a,b)=>b-a);
    console.log(nums);
    return nums.length>2?nums[2]:nums[0];
};