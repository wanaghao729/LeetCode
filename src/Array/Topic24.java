package src.Array;

/**
 * 24. Swap Nodes in Pairs
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 *
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class Topic24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        ListNode dump = new ListNode(1);
        dump.next = head;
        ListNode pre = dump, slow = head, fast = head.next;
        while (fast != null) {
            slow.next = fast.next;
            fast.next = slow;
            pre.next = fast;
            pre = slow;
            slow = slow.next;
            if (slow != null)
                fast = slow.next;
            else
                break;
        }
        return dump.next;
    }

    public ListNode swapPairsRecursive(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode n = head.next;
        head.next = swapPairsRecursive(head.next.next);
        n.next = head;
        return n;
    }
}
