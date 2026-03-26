class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i:nums) total+=i;
        int leftTotal = 0;
        for(int i=0;i<nums.length;i++){
            int rightTotal = total-nums[i]-leftTotal;
            if(leftTotal == rightTotal) return i;
            leftTotal+=nums[i];
        }

        return -1;
    }
}