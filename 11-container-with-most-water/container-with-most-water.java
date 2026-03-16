class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, max =0;
        while(left<right){
            int sum = Math.min(height[left],height[right])*(right-left);
            max = Math.max(sum, max);
            if(height[left]>height[right]){
                right--;
            }else left++;
        }

        return max;
    }
}