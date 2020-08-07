package src.leetcode_cn;

import java.util.HashMap;
import java.util.Map;

public class Topic48 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return -1;
        if (s.length() == 0)
            return 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
