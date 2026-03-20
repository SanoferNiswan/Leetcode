class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();
        List<Integer> res = new ArrayList<Integer>();
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        Map<Character, Integer> window = new HashMap<Character, Integer>();
        int t = p.length();
        for(int i=0; i<t; i++){
            m.put(p.charAt(i),m.getOrDefault(p.charAt(i),0)+1);
            window.put(s.charAt(i),window.getOrDefault(s.charAt(i),0)+1);
        }
        if(m.equals(window)) res.add(0);

        for(int i=t; i<s.length(); i++){
            char left = s.charAt(i-t), right = s.charAt(i);
            window.put(left,window.get(left)-1);
            if(window.get(left)==0) window.remove(left);
            window.put(right,window.getOrDefault(right, 0)+1);

            if(m.equals(window)) res.add(i-t+1);
        }

        return res;
    }
}