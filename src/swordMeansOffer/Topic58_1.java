package src.swordMeansOffer;

public class Topic58_1 {
    public String reverseWords(String s) {
        s = s.trim();
        int right = s.length() - 1;
        int left = right;
        StringBuilder res = new StringBuilder();
        while (left >= 0) {
            while (left >= 0 && s.charAt(left) != ' ')  left--;
            res.append(s.substring(left + 1, right + 1) + " ");
            while (left >= 0 && s.charAt(left) == ' ')  left--;
            right = left;
        }

        return res.toString().trim();
    }
}
