class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2) return nums.length;
        Arrays.sort(nums);
        int count = 1, max = 0;
        for(int i = 1; i<nums.length;i++){
            if(nums[i]-1 == nums[i-1]) count++;
            else if(nums[i]!=nums[i-1]) count = 1;

            max = Math.max(count, max);
        }

        return max;
    }
}