class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums) s.add(i);
        return nums.length!=s.size();
    }
}