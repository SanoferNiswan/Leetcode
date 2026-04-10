class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<Integer>();
        int maxArea = 0;

        for(int i = 0 ; i < heights.length ; i++){
            
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int height = heights[st.pop()];

                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                int width = right - left - 1;

                maxArea = Math.max(maxArea, height*width);
            }

            st.push(i);
        }
        int right = heights.length;
        while(!st.isEmpty()){
                int height = heights[st.pop()];

                int left = st.isEmpty() ? -1 : st.peek();
                int width = right - left - 1;

                maxArea = Math.max(maxArea, height*width);
            }

            return maxArea;
    }
}