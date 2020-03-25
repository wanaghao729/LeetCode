package src.swordMeansOffer;

/**
 * 镜像树 本质上是先序遍历,交换左右子树
 */
public class Topic27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)   return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
