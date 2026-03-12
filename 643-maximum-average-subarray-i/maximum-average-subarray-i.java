class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = -Double.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+= nums[i];
        }
        maxAvg = Math.max(maxAvg,(double)sum/k);
        for(int i=k;i<nums.length;i++){
            sum = sum+nums[i]-nums[i-k];
            System.out.println("sum:"+sum);
            maxAvg = Math.max(maxAvg,(double)sum/k);
        }
        return maxAvg;
    }
}