class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = 0; suff[n-1] = 0;
        for(int i=0;i<n;i++){
            if(i!=0) pref[i] = nums[i-1]+ pref[i-1];
            if(i!=0) suff[n-i-1] = suff[n-i]+nums[n-i];
        }

        for(int i=0;i<n;i++) if(pref[i]==suff[i]) return i;

        return -1;
    }
}