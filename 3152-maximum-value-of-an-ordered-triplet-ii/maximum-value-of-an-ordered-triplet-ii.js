/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumTripletValue = function(nums) {
    let n = nums.length,max=0;
    let leftmax=new Array(n);
    let rightmax=new Array(n);

    leftmax[0]=nums[0];
    rightmax[n-1]=nums[n-1];
    
    for(let i=1;i<n;i++){
        leftmax[i]=Math.max(leftmax[i-1],nums[i]);
    }

    for(let i=n-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],nums[i]);
    }

    for(let i=1;i<n-1;i++){
        let value = (leftmax[i-1]-nums[i])*rightmax[i+1];
        max=Math.max(max,value);
    }

    return max;
};