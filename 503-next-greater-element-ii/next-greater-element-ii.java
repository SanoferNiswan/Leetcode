class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        int n = nums.length;

        int[] res = new int[n];
        Arrays.fill(res, -1);

        for(int i = 0; i < n*2 ; i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i%n]){
                res[st.pop()] = nums[i%n];
            }

            if(i < n) st.push(i); // only during first pass we can mark not found data
        }

        return res;
    }
}