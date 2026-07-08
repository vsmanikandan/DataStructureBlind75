package problems.binarytree;

public class KthMinimumIOT {

    public int count = 0;
    public int answer = 0;

    public int returnElement(TreeNode root, int k) {
        isCount(root, k);
        return answer;
    }

    public void  isCount(TreeNode node , int k) {
        if(node == null)
            return;
        isCount(node.left, k);
        count++;

        if(count == k) {
            answer = node.val;
            return;
        }

        isCount(node.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);

        KthMinimumIOT k = new KthMinimumIOT();
        System.out.println(k.returnElement(root, 6));
    }

}
