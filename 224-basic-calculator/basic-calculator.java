class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<Integer>();
        int sign = 1, curr = 0 , res = 0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) curr = (curr*10)+(c-'0');
            else if(c=='+'){
                res+=curr*sign;
                curr = 0;
                sign = 1;
            }else if(c=='-'){
                res+=curr*sign;
                curr = 0;
                sign = -1;
            }else if(c=='('){
                st.push(res);
                st.push(sign);
                curr = 0;
                res = 0;
                sign = 1;
            }else if(c==')'){
                res+=curr*sign;
                res*=st.pop();
                res+=st.pop();
                curr=0;
            }
        }

        return res+=sign*curr;
    }
}