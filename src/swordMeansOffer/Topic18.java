package src.swordMeansOffer;

public class Topic18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = head;
        ListNode current = head;
        if (head.val == val)    return head.next;
        while (current != null && current.val != val) {
            pre = current;
            current = current.next;
        }
        if (current != null)
            pre.next = current.next;
        return head;

    }
}
