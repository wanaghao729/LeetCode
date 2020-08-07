package src.leetcode_cn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 *  
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 50000
 */
public class Topic50 {
    public char firstUniqChar(String s) {
        char res = ' ';
        if (s == null || s.length() == 0)   return res;
        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            map.put(c, !map.containsKey(c));
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }
}
