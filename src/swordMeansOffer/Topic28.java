package src.swordMeansOffer;

/**
 * 对称树， 跟镜像树差不多
 */
public class Topic28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null)  return true;
        if (left == null || right == null || left.val != right.val) return false;
        return recur(left.left, right.right) && recur(left.right, right.left);
    }
}
