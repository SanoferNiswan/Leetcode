class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<Character>();
        for(char c:num.toCharArray()){

            while(k>0 && !st.isEmpty() && st.peek()>c){
                st.pop();
                k--;
            }

            st.push(c);
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();
        for(char c:st) res.append(c);

        int i=0;
        while(i<res.length() && res.charAt(i)=='0') i++;

        String result = res.substring(i);

        return result.length()==0?"0": result;
    }
}