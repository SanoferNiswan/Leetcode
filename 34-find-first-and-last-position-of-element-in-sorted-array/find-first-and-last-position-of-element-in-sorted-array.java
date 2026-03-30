class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = firstPosition(nums, target);
        res[1] = lastPosition(nums, target);

        if(res[0] == nums.length || nums[res[0]]!= target) return new int[]{-1, -1};

        return res;
    }

    public int firstPosition(int[] nums, int target){
        int low = 0, high = nums.length-1, ans = -1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid]>=target) high = mid-1;
            else low = mid+1;
        }

        return low;
    }

    public int lastPosition(int[] nums, int target){
        int low = 0, high = nums.length-1, ans = -1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid]<=target) low = mid+1;
            else high = mid - 1;
        }

        return high;
    }
}