package src.swordMeansOffer;

public class Topic58_2 {
    public String reverseLeftWords(String s, int n) {
        if (n == 0 || n == s.length())  return s;
        char[] chs = s.toCharArray();
        int i = n;
        int p = n;
        int j = chs.length - p;
        while (i != j) {
            if (i > j) {
                swap(chs, p - i, p, j);
                i -= j;
            }
            else {
                swap(chs, p - i, p + j - i, i);
                j -= i;
            }
        }
        swap(chs, p - i, p, i);
        return new String(chs);
    }
    // 交换x[a...a+m-1]与x[b...b+m-1]
    private void swap(char[] s, int a, int b, int m) {
        for (int i = a; i <= a + m - 1; i++) {
            char tmp = s[i];
            s[i] = s[b + i - a];
            s[b + i - a] = tmp;
        }
    }

    public static void main(String[] args) {
        new Topic58_2().reverseLeftWords("abcdefg", 2);
    }
}
