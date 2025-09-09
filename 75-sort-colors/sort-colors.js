var sortColors = function(nums) {
    let left = 0 , right = nums.length-1;
    for(let i=0;i<=right;){
        if(nums[i]==0){
            nums = swapNumbers(nums,left,i);
            left++;
            i++;
        }
        else if(nums[i]==2){
            nums = swapNumbers(nums,right,i);
            right--;
        }
        else{
            i++;
        }
    }
    return nums;
};

const swapNumbers = (nums,i,j) => {
    let temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;

    return nums;
}
