class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count = 0 , pref = 0;
        hm.put(0,1);
        for(int i = 0 ; i < nums.length ; i++){
            pref+=nums[i];
            if(hm.containsKey(pref - k)){
                count+=hm.get(pref-k);
            }

            hm.put(pref, hm.getOrDefault(pref, 0)+1);
        }

        return count;
    }
}