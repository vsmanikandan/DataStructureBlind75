package problems.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepth {
        public int calcMaxDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int leftDepth = calcMaxDepth(root.left);
            int rightDepth = calcMaxDepth(root.right);

            return 1+Math.max(leftDepth, rightDepth);
        }

        public int maxDepthQue(TreeNode root) {
            if(root == null) {
                return 0;
            }
            Queue<TreeNode> tq = new LinkedList<>();
            int depth = 0;
            tq.offer(root);
            while (!tq.isEmpty()) {
                    TreeNode currentNode = tq.poll();
                int levelSize = tq.size();
                for (int i=0; i < levelSize; i++) {
                    if (currentNode.left != null) {
                        tq.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        tq.offer(currentNode.right);
                    }
                }
                depth++;
            }
            return depth;
        }
}
