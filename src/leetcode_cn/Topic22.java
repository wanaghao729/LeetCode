package src.leetcode_cn;

/**
 * 删除倒数K节点
 */
public class Topic22 {
    //删除倒数第K
    public ListNode getKthFromEndK(ListNode head, int k) {
        if (head == null || k < 1)  return head;
        int i = k;
        ListNode slow = head, fast = head, pre = slow;

        while (fast != null && i > 0) {
            fast = fast.next;
            i--;
        }

        if (fast == null)   return head;

        while (fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;
        return head;
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k < 1)  return head;
        int i = k;
        ListNode slow = head, fast = head;

        while (fast != null && i > 0) {
            fast = fast.next;
            i--;
        }

        if (fast == null)   return head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

