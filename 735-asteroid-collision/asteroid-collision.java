class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        for (int num : asteroids) {
            if (num >= 0)
                st.push(num);
            else {
                while (!st.isEmpty() && st.peek() > 0 && -num > st.peek()) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == -num)
                    st.pop();
                else if (st.isEmpty() || !(st.peek() > 0))
                    st.push(num);
            }
        }

        int[] res = new int[st.size()];
        int i = 0;
        for (int num : st)
            res[i++] = num;

        return res;
    }
}