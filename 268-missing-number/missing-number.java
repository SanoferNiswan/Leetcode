class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = 0, actualSum = 0;
        for(int num:nums) actualSum+= num;
        for(int i=0;i<=nums.length;i++) expectedSum+=i;

        return expectedSum-actualSum;
    }
}