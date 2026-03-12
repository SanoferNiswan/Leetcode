class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length-1, leftMax = height[left], rightMax=height[right], sum = 0;
        while(left<right){
            if(height[left] <= height[right]){
                if(height[left]>leftMax) leftMax = height[left];
                sum+=leftMax - height[left];
                left++;
            } else {
                if(height[right]>rightMax) rightMax = height[right];
                sum+=rightMax-height[right];
                right--;
            }
        }
        return sum;
    }
}