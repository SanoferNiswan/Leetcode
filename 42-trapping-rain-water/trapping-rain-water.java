class Solution {
    public int trap(int[] height) {
        int water = 0;
        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0 ; i < height.length ; i++){
            while(!st.isEmpty() && height[st.peek()] < height[i]){
                int mid = st.pop();

                if(st.isEmpty()) break; // no left index found

                int left = st.peek();
                int right = i;
                int width = right - left - 1;
                int h = Math.min(height[left], height[right]) - height[mid];

                water+=h*width; 
            }

            st.push(i);
        }

        return water;
    }
}