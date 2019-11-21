package src.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class Topic22 {
    public List<String> generateParenthesis(int n) {
        if (n > 0) {
            List<String> list = new ArrayList<>();
            backtrack(list, "", 0, 0, n);
            return list;
        } else
            return null;
    }
//    回溯法？
    private void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        for (String s : new Topic22().generateParenthesis(3))
            System.out.println(s);
    }
}
