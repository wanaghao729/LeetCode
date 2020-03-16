package src.swordMeansOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Topic06 {
    public int[] reversePrint(ListNode head) {
        if (head == null)   return new int[0];
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        int i = 0;
        while (node != null) {
            stack.push(node.val);
            i++;
            node = node.next;
        }
        int[] res = new int[i];
        i = 0;
        while (!stack.isEmpty()) {
            res[i] = stack.pop();
            i++;
        }
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        List<Integer> tmp = new ArrayList<>();
        recur(head, tmp);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    private void recur(ListNode head, List<Integer> tmp) {
        if (head == null)   return;
        recur(head.next, tmp);
        tmp.add(head.val);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
