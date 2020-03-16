package src.Array;

import java.util.*;

/**
 * 49. Group Anagrams
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class Topic49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> words = new HashMap<>();
        for (String s : strs) {
            char[] sig = s.toCharArray();
            Arrays.sort(sig);
            String tmp = String.valueOf(sig);
            if (words.containsKey(tmp)) {
               words.get(tmp).add(s);
            }
            else {
                List<String> l = new ArrayList<>();
                l.add(s);
                words.put(tmp, l);
            }
        }
        List<List<String>> out= new ArrayList<>();
        for (String s : words.keySet())
            out.add(words.get(s));
        return out;
    }
}
