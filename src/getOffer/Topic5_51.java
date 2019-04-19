package src.getoffer;

/**
 * 空间复杂度O(n),时间复杂度O(n)
 */
public class Topic5_51 {
    public String ReplaceBlacnk(String originalString) {
        if (originalString == null && originalString.length() < 0)
            return null;
        int numberOfBlank = 0;
        char[] originalc = originalString.toCharArray();
        for (int i = 0; i < originalString.length(); i++) {
            if (originalc[i] == ' ')
                numberOfBlank++;
        }
        if (numberOfBlank == 0)
            return originalString;
        char[] newString = new char[originalString.length() + numberOfBlank * 2];
        int indexOfOriginal = originalString.length() - 1;
        int indexOfNew = newString.length - 1;
        while (indexOfOriginal >= 0 && indexOfNew >= indexOfOriginal) {
            if (originalc[indexOfOriginal] == ' ') {
                newString[indexOfNew--] = '0';
                newString[indexOfNew--] = '2';
                newString[indexOfNew--] = '%';
            }
            else {
                newString[indexOfNew--] = originalc[indexOfOriginal];
            }
            indexOfOriginal--;
        }
        return new String(newString);
    }
    public static void main(String[] args) {
        String ne = new String("wanghao");
        Topic5_51 ts = new Topic5_51();
        String s = ts.ReplaceBlacnk(ne);
        System.out.println(s);
        System.out.println(s == ne);

    }
}
