class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        if(root.left==null && root.right==null){
            if(root.val == targetSum) return true;
        }

        int remaining = targetSum - root.val;

        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }
}