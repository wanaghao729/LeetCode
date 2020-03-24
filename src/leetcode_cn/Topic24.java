package src.leetcode_cn;


import java.util.List;

/**
 * 反转链表
 */
public class Topic24 {
    public ListNode reverseList(ListNode head) {
        if (head == null)   return null;
        ListNode first = new ListNode(0);
        ListNode node = head, next = node.next;
        while (node != null) {
            node.next = first.next;
            first.next = node;
            node = next;
            next = node == null ? null : node.next;
        }
        return first.next;
    }



    public List search(int[] arr) {
        int[] index = new int[arr.length];
        int max = arr[0];
        int maxIndex = 0;
        index[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                index[i] = -1;
                maxIndex = i;
                max = arr[i];
            } else if (max == arr[i]) {

            } else {

            }
        }
        return null;
    }

    // 比较电话号码
    public String compare(String num1, String num2) {
        return null;
    }

    private int[] longDump(String num) {
        int maxlen = 0;
        int dump = 0;
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1))
                maxlen++;
            if (num.charAt(i) != num.charAt(i - 1)) {}

        }
        return null;
    }

}
