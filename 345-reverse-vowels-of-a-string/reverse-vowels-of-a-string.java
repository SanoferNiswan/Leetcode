class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int n = s.length();
        int start=0,end=n-1;
        String vowel = "AEIOUaeiou";

        while(start < end){
            while(start < end && (vowel.indexOf(word[start])==-1)){
                start++;
            }
            while(start < end && (vowel.indexOf(word[end])==-1)){
                end--;
            }
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        
        return new String(word);
    }
}