package src.swordMeansOffer;

public class Topic36 {
    private Node pre, head;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        inOrder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    void inOrder(Node cur) {
        if (cur == null)    return;
        inOrder(cur.left);
        if (pre != null)    pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;
        inOrder(cur.right);
    }
}


class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};