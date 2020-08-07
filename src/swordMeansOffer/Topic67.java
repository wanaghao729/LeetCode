package src.swordMeansOffer;

public class Topic67 {
    public int strToInt(String str) {
        char[] c = str.trim().toCharArray();
        if (c.length == 0)  return 0;
        long res = 0;
        int i = 1, sign = 1;
        if (c[0] == '-')    sign = -1;
        else if (c[0] != '+')   i = 0;
        for (int j = i; j < c.length; j++) {
            if (c[j] < '0' || c[j] > '9')
                break;
            res = res * 10 + (c[j] - '0');
            if (res > Integer.MAX_VALUE)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return sign * (int)res;
    }
}
