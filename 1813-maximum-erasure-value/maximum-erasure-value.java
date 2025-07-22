class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set set = new HashSet<Integer>();
        int result = 0, currSum = 0, left = 0, right = 0;
        while(right < nums.length){
            while(set.contains(nums[right])){
                currSum-=nums[left];
                set.remove(nums[left++]);
            }
            currSum+=nums[right];
            set.add(nums[right++]);
            result = Math.max(currSum,result);
        }
        return result;
    }
}