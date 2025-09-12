var NumArray = function(nums) {
    this.arr = nums;
};

NumArray.prototype.sumRange = function(left, right) {
    let sum = 0 ;
    for(let i = left ; i <= right ; i++){
        sum+=this.arr[i];
    }
    return sum;
};
