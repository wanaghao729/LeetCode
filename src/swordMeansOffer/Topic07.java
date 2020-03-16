package src.swordMeansOffer;

/**
 * 根据先序和中序构建二叉树
 */
public class Topic07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root =  reConstructBinaryTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] preorder, int startPre, int endPre, int[] inOrder, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(preorder[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (preorder[startPre] == inOrder[i]) {
                root.left = reConstructBinaryTree(preorder, startPre + 1, startPre + (i - startIn), inOrder, startIn, i - 1);
                root.right = reConstructBinaryTree(preorder, startPre + (i - startIn) + 1, endPre, inOrder, i + 1, endIn);
                break;
            }
        }
        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
