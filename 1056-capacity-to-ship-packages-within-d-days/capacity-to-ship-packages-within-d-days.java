class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int weight : weights){
            low = Math.max(low, weight);
            high+= weight;
        }

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(days(weights, mid) > days) low = mid+1;
            else high = mid-1;
        }

        return low;
    }

    public int days(int[] weights, int capacity){
        int totalDays = 1, calc = 0;
        for(int weight : weights){
            if(calc+weight > capacity){
                totalDays++;
                calc = weight;
            }else{
                calc+=weight;
            }
        }
        return totalDays;
    }
}