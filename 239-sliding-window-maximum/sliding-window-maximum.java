class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int[] res = new int[nums.length-k+1];
        int indx=0;
        for(int i=0;i<nums.length;i++){

            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){
                res[indx++] = nums[dq.peekFirst()];
            }
        }


        return res;
    }
}