package src.swordMeansOffer;

/**
 * 约瑟夫环
 */
public class Topic62 {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; i++)
            ans = (ans + m) % i;
        return ans;
    }
}
