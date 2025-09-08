/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let left = 0 , right = height.length-1;
    let max = 0;
    while(left<=right){
        let val = Math.min(height[left],height[right])*(right-left);
        max = Math.max(max,val);
        if(height[left]<height[right]) left++;
        else right--;
    }
    return max;
};