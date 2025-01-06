class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int count = 0, ops = 0;
        
        // Left to right pass
        for (int i = 0; i < n; i++) {
            ans[i] = ops;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            ops += count;
        }
        
        count = 0;
        ops = 0;
        
        // Right to left pass
        for (int i = n - 1; i >= 0; i--) {
            ans[i] += ops;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            ops += count;
        }
        
        return ans;
    }
}
