class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0, right = 0, ind = 0;
        int temp[] = new int[nums1.length+nums2.length];
        while(left<nums1.length && right < nums2.length){
            if(nums1[left]>=nums2[right]) temp[ind++] = nums2[right++];
            else temp[ind++] = nums1[left++];
        }
        while(left<nums1.length) temp[ind++] = nums1[left++];
        while(right<nums2.length) temp[ind++] = nums2[right++];

        int n = temp.length;
        if(n%2!=0) return temp[n/2];
        else return (double)(temp[n/2 - 1]+temp[n/2])/2;
    }
}