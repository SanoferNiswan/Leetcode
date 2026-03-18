class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0) break; // already sorted --> can't be 0 by upcoming numbers
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int left = i+1, right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right]+nums[i];
                if(sum==0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);

                    l.add(temp);

                    while(left<right && nums[right-1]==nums[right]) right--;
                    while(left<right && nums[left+1]==nums[left]) left++;

                    right--;
                    left++;
                }

                else if(sum<0) left++;
                else right--;
            }
            
        }

        return l;
    }
}