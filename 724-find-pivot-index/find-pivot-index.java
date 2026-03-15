class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num:nums) total+=num;
        int leftTotal = 0;

        for(int i=0;i<nums.length;i++){
            int rightTotal = total - nums[i];
            if(leftTotal == rightTotal) return i;
            leftTotal+=nums[i];
            total = total-nums[i];
        }

        return -1;
    }
}