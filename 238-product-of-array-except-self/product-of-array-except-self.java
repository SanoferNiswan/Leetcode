class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];

        for(int i=0;i<n;i++){
            pref[i] = i==0? 1 : (pref[i-1]*nums[i-1]);
            suff[n-i-1] = i==0? 1: (suff[n-i]*nums[n-i]);
        }

        for(int i=0;i<n;i++){
            pref[i]*=suff[i];
        }

        return pref;
    }
}