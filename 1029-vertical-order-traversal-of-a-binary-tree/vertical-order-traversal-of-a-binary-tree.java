class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes = new ArrayList<>();

        dfs(0, 0, root, nodes);

        nodes.sort((a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0], b[0]);
            if(a[1]!=b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2],b[2]);
        });

        int left = 1;
        List<List<Integer>> result = new ArrayList<>();
        for(int[] node:nodes){
            int col = node[0], val = node[2];
            if(col != left){
                result.add(new ArrayList<Integer>());
                left = col;
            }
            result.get(result.size()-1).add(val);
        }

        return result;
    }

    public void dfs(int col, int row, TreeNode root, List<int[]> nodes){
        if(root==null) return;
        nodes.add(new int[]{col, row, root.val});
        dfs(col-1, row+1, root.left, nodes);
        dfs(col+1, row+1, root.right, nodes);
    }
}