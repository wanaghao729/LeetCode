package src.Array;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class Topic108 {
    // 其实就是构建一个二叉树树，在这个树中查找任意键值所产生的比较序列和在这组健中使用二分查找所产生的比较序列完全相同。
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return recurBST(nums, 0, nums.length - 1);
    }

    private TreeNode recurBST(int[] nums, int low, int high) {
        if (low > high)
            return null;
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = recurBST(nums, low, mid - 1);
        root.right = recurBST(nums, mid + 1, high);
        return root;
    }
}
