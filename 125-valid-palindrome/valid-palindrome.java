class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int left =0, right=sb.length()-1;
        while(left<right){
            if(sb.charAt(left++)!=sb.charAt(right--)) return false;
        }

        return true;
    }
}