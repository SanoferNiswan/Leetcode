class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<Integer,Integer>();
        m.put(0, 1);
        int count = 0, pref = 0;
        for(int i = 0 ; i < nums.length ; i++){
            pref+=nums[i];
            int rem = pref - k;
            if(m.containsKey(rem)) count+=m.get(rem);

            m.put(pref, m.getOrDefault(pref,0)+1); 
        }
        return count;
    }
}