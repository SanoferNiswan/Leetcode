class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length()<s1.length()) return false;
        Map<Character, Integer> s1Count = new HashMap<Character, Integer>();
        Map<Character, Integer> s2Count = new HashMap<Character, Integer>();
        int k = s1.length();
        for(int i=0;i<k;i++){
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i),0)+1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i),0)+1);
        }

        for(Map.Entry<Character, Integer> entry : s1Count.entrySet()){
            char curr = entry.getKey();
            if(s1Count.equals(s2Count)) return true;
        }

        for(int i=k;i<s2.length();i++){
            char left = s2.charAt(i-k), right = s2.charAt(i);
            s2Count.put(left, s2Count.get(left)-1);
            if(s2Count.get(left)==0) s2Count.remove(left);
            s2Count.put(right, s2Count.getOrDefault(right,0)+1);

            for(Map.Entry<Character, Integer> entry : s1Count.entrySet()){
                char curr = entry.getKey();
                if(s1Count.equals(s2Count)) return true;
            }
        }
        return false;
    }
}