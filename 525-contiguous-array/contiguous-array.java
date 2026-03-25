class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(0,-1);
        int pref = 0, max = 0;

        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i]==1?1:-1;
            pref = pref + num;
            if(m.containsKey(pref)){
                max = Math.max(max, i-m.get(pref));
            }else{
                m.put(pref, i);
            }
        }

        return max;
    }
}