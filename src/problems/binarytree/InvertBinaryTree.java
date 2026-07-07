package problems.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if(root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public void levelOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        InvertBinaryTree obj = new InvertBinaryTree();

        /*
                  4
                /   \
               2     7
              / \   / \
             1   3 6   9
        */

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Original Tree (Level Order)");

        obj.levelOrder(root);

        obj.invertTree(root);

        System.out.println("Inverted Tree (Level Order)");

        obj.levelOrder(root);
    }
}
