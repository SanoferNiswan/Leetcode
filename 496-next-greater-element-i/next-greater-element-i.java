class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        Stack<Integer> st = new Stack<Integer>();

        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                m.put(st.pop(),num);
            }

            st.push(num);
        }

        int[] res = new int[nums1.length];
        int i = 0;
        for(int num:nums1){
            res[i++] = m.getOrDefault(num,-1);
        }

        return res;
    }
}