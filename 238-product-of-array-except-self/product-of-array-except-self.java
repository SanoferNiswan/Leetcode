class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n];
        pref[0] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        int suff = 1;

        for(int i = n-2; i >= 0 ;i--){
            pref[i]*= suff*nums[i+1];
            suff*=nums[i+1];
        }

        return pref;
    }
}