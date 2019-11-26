package src.Array;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * 28. Implement strStr()
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class Topic28 {
    public int strStr(String haystack, String needle) {
        char[] target = needle.toCharArray();
        char[] source = haystack.toCharArray();
        if (target.length == 0) return 0;
        char first = target[0];
        int max = source.length - target.length;
        for (int i = 0; i <= max; i++) {
            if (source[i] != first) {
                while (++i <= max && source[i] != first);
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + target.length -1;
                for (int k = 1; j < end && source[j] == target[k]; j++, k++);

                if (j == end) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Topic28().strStr("hello", "ll"));
    }
}
