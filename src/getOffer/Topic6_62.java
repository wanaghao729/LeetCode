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

    private void reConstructBinaryTree(E[] preOrder, E[] inOrder, int length) {
        if (preOrder == null || inOrder == null || length <= 0)
            this.root = null;
        this.root = reConstructBinaryTree(preOrder, 0, length-1, inOrder, 0, length-1);
    }

    private TreeNode<E> reConstructBinaryTree(
            E[] preOrder, int startPre, int endPre, E[] inOrder, int startIn, int endIn
    ) {
//        前序遍历的第一个数字是根结点的值
        E value = preOrder[startPre];
        TreeNode<E> root = new TreeNode<>(value, null, null);
        root.leftChild = null;
        root.rightChild = null;
        if (startPre == endPre) {
            if (startIn == endIn && startPre == startIn)
                return root;
            else
                return null;
        }

//        在中序遍历序列中找到根节点的值
        for (int i= startIn; i <= endIn; i++)
            if (inOrder[i] == preOrder[startPre]) {
                root.leftChild = reConstructBinaryTree(preOrder, startPre+1, startPre+i-startIn, inOrder, startIn, i-1);
                root.rightChild = reConstructBinaryTree(preOrder, i-startIn+startPre+1, endPre, inOrder, i+1, endIn);
            }
            return root;

    }

     public void preOrder(TreeNode<E> root) {
         System.out.println(root.item);
        if (root.leftChild != null)
            preOrder(root.leftChild);
        if (root.rightChild != null)
            preOrder(root.rightChild);
    }
}
