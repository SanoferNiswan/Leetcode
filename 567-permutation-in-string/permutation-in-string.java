class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;

        int freq[] = new int[26];
        for(char c : s1.toCharArray()) freq[c-'a']++;

        int left = 0, right = 0, count = s1.length();

        while(right < s2.length()){
            char curr = s2.charAt(right);

            if(freq[curr-'a'] > 0) count--;

            freq[curr-'a']--;
            right++;

            if(count==0) return true;

            if(right-left == s1.length()){
                curr = s2.charAt(left);
                if(freq[curr-'a']>=0) count++;
                freq[curr-'a']++;
                left++;
            }
        } 
        return false;
    }
}