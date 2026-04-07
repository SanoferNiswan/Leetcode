class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st = new ArrayDeque<Integer>();
        int n = temperatures.length;
        int[] res = new int[n];

        for(int i = 0 ; i < n ; i++){

            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int idx = st.pop();
                res[idx] = i - idx;
            }

            st.push(i);
        }
        return res;
    }
}