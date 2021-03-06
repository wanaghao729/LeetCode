package src.Array;

/**
 *You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add
 * the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Topic2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }

            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            // 逆序输出
            d.next = new ListNode(sum % 10);
            d = d.next;

            // 顺序输出
//            d = sentinel.next;
//            sentinel.next = new ListNode((sum % 10));
//            sentinel.next.next = d;

        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        d = sentinel;
        sentinel = d.next;
        d.next = null;
        return sentinel;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode tmp = new Topic2().addTwoNumbers(l1, l2);
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
}
