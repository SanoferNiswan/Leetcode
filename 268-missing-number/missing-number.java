class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int found = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found=1;
                    break;
                }
            }
            if(found==0) return i;
        }

        return -1;
    }
}