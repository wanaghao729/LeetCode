package src.leetcode_cn;

/**
 * 压缩字符串
 */
public class Topic01_06 {
    public String compressString(String S) {
        int N = S.length();
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < N) {
            int j = i;
            while (j < N && S.charAt(j) == S.charAt(i)) {
                j++;
            }
            res.append(S.charAt(i));
            res.append((char)j - i);
            i = j;
        }

        if (res.length() < N)
            return res.toString();
        else
            return S;
    }
}
