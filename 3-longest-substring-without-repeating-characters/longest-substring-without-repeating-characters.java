class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, sum =0, left = 0;
        Set<Character> set = new HashSet<Character>();
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            max=Math.max(max,right-left+1);
            set.add(c);
        }

        return max;
    }
}