class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0 , high = 0;
        for(int num:nums){
            low = Math.max(low, num);
            high+=num;
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(splits(nums, mid) > k) low = mid+1;
            else high = mid - 1;
        }

        return low;
    }

    public int splits(int[] nums, int mid){
        int split = 1, pages = 0;
        for(int num : nums){
            if(pages+num > mid){
                pages = num;
                split++;
            }else{
                pages+=num;
            }
        }

        return split;
    }
}