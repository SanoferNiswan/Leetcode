class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0, sum =1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]==nums[i-1]){
                max = Math.max(1, max);
                continue;
            }else if(nums[i]-1==nums[i-1]){
                sum++;
                max = Math.max(sum, max);
            }else{
                sum=1;
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}