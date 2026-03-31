class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i:piles) max = Math.max(max, i);

        int low = 1 , high = max;
        while(low <= high){
            int mid = low + (high - low) / 2;

            long hours = calculateHours(piles, mid);

            if(hours > h) low = mid+1;
            else high = mid-1;
            
        }

        return low;
    }

    public long calculateHours(int[] piles, int k){
        long h = 0;
        for(int pile:piles) h+=(pile+k-1)/k;

        return h;
    }
}