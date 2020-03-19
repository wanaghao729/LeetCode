package src.leetcode_cn;

import java.util.Map;
import java.util.stream.Collectors;

public class Topic09 {
    // 构造最长回文字符串
    public int longestPalindrome(String s) {
        int[] cnt = new int[58];

        for (char c : s.toCharArray())
            cnt[c - 'A'] += 1;

        int ans = 0;

        for (int val : cnt)
            ans += val - (val & 1);

        return ans < s.length() ? ans + 1 : ans;
    }

    public int longestPalindrome1(String s) {
        Map<Integer, Integer> count = s.chars().boxed()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));
        int ans = count.values().stream().mapToInt(i -> i - (i & 1)).sum();
        return ans < s.length() ? ans + 1 : ans;
    }
}
