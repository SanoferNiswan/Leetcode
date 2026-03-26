class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int pref = 0, count = 0;
        m.put(0,1);
        for(int i=0;i<nums.length;i++){
            pref+=nums[i];
            int rem = pref - goal;
            if(m.containsKey(rem)){
                count+=m.get(rem);
            }

            m.put(pref, m.getOrDefault(pref, 0)+1);
        }

        return count;
    }
}