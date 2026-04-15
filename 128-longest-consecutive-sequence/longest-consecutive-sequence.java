class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int num:nums) s.add(num);
        int max = 0;

        for(int num:s){
            if(!s.contains(num-1)){
                int curr = num, count = 1;
                while(s.contains(curr+1)){
                    count++;
                    curr++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}