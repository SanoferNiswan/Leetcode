class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, count = 1, n = nums.length;
        for(int j = 0 ; j < nums.length-1 ; j++){
            if(nums[j] == nums [j+1] && count < 2){
                count++;
                nums[i++] = nums[j];
            }
            else if(nums[j] != nums[j+1]){
                count = 1;
                nums[i++] = nums[j];
            }
        }
        nums[i++] = nums[n-1];
        return i;
    }
}