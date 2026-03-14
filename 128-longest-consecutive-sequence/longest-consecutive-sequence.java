class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0, sum =1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else if(nums[i]-1==nums[i-1]){
                sum++;
                max = Math.max(sum, max);
            }else{
                sum=1;
            }
        }

        return nums.length>0 && max==0?1:max;
    }
}