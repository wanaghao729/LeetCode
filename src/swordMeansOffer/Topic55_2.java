package src.swordMeansOffer;

/**
 * 是否为平衡树
 */
public class Topic55_2 {
    public boolean isBalanced(TreeNode root) {
        return postOrder(root) != -1;
    }

    private int postOrder(TreeNode root) {
        if (root == null)   return 0;
        int left = postOrder(root.left);
        if (left == -1) return -1;
        int right = postOrder(root.right);
        if (right == -1)    return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
