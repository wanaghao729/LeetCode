package src.swordMeansOffer;

public class Topic10_2 {
    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int a = 1;
        int b = 2;
        int sum = 0;
        for (int i = 1; i < n; i++) {
             sum = (a + b) % 1000000007;
             a = b;
             b = sum;
        }
        return sum;
    }
}
