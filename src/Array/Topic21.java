package src.Array;

/**
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * merge sort
 */
public class Topic21 {
    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode start = new ListNode(0);
        ListNode index = start;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                index.next = l1;
                l1 = l1.next;
            } else {
                index.next = l2;
                l2 = l2.next;
            }
            index = index.next;
        }
        index.next = l1 == null ? l2 : l1;
        return start.next;
    }
    //迭代
    public ListNode mergeTwoListRecursive(ListNode l1, ListNode l2) {
       if (l1 == null)  return l2;
       if (l2 == null)  return l1;
       if (l1.val < l2.val) {
           l1.next = mergeTwoListRecursive(l1.next, l2);
           return l1;
       } else {
           l2.next = mergeTwoListRecursive(l1, l2.next);
           return l2;
       }
    }
}
