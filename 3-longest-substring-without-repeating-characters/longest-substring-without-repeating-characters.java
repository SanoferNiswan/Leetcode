class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, j=0;
        Map<Character,Integer> m = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(m.containsKey(c)){
                int index = m.get(c);
                while(j<=index) m.remove(s.charAt(j++));
            }else  l = Math.max(i-j+1, l);
            m.put(c,i);
        }
        return l;
    }
}