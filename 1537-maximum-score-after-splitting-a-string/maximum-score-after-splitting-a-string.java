class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] prefix = new int[n+1];
        for(int i = n-1;i>=0;i--){
            prefix[i] = prefix[i+1] + (s.charAt(i)=='1'?1:0);
        }

        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i = 0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                sum++;
            }
            max=Math.max(sum+prefix[i+1],max);
        }
        return max;
    }
}