package src.swordMeansOffer;

/**
 * 寻找第k大节点
 */
public class Topic54 {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        inOrder(root);
        return res;
    }

    private void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.right);
        if (k == 0) return;
        if (--k == 0)   res = root.val;
        inOrder(root.left);
    }
}
