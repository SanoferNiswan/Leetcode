class Solution {
    public boolean isPalindrome(String s) {
        String alphabets="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",processedString="";
        for(int i=0;i<s.length();i++){
            if(alphabets.contains(String.valueOf(s.charAt(i)))) processedString+=s.charAt(i);
        }

        int left = 0, right = processedString.length()-1;
        processedString = processedString.toLowerCase();
        while(left<right){
            if(processedString.charAt(left) != processedString.charAt(right)) return false;
            left++; right--;
        }

        return true;
    }
}