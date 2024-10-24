/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} k
 * @return {number}
 */
var kthSmallest = function(root, k) {

    current = root;
    ans=[];

    function traverse(root){
        if(root == null) return;
        traverse(root.left);
        ans.push(root.val);
        traverse(root.right);
    }

    traverse(current);

    return ans[k-1];
    
};