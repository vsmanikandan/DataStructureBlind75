package problems.binarytree;

public class SerializeAndDeserialize {

    private int index = 0;

    public String serilizeTree(TreeNode rootNode) {
        StringBuilder sb = new StringBuilder();
        expandTree(rootNode, sb);
        return sb.toString();
    }

    private void expandTree(TreeNode node, StringBuilder sb) {
        if(node == null) {
            sb.append("N,");
        }
        sb.append(node.val).append(",");
        expandTree(node.left, sb);
        expandTree(node.right, sb);
    }

    public TreeNode deserilizeString(String s) {
        String[] vals = s.split(",");
        index = 0;
        return splitToTree(vals);
    }

    private TreeNode splitToTree(String[] vals) {
        if(vals[index].equals("N")) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(vals[index]));
        index++;
        node.left = splitToTree(vals);
        node.right = splitToTree(vals);

        return node;
    }
}
