package src.swordMeansOffer;

/**
 * 替换空格
 */
public class Topic05 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0)  return new String();
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ')   res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
