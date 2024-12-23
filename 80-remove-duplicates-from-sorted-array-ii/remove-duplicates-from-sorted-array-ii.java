class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int x : nums){
            if(j < 2|| nums[j-2] != x){
                nums[j] = x;
                j++;
            }
        }
        return j;
    }
}