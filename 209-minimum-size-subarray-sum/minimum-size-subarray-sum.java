class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, minLength = nums.length + 1, sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        return minLength == nums.length+1? 0 : minLength;
    }
}