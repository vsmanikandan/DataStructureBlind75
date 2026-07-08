package problems.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> findLOT(TreeNode root) {
        List<List<Integer>>  result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> tq = new LinkedList<>();
        tq.offer(root);
        while(!tq.isEmpty()) {
            int size = tq.size();
            List<Integer> vals = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode currentNode = tq.poll();
                vals.add(currentNode.val);
                if(currentNode.left != null) {
                    tq.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    tq.offer(currentNode.right);
                }
            }
            result.add(vals);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        LevelOrderTraversal lot = new LevelOrderTraversal();
        System.out.println(lot.findLOT(root));
    }
}
