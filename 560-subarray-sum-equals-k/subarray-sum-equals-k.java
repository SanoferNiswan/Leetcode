class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(0,1);
        int pref[] = new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=nums[i]+pref[i-1];
            System.out.print(i+":"+pref[i]+" ");
        }

        for(int i=0;i<nums.length;i++){
            if(m.containsKey(pref[i]-k))
                count+=m.get(pref[i]-k);
            m.put(pref[i],m.getOrDefault(pref[i],0)+1);
        }

        return count;
    }
}