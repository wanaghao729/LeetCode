package src.swordMeansOffer;

/**
 * 查看序列是不是搜索二叉树的后序遍历
 */
public class Topic33 {
    public boolean verifyPostorder(int[] postorder) {
        return recurVerify(postorder, 0, postorder.length - 1);
    }

    /**
     *
     * @param postorder
     * @param i
     * @param j 根节点
     * @return
     */
    private boolean recurVerify(int[] postorder, int i, int j ) {
        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p; // [i, m -1]代表左子树 [m, j- 1]代表右子树
        while (postorder[p] > postorder[j]) p++;
        return p == j && recurVerify(postorder, i, m - 1) && recurVerify(postorder, m, j - 1);
    }
}
