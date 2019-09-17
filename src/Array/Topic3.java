package Array;

import java.util.HashMap;

/**
 *Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Topic3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return -1;
        if (s.length() == 0)
            return 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0,j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //if you don't understand this, please input "tmsmfdut"
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Topic3().lengthOfLongestSubstring("bbbbbb"));
    }
}
