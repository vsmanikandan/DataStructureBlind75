package problems.binarytree;


public class ValidateBST {

    public boolean isValid(TreeNode node, long min, long max) {
        if(node == null) {
            return true;
        }
        if(node.val <= min || node.val >=max) {
            return false;
        }
        return isValid(node.left, min, node.val) &&
                isValid(node.right, node.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        ValidateBST v = new ValidateBST();
        System.out.println(v.isValidBST(root));
    }

}
