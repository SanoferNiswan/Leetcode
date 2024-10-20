class Solution {
    public boolean parseBoolExpr(String e) {
        Stack<Character> st=new Stack<>();
        int n=e.length();
        for(char ch:e.toCharArray()){
            if(ch==',' || ch=='(') continue;
            if(ch=='!' || ch== '&' || ch=='|' || ch=='t' || ch=='f'){
                st.push(ch);
            }
            else if(ch==')')
            {
                boolean hastrue=false,hasfalse=false;
                while(st.peek()!='!' && st.peek()!='&' && st.peek()!='|'){
                    char top=st.pop();
                    if(top=='t') hastrue=true;
                    if(top=='f') hasfalse=true;
                }
                char op=st.pop();
                if(op=='!'){
                    st.push(hastrue?'f':'t');
                }
                if(op=='&'){
                    st.push(hasfalse?'f':'t');
                }
                if(op=='|'){
                    st.push(hastrue?'t':'f');
                }
            }
        }
        return st.pop()=='t';
        }
    }