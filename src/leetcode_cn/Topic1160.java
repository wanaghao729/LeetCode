package src.leetcode_cn;

import java.util.HashMap;
import java.util.Map;

public class Topic1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        int res = 0;
        count(chars, map);
        for (String s : words) {
            count(s, map1);
            if (contains(map, map1))
                res += s.length();
            map1.clear();
        }
        return res;
    }

    private void count(String s, Map<Character, Integer> map) {
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int tmp = map.get(c) + 1;
                map.put(c, tmp);
            } else {
                map.put(c, 1);
            }
        }
    }

    private boolean contains(Map<Character, Integer> map, Map<Character, Integer> map1) {
        boolean flag = false;
        for (char key : map1.keySet()) {
            if (map.containsKey(key) && map.get(key) >= map1.get(key))
                flag = true;
            else {
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        new Topic1160().countCharacters(new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"},
        "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp");
    }
}
