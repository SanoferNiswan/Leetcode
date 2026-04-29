public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    public void buildString(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        buildString(root.left, sb);
        buildString(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(s));
        return buildTree(q);
    }

    public TreeNode buildTree(Queue<String> q){
        String curr = q.poll();

        if(curr.equals("null")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(curr));
        node.left = buildTree(q);
        node.right = buildTree(q);

        return node;
    }
}