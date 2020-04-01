package src.swordMeansOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topic32_1 {
    public int[] levelOrder(TreeNode root) {
        if (root == null)
            return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        queue.offer(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            list.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            res.add(level);
        }
        return res;
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean zigzag = false;
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < cnt; i++) {
                 TreeNode node = queue.poll();
                 if (zigzag)
                    level.add(0, node.val);
                 else
                     level.add(node.val);
                 if (node.left != null)
                     queue.add(node.left);
                 if (node.right != null)
                     queue.add(node.right);
            }
            res.add(level);
            zigzag = !zigzag;
        }
        return res;
    }
}
