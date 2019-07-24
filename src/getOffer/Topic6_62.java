package getOffer;

/**
 * 树
 */
public class Topic6_62<E> {

    TreeNode<E> root;

    private static class TreeNode<E> {
        E item;
        TreeNode<E> leftChild;
        TreeNode<E> rightChild;

        TreeNode(E item, TreeNode<E> leftChild, TreeNode<E> rightChild) {
            this.item = item;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    private TreeNode<E> reConstructBinaryTree(E[] preOrder, E[] inOrder, int length) {
        if (preOrder == null || inOrder == null || length <= 0)
            return null;
        return reConstructBinaryTree(preOrder, 0, length-1, inOrder, 0, length-1);
    }

    private TreeNode<E> reConstructBinaryTree(
            E[] preOrder, int startPre, int endPre, E[] inOrder, int startIn, int endIn
    ) {
        E value = preOrder[0];
        this.root = new TreeNode<>(value, null, null);
        this.root.leftChild = null;
        this.root.rightChild = null;
        if (startPre == endPre) {
            if (startIn == endIn && startPre == startIn)
                return root;
            else
                return null;
        }
    }
}
