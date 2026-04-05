class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c=='{' || c=='(' || c=='[') st.push(c);
            else{
                if(st.size()==0 || ((c=='}' && st.pop()!='{') || (c==']' && st.pop()!='[') || (c==')' && st.pop()!='('))) return false;
            }
        }
        return st.size()==0;
    }
}