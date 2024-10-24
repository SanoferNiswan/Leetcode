/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // Base cases
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        
        // Check both regular and flipped configurations
        boolean regular = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        boolean flipped = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        
        return regular || flipped;
    }
}