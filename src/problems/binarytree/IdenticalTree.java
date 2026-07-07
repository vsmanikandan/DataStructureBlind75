package problems.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTree {
    public boolean isIdentical(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        if(p==null || q == null) {
            return false;
        }

        if(p.val != q.val) {
            return false;
        }

        return isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }

    public boolean isSame(TreeNode p, TreeNode q) {

        Queue<TreeNode> tq = new LinkedList<>();
        tq.offer(p);
        tq.offer(q);
        while(!tq.isEmpty()) {
            TreeNode first = tq.poll();
            TreeNode second = tq.poll();
            if(first==null && second==null) {
                return true;
            }
            if(first==null || second == null) {
                return false;
            }
            if(first.val != second.val) {
                return false;
            }
            tq.offer(first.left);
            tq.offer(second.left);
            tq.offer(first.right);
            tq.offer(second.right);
        }
        return true;
    }
}
