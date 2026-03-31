class Solution {
    public int findPeakElement(int[] nums) {
        int ind = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[ind] < nums[i]) ind = i;
        }
        return ind;
    }
}