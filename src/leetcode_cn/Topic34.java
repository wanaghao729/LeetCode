package src.leetcode_cn;


import java.util.LinkedList;
import java.util.List;

public class Topic34 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        preOrder(root, sum);
        return res;
    }

    private void preOrder(TreeNode root, int target) {
        if (root == null)   return;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null)
            res.add(new LinkedList<>(path));
        preOrder(root.left, target);
        preOrder(root.right, target);
        path.removeLast();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {this.val = val;}
}