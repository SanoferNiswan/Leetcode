class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<Integer>();
        int maxArea = 0;

        for(int i = 0 ; i <= heights.length ; i++){
            int currHeight = i==heights.length ? 0 : heights[i];
            
            while(!st.isEmpty() && heights[st.peek()] > currHeight){
                int height = heights[st.pop()];

                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                int width = right - left - 1;

                maxArea = Math.max(maxArea, height*width);
            }

            st.push(i);
        }
        
        return maxArea;
    }
}