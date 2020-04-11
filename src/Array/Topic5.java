package Array;

/**
 * Longest Palindromic Substring
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 */
public class Topic5 {
    private int low = 0;
    private int maxlen = 0;
    public String longestPalindrome(String s) {
        //单个字符直接是回文字符串
        if (s.length() < 2)
            return s;
        for (int i  = 0; i < s.length()-1; i++) {
            // length-i < maxlen / 2就没有必要再往下
            if (s.length() - i < maxlen / 2)
                break;
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(low, low + maxlen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxlen < k-j-1) {
            low = j + 1;
            maxlen = k - j - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Topic5().longestPalindrome("aaaaa"));
    }
}
