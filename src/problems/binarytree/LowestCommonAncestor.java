package problems.binarytree;

public class LowestCommonAncestor {

    //iterative
    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if(p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if(p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
    //recursion
    public TreeNode findRLCA(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val) {
            return findRLCA(root.left, p, q);
        }
        if(p.val > root.val && q.val > root.val) {
            return findRLCA(root.right, p, q);
        }
        return root;
    }

}
