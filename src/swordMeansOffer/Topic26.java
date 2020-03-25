package src.swordMeansOffer;

/**
 * 树的子结构
 */
public class Topic26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private boolean recur(TreeNode a, TreeNode b) {
        if (b == null)  return true;
        if (a == null || a.val != b.val)    return false;
        return recur(a.left, b.left) && recur(a.right, b.right);
    }
}
