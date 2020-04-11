package src.Array;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * For example, given
 *
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class Topic105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return reConstructBinaryTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode reConstructBinaryTree(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn) {
        if (startIn > endIn || startIn > endIn)
            return null;

        TreeNode root = new TreeNode(preorder[startPre]);

        for (int i = startIn; i <= endIn; i++) {
            if (preorder[startPre] == inorder[i]) {
                root.left = reConstructBinaryTree(preorder, startPre + 1, startPre + (i - startIn), inorder, startIn, i - 1);
                root.right = reConstructBinaryTree(preorder, startPre + (i - startIn) + 1, endPre, inorder, i + 1, endIn);
            }
        }
        return root;
    }
}
