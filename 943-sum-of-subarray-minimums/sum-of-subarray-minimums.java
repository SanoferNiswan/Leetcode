class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        int n = arr.length, mod = 1000000007;
        long res = 0;

        for(int i = 0 ; i <= n ; i++){
            int curr = i==n ? 0 : arr[i];

            while(!st.isEmpty() && arr[st.peek()] > curr){
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long contribute = (long)arr[mid] * (left - mid) * (mid - right);
                res = (res + contribute) % mod;
            }

            st.push(i);
        }

        return (int)res;
    }
}