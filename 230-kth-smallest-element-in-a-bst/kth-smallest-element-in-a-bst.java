class Solution {
    List<Integer> val = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        traverse(root);
        return val.get(k-1);
    }

    public void traverse(TreeNode root){
        if(root==null) return;

        traverse(root.left);
        val.add(root.val);
        traverse(root.right);
    }
}