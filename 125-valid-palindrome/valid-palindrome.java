class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder processed = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                processed.append(Character.toLowerCase(c));
            }
        }
        int left = 0, right = processed.length()-1;
        while(left<right){
            if(processed.charAt(left) != processed.charAt(right)) return false;
            left++; right--;
        }

        return true;
    }
}