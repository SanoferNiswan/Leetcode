class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int max = Integer.MIN_VALUE;
        int prev = values[0]; // consider it as values[0]+0
        for(int j=1;j<n;j++){
            max = Math.max(max,prev+values[j]-j);
            prev = Math.max (prev,values[j]+j);
        }
        return max;
    }
}