class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq = new int[26];
        for(char c:s1.toCharArray()) freq[c-'a']++;

        int k = s1.length();
        int left = 0, right = 0, count = k;
        while(right<s2.length()){
            char curr = s2.charAt(right);

            if(freq[curr-'a']>0) count--;
            freq[curr-'a']--;
            right++;

            if(count==0) return true;

            if(right-left>=k){
                char l = s2.charAt(left);
                if(freq[l-'a']>=0) count++;
                freq[l-'a']++;
                left++;
            }
        }

        return false;
    }
}