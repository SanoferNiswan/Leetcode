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
 * @return {TreeNode}
 */
var maxDepth=-1;
var result;

var lcaDeepestLeaves = function(root) {
    maxDepth=0,result=0
    dfs(root,0);
    return result;
};

var dfs = function(node,depth){
    if(node==null){
        maxDepth = Math.max(depth,maxDepth);
        return depth;
    }

    let left = dfs(node.left,depth+1);
    let right = dfs(node.right,depth+1);

    if(left==right && left==maxDepth){
        result = node;
    }
    return Math.max(left,right);
}