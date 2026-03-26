class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(0,1);
        int pref = 0, count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            pref += nums[i];
            int rem = ((pref % k) + k) % k;
            if(m.containsKey(rem)){
                count+=m.get(rem);
            }

            m.put(rem, m.getOrDefault(rem,0)+1);
        }
        return count;
    }
}