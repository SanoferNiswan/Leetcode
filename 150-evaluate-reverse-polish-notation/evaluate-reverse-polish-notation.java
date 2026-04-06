class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<String>();
        for(int i=0; i<tokens.length; i++){
            String c = tokens[i];
            if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")){
                int op2 = Integer.parseInt(s.pop());
                int op1 = Integer.parseInt(s.pop());
                if(c.equals("+")) s.push(Integer.toString(op1+op2));
                else if(c.equals("-")) s.push(Integer.toString(op1-op2));
                else if(c.equals("*")) s.push(Integer.toString(op1*op2));
                else if(c.equals("/")) s.push(Integer.toString(op1/op2));
            }else s.push(c);
        }

        return Integer.parseInt(s.pop());
    }
}