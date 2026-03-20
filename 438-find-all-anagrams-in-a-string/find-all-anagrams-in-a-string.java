class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if(p.length()>s.length()) return res;

        int freq[] = new int[26];
        for(char c:p.toCharArray()) freq[c-'a']++;

        int left = 0, right = 0,count = p.length();

        while(right < s.length()){
            if(freq[s.charAt(right)-'a'] > 0){
                count--;
            }

            freq[s.charAt(right)-'a']--;
            right++;

            if(count==0) res.add(left);

            if((right-left) == p.length()){
                if(freq[s.charAt(left)-'a']>=0){
                    count++;
                } 
                freq[s.charAt(left)-'a']++;
                
                left++;
            }
        }

        return res;
    }
}