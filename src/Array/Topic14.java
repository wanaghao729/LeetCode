package src.Array;

/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 */
public class Topic14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)   return "";
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (!strs[i].startsWith(pre))
                pre = pre.substring(0, pre.length()-1);
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] s = {"dog","racecar","car"};
        System.out.println(new Topic14().longestCommonPrefix(s));
    }
}
