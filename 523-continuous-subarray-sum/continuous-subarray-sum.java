class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // if we see same reminder then i+1 --> j valid subarray
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(0,-1);
        int sum = 0, rem = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
            rem = sum % k;

            if(m.containsKey(rem)){
                if(i-m.get(rem)>=2) return true;
            }else m.put(rem, i);

        }

        return false;
    }
}