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
var replaceValueInTree = function(root) {
    root.val=0;
    dfs([root]);

    return root;

    function dfs(arr){
        if(arr.length==0) return;

        sum=0;
        for(let node of arr){
            if(!node) continue;
            if(node.left) sum+=node.left.val;
            if(node.right) sum+=node.right.val; 
        }

        cursum=0;
        childarr=[];

        for(let node of arr){

            if(node.left) cursum+=node.left.val;
            if(node.right) cursum+=node.right.val;

            if(node.left){
                node.left.val=sum-cursum;
                childarr.push(node.left);
            }
            if(node.right){
                node.right.val=sum-cursum;
                childarr.push(node.right);
            }

            cursum=0;

        }

        dfs(childarr);
    }
};