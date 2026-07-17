package problems.binarytree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreePOINO {

    private int preIndex = 0;
    Map<Integer, Integer> indexMap = new HashMap<>();

    private TreeNode buildTree(int[] preOrder, int[] inOrder) {
        for(int i=0;i<inOrder.length; i++) {
            indexMap.put(inOrder[i], i);
        }

        return constructTree(preOrder, 0, inOrder.length-1);

    }

    private TreeNode constructTree(int[] preOrder, int left, int right) {
        if(left>right) {
            return null;
        }
        int rootVal = preOrder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int mid = indexMap.get(rootVal);
        root.left = constructTree(preOrder, left, mid-1);
        root.right = constructTree(preOrder, mid+1, right);
        return root;
    }


}
