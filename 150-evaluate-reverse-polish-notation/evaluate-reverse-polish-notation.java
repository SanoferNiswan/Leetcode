class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        int op2 = 1;
        for(String t:tokens){
            switch(t){
                case "+":
                  s.push(s.pop()+s.pop());
                  break;
                case "-":
                  op2 = s.pop();
                  s.push(s.pop() - op2);
                  break;
                case "*":
                  s.push(s.pop()*s.pop());
                  break;
                case "/":
                  op2 = s.pop();
                  s.push(s.pop()/op2);
                  break;
                default:
                  s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }
}