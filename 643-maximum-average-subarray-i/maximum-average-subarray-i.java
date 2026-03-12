class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        double maxAvg = -Double.MAX_VALUE;
        while(i<nums.length-k+1){
            int sum = 0,j = 0;
            while(j<k){
                sum+=nums[i+j];
                j++;
            }
            maxAvg = Math.max((double)sum/k,maxAvg);
            i++;
        }
        return maxAvg;
    }
}