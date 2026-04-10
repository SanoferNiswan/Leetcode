class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007, n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for(int i=n-1; i >= 0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long res = 0;

        for(int i = 0 ; i < n ; i++){
            int leftLen = i - left[i];
            int rightLen = right[i] - i;

            long contribution = (long) arr[i] * leftLen * rightLen;
            res = ( res + contribution ) % mod;
        }

        return (int)res;
    }
}