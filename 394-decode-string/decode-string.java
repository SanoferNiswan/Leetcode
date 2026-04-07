class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<Integer>();
        Stack<StringBuilder> stringStack = new Stack<StringBuilder>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) num = (num*10)+(c-'0');
            else if(c=='['){
                numStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr = new StringBuilder();
            }
            else if(c==']'){
                StringBuilder prev = stringStack.pop();
                int repeat = numStack.pop();

                for(int i = 0 ; i < repeat ; i++){
                    prev.append(curr);
                }

                curr = prev;
            }else{
                curr.append(c);
            }
        }

        return curr.toString();
    }
}