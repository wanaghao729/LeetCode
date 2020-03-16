package src.getOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 逆序输出链表
 */
public class Topi03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (listNode == null)   return arr;
        ListNode node = listNode;
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            int val = stack.pop();
            arr.add(val);
        }
        return arr;
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

