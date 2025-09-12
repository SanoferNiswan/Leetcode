class Solution {
    public boolean doesAliceWin(String s) {
        int n=s.length();
        int vowelCount=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'){
                vowelCount+=1;
            }
        }
        if(vowelCount==0) return false;
        return true;
    }
}