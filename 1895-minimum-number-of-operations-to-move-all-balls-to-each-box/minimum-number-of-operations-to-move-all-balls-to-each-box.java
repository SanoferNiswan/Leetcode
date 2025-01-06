class Solution {
    public int[] minOperations(String boxes) {

        int ans[] = new int[boxes.length()];
        int ops = 0 , count = 0;

        for(int i = 0 ; i < boxes.length() ; i++){
            ans [i] = ops;
            count+=boxes.charAt(i)=='1'?1:0;
            ops+=count;
        }

        ops = 0;
        count = 0;

        for(int i = boxes.length()-1 ; i >= 0 ; i--){
            ans[i]+=ops;
            count+=boxes.charAt(i)=='1'?1:0;
            ops+=count;
        }

        return ans;
    }
}
