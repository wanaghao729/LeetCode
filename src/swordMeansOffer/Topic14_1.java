package src.swordMeansOffer;

/**
 * 剪绳子
 */
public class Topic14_1 {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        int res = 0;
        if (b == 0) res = (int)Math.pow(3, a);
        if (b == 1) res = (int)Math.pow(3, a - 1) * 4;
        if (b == 2) res = (int)Math.pow(3, a) * 2;
        return res;
    }
}
