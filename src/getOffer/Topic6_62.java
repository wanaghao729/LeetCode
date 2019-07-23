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


}
