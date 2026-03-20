class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        String res = "";
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(char c: t.toCharArray()) m.put(c, m.getOrDefault(c,0)+1);

        int left = 0, right = 0, count = t.length();
        int minLength = s.length()+1, start = 0;

        while(right<s.length()){
            char curr = s.charAt(right);
            if(m.containsKey(curr)){
                if(m.get(curr)>0) count--;
                m.put(curr, m.get(curr)-1);
            }

            right++;

            while(count==0){
                if(minLength>(right-left)){
                    minLength = right-left;
                    start = left;
                }

                curr = s.charAt(left);
                if(m.containsKey(curr)){
                    m.put(curr, m.get(curr)+1);
                    if(m.get(curr)>0) count++;
                }

                left++;
            }
        }

        return minLength==s.length()+1? "" : s.substring(start, start+minLength);
    }
}