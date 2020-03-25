package src.swordMeansOffer;

/**
 * 合并排序列表
 */
public class Topic25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode tail = first, node1 = l1, node2 = l2;

        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                tail.next = node1;
                node1 = node1.next;
            } else {
                tail.next = node2;
                node2 = node2.next;
            }
            tail = tail.next;
        }

        tail.next = node1 == null ? node2 : node1;
        return first.next;
    }
}
