class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int ways[] = new int[high+1];
        ways[0]=1;
        int mod = 1000000007;
        for( int i = 0 ; i <= high ; i++ ){
            if(ways[i] == 0 ) continue;
            if(i+zero<=high){
                ways[i+zero] = (ways[i+zero] + ways[i] )% mod;
            }
            if(i+one<=high){
                ways[i+one] = (ways[i+one] + ways[i] ) % mod ;
            }
        }

        int count = 0 ;

        for(int i = low ; i <= high ; i++){
            count = ( count + ways [i] ) % mod ;
        }
        return count;
    }
}