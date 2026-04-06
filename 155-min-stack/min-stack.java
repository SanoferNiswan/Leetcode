class MinStack {
    Stack<Integer> s, st = new Stack<Integer>();
    public MinStack() {
        s = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(st.isEmpty() || st.peek()>=val) st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty() && s.peek().equals(st.peek())) st.pop();
        s.pop();
    }
    
    public int top() {
        return s.isEmpty() ? -1 : s.peek();
    }
    
    public int getMin() {
        return st.isEmpty() ? -1 : st.peek();
    }
}