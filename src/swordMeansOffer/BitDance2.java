package src.swordMeansOffer;

public class BitDance2 {

    public boolean checkPalindrome(String str) {
        if (str.length() < 2)
            return true;
        if (str.length() % 2 == 1) {
            for (int i  = 0; i < str.length()-1; i++) {
                if (extendPalindrome(str, i, i))
                    return true;
            }
        } else {
            for (int i  = 0; i < str.length()-1; i++) {
                if (extendPalindrome(str, i, i+1))
                    return true;
            }
        }
        return false;
    }

    private boolean extendPalindrome(String s, int j, int k) {
        while (s.charAt(j) == s.charAt(k)) {
            if (j == 0) {
                j = s.length();
            }
            if (k == s.length() - 1) {
                k = -1;
            }
            if (j == k) return true;
            j--;
            k++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new BitDance2().checkPalindrome("aabaacccc"));
        System.out.println(new BitDance2().checkPalindrome("ab"));
    }
}
