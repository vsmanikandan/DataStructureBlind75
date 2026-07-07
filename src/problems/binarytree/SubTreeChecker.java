package problems.binarytree;

public class SubTreeChecker {

    public boolean  isSubTree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }
        if(isIdentical(root, subRoot)) {
            return true;
        }
        return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) {
            return true;
        }
        if(r1 == null || r2 == null) {
            return false;
        }

        if(r1.val != r2.val) {
            return false;
        }

        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    }

}
