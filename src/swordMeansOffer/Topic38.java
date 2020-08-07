package src.swordMeansOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Topic38 {

    public String[] permutation(String s) {
        char[] c = s.toCharArray();
        List<StringBuilder> ans = new LinkedList<>();
        backtrack(ans, new StringBuilder(), c);
        String[] res = new String[ans.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = ans.get(i).toString();
        return res;
    }

    private void backtrack(List<StringBuilder> list, StringBuilder temp, char[] cs) {
        if (temp.length() == cs.length)
            list.add(new StringBuilder(temp));
        else {
            for (int i = 0; i < cs.length; i++) {
                int index = temp.indexOf(String.valueOf(cs[i]));
                if (temp.indexOf(String.valueOf(cs[i])) != -1) continue; // element already exists, skip
//                if (temp.indexOf(String.valueOf(cs[i])) != -1) continue; // element already exists, skip
                temp.append(cs[i]);
                backtrack(list, temp, cs);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        for (String sb : new Topic38().permutation("abb")) {
            System.out.println(sb);
        }
    }
}
