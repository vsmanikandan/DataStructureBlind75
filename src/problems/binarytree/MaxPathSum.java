package problems.binarytree;

public class MaxPathSum {

   int maxSum = 0;

    public int calculateSum(TreeNode root) {
        calcMaxGain(root);
        return maxSum;
    }

    private int calcMaxGain(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftGain = Math.max(calcMaxGain(root.left), 0);
        int rightGain = Math.max(calcMaxGain(root.right), 0);
        int gainSum = root.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, gainSum);
        return root.val+Math.max(leftGain, rightGain);
    }
}
